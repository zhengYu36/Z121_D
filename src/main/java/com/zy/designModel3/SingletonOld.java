package com.zy.designModel3;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel3</li>
 * <li>创建时间 : 2020/8/24 10:58</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 简单的单例
 * 该例子在多线程情况下很容易出现问题
 * 就算用了锁也容易导致性能亦或是jvm优化导致的问题
 *
 *
 *
 * @author zhengyu
 */
public class SingletonOld {

    static {

    }

    //持有静态，防止被应用，那是不是可以在创建的时候就默认初始化呢
    // 亦或是在 static 方法的时候就执行实例化呢?

    private static SingletonOld instance = null;

    //构造私有的，防止被实例化
    private SingletonOld() {
    }


    public static SingletonOld getInstance(){
        if(instance == null){
            //这样还会导致问题，如果在多线程的情况下，会出现问题的，所以这个不是很推荐的方法
            synchronized (instance){
                if(instance == null){
                    instance = new SingletonOld();
                }
            }

        }
        return instance;
    }
}
