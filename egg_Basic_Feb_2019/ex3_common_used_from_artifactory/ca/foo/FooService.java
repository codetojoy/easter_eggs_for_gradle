
package ca.foo;

import org.apache.commons.lang3.StringUtils;

public class FooService {

    // This is a silly example that exercises both 
    // StringUtils from Apache Commons Lang and
    // ca.foo.common-1.0.0.jar from Artifactory (via ex2 in this project)

    public boolean safeIsAlphanumeric(String s) {
        boolean result = true;

        if (! StringUtils.isBlank(s)) {
            result = new Utils().safeIsAlphanumeric(s);
        }
        
        return result;
    }
}
