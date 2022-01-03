package models;
public class Cooker extends SystemUsers{   
    public Cooker(String name, String username, String password) {
        super(username, password,SystemRole.COOKER);
    }
}
