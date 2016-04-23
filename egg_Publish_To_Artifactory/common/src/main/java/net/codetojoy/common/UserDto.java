
package net.codetojoy.common;

// This class has some basic fields / methods so that the published jar can be tested.
// The code itself is not interesting. 

public class UserDto {
    public static final String VERSION = "USER_DTO.v.0";

    private String name;
    private String id;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
}

