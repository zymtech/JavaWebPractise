package org.smart4j.framework.util;

/**
 * Created by Administrator on 10/24/2016.
 */
import org.apache.commons.lang3.StringUtils;

/**
 * Created by Administrator on 10/23/2016.
 */
public final class StringUtil {
    public static boolean isEmpty(String str){
        if (str != null){
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
