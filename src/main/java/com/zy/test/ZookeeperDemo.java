package com.zy.test;

import com.zy.dao.UserDao;
import com.zy.entity.User;
import org.apache.zookeeper.*;
import org.springframework.http.ResponseEntity;

import javax.ws.rs.core.Response;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * <ul>
 * <li>文件包名 : com.zy.test</li>
 * <li>创建时间 : 2020/8/13 14:49</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 测试和使用关于 zookeeper 等相关知识点的学习和使用.
 *
 * @author zhengyu
 */
public class ZookeeperDemo {

    public static void main(String[] args) throws IOException, InterruptedException, KeeperException {
        String connStr = "127.0.0.1:2181";

        CountDownLatch countDown = new CountDownLatch(1);

        //我知道了，  /top/jinyong 是有一个父级，所以需要有父亲才行
        //String str = "/top/jinyong";
        String str = "/abc/FirstZnode3";

        Watcher watcher = new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                if (event.getState() == Event.KeeperState.SyncConnected) {
                    System.err.println("eventType:" + event.getType());
                    if (event.getType() == Event.EventType.None) {
                        countDown.countDown();
                    } else if (event.getType() == Event.EventType.NodeCreated) {
                        System.out.println("listen:节点创建");
                    } else if (event.getType() == Event.EventType.NodeChildrenChanged) {
                        System.out.println("listen:子节点修改");
                    }
                }
            }
        };

        ZooKeeper zookeeper = new ZooKeeper(connStr, 5000,watcher );
        countDown.await();

        //注册监听,每次都要重新注册，否则监听不到
        zookeeper.exists(str, watcher);

        // 创建节点
        String result = zookeeper.create(str, "一生一世".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println(result);

        Thread.sleep(10);

        // 获取节点
        byte[] bs = zookeeper.getData(str, true, null);
        result = new String(bs);
        System.out.println("创建节点后的数据是:" + result);

        // 修改节点
        zookeeper.setData(str, "I love you".getBytes(), -1);

        Thread.sleep(10);

        bs = zookeeper.getData(str, true, null);
        result = new String(bs);
        System.out.println("修改节点后的数据是:" + result);

        // 删除节点
        //zookeeper.delete("/top/jinyong", -1);
        //System.out.println("节点删除成功");
    }
}
