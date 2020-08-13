package com.zy.junit;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * <ul>
 * <li>文件包名 : com.zy.junit</li>
 * <li>创建时间 : 2019/11/1 17:05</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class ArrayTest {

    public static void main(String[] args) throws Exception{

        //通过网络协议进行数据的传递
        RandomAccessFile aFile = new RandomAccessFile("E:/demo.txt", "rw");
        FileChannel inChannel = aFile.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(48);

        int bytesRead = inChannel.read(buf);
        while (bytesRead != -1) {

            System.out.println("Read " + bytesRead);
            buf.flip();

            while(buf.hasRemaining()){
                System.out.print((char) buf.get());
            }

            buf.clear();
            bytesRead = inChannel.read(buf);
        }
        aFile.close();

    }
}
