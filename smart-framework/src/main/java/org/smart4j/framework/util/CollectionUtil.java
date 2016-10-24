package org.smart4j.framework.util;

/**
 * Created by Administrator on 10/24/2016.
 */
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

import java.util.Collection;
import java.util.Map;

/**
 * Created by Administrator on 10/23/2016.
 */
public final class CollectionUtil {
    public static boolean isEmpty(Collection<?> collection){
        return CollectionUtils.isEmpty(collection);
    }
    public static boolean isNotEmpty(Collection<?> collection){
        return !isEmpty(collection);
    }
    public static boolean isEmpty(Map<?,?> map){
        return MapUtils.isEmpty(map);
    }
    public static boolean isNotEmpty(Map<?,?> map){
        return !isEmpty(map);
    }
}
