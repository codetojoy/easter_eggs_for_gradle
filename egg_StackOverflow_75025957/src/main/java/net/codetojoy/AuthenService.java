
package net.codetojoy;

// todo 

class User {}

class UserNotFoundException extends Exception {
    UserNotFoundException(String s) {
        super(s);
    }
}

public class AuthenService {

    private UserRepo userRepo;

    public AuthenService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User authenticate(String username, String password) throws UserNotFoundException {
        User user = null;
        if (userRepo.validate(username, password)) {
            user = userRepo.findUsername(username);
            return user;
        } else {
            throw new UserNotFoundException("User not found!");
        }
    }
}
