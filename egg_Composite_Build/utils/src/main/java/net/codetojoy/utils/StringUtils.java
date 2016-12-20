
package net.codetojoy.utils;

public class StringUtils {
    public static final int BUILD_NUMBER = 778;

    public boolean safeIsNotEmpty(String s) {
        boolean result = false;
        
        if ((s != null) && (! s.isEmpty())) {
            result = true;
        }

        return result;
    }
}
