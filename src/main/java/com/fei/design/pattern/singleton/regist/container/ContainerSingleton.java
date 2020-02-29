package com.fei.design.pattern.singleton.regist.container;

import org.apache.commons.lang3.StringUtils;

import java.util.Hashtable;
import java.util.Map;

/**
 *
 * 容器式单例 HashMap是线程不安全的操作 可以将HashMap替换成Hashtable
 * 或者使用ConcurrentHashMap
 *
 * Hashtable 同步锁 会带来性能问题
 *
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }

  //  private  static Map<String,Object> singletonMap=new HashMap<String, Object>();
  private  static Map<String,Object> singletonMap=new Hashtable<String, Object>();

   // private  static Map<String,Object> singletonMap=new ConcurrentHashMap<String, Object>();

    public static void putInstance(String key,Object instance){
        if(StringUtils.isNotBlank(key) && instance != null){
            if(!singletonMap.containsKey(key)){
                singletonMap.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}
