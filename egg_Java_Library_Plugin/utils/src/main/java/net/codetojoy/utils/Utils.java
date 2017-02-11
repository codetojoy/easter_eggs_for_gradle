
package net.codetojoy.utils;

import org.apache.log4j.*;
import org.apache.commons.lang3.StringUtils;

public class Utils {
    private final static Logger logger = Logger.getLogger(Utils.class);

    public boolean safeIsAlphanumeric(String s) {
        boolean result = false;

        if (s != null) {
            result = StringUtils.isAlphanumeric(s);
        }
        
        return result;
    }
}
