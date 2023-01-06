
package net.codetojoy;

public interface UserRepo {
    
    boolean validate(String username, String password);
    
    User findUsername(String username);
    
}

