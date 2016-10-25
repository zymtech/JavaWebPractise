package org.smart4j.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 10/25/2016.
 */
public final class ReflectionUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReflectionUtil.class);

    // create instance
    public static Object newInstance(Class<?> cls){
        Object instance;
        try{
            instance = cls.newInstance();
        }catch (Exception e){
            LOGGER.error("new instance failure ", e);
            throw new RuntimeException();
        }
        return instance;
    }

    //invoke method
    public static Object invokeMethod(Object obj, Method method, Object... args){
        Object result;
        try{
            method.setAccessible(true);
            result = method.invoke(obj, args);
        } catch (Exception e){
            LOGGER.error(" invoke method failure", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    //set method parameters
    public static void setField(Object obj, Field field, Object value){
        try{
            field.setAccessible(true);
            field.set(obj, value);
        }catch (Exception e){
            LOGGER.error("set field failure", e);
            throw new RuntimeException(e);
        }
    }

}
