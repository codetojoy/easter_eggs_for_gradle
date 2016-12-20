
package net.codetojoy.service;

import net.codetojoy.utils.StringUtils;

public class EmployeeService {
    public static final int BUILD_NUMBER = 1001;

    private StringUtils stringUtils = new StringUtils();

    public String getBuildInfo() {
        return "service: " + BUILD_NUMBER + " utils: " + StringUtils.BUILD_NUMBER;
    }
    
    public static final String ERROR = "ERROR";

    public String getNameById(String id) {
        String result = ERROR;

        if (stringUtils.safeIsNotEmpty(id)) {
            result = "Wolfgang Mozart";
        }

        return result;
    }
}
