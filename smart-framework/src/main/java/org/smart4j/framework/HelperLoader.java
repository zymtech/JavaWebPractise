package org.smart4j.framework;

import org.smart4j.framework.helper.*;
import org.smart4j.framework.util.ClassUtil;

/**
 * Created by Administrator on 10/25/2016.
 */
public final class HelperLoader {
    public static void init(){
        Class<?>[] classSet = {
                ClassHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classSet){
            ClassUtil.loadClass(cls.getName());
        }
    }

}
