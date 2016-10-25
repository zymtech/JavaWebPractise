package org.smart4j.framework.helper;

import com.sun.javafx.sg.BaseNode;
import org.smart4j.framework.util.ReflectionUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 10/25/2016.
 */
public final class BeanHelper {
    /**
     * define Bean mapping(used for storage of mapping
     * relationship between Bean class and Bean instance
     */
    private static final Map<Class<?>, Object> BEAN_MAP =
            new HashMap<Class<?>, Object>();

    static {
        Set<Class<?>> beanClassSet = ClassHelper.getBeanClassSet();
        for (Class<?> beanClass : beanClassSet){
            Object obj = ReflectionUtil.newInstance(beanClass);
            BEAN_MAP.put(beanClass, obj);
        }
    }

    //get Bean mapping
    public static Map<Class<?>, Object> getBeanMap(){
        return BEAN_MAP;
    }

    //get Bean instance
    @SuppressWarnings("unchecked")
    public static <T> T getBean(Class<T> cls){
        if (!BEAN_MAP.containsKey(cls)){
            throw new RuntimeException("can not get bean by class:" + cls);
        }
        return (T) BEAN_MAP.get(cls);
    }
}
