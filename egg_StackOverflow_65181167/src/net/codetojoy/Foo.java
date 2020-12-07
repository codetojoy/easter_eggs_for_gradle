
package net.codetojoy;

public class Foo {
    public String repeat(String s, int n) {
        StringBuilder result = new StringBuilder(s);
        
        for (int i = 1; i <= n; i++) {
            result.append(s);
        }
        
        return result.toString();    
    }
}
