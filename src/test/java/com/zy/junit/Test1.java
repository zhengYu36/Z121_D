package com.zy.junit;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.junit.Test;

public class Test1 {

    @Test
    public void test1() {
        // 0.关于缓存就类似于redis 中关于key,value的存取方式，只不过有的是基于其他语言
        // 这个ehcache 是纯java通过保存到内存中的，所以读取速度会比较快
        // 1.创建缓存管理器
        // 这里获取路径为什么是从根目录开始的哇？
        CacheManager cacheManager = CacheManager.create("./src/main/resources/ehcache.xml");
        //CacheManager cacheManager = CacheManager.create("/ehcache.xml");
        
        // 2. 获取缓存对象
        Cache cache = cacheManager.getCache("HelloWorldCache");
        
        // 3. 创建元素
        Element element = new Element("key1", "value1");
        
        // 4. 将元素添加到缓存
        cache.put(element);
        
        // 5. 获取缓存
        Element value = cache.get("key1");
        System.out.println(value);
        System.out.println(value.getObjectValue());
        
        // 6. 删除元素
        cache.remove("key1");
        
        Person p1 = new Person("小明",18,"杭州");
        Element pelement = new Element("xm", p1);
        cache.put(pelement);
        Element pelement2 = cache.get("xm");
        System.out.println(pelement2.getObjectValue());
        
        System.out.println(cache.getSize());
        
        // 7. 刷新缓存
        cache.flush();
        
        // 8. 关闭缓存管理器
        cacheManager.shutdown();

    }

}
