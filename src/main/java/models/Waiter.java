package models;

public class Waiter extends SystemUsers {

    public Waiter(String username, String password) {
        super(username, password,SystemRole.WAITER );
    }
 
 
}
