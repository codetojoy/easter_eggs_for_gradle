
package net.codetojoy.service;

import net.codetojoy.common.UserDto;

import java.util.*;

// This class has some basic fields / methods so that the published jar can be tested.
// The code itself is not interesting. 

public class UserService {
    public String getDtoVersion() {
        return UserDto.VERSION;
    }

    public UserDto getUserById(String id) {
        // just a silly example to add some body to the class
        UserDto userDto = new UserDto();

        userDto.setId(id);
        userDto.setName(new Date().toString());

        return userDto;
    }
}

