package org.smart4j.framework.util;

import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Field;

/**
 * Created by Administrator on 10/25/2016.
 */
public final class ArrayUtil {
    public static boolean isEmpty(Object[] array){
        return ArrayUtils.isEmpty(array);
    }

    public static boolean isNotEmpty(Object[] array){
        return !ArrayUtil.isEmpty(array);
    }
}
