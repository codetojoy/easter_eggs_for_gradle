
package ca.foo;

import org.apache.commons.lang3.StringUtils;

public class Utils {

    public boolean safeIsAlphanumeric(String s) {
        boolean result = false;

        if (s != null) {
            result = StringUtils.isAlphanumeric(s);
        }
        
        return result;
    }
}
