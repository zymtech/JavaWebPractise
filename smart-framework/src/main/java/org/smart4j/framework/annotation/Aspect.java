package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 10/27/2016.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    Class<? extends Annotation> value();
}
