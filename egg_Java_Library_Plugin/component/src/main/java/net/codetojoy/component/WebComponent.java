
package net.codetojoy.component;

import net.codetojoy.utils.Utils;

public class WebComponent {
    public String doHTTPPost(String url, String body) {
        String result = "fake response";

        // silly example 
        boolean tmp = new Utils().safeIsAlphanumeric(body);

        return result;
    }
}
