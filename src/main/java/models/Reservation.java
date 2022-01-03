package models;
import java.time.LocalTime;
import java.util.ArrayList;

public class Reservation {
    private int id; 
    private final LocalTime time = LocalTime.now();
    private Client user;
    private static ArrayList<Table> tables;
    private static ArrayList<Dish> dishes;    

    public Reservation(int id,Client user,ArrayList<Table> tables,ArrayList<Dish> dishes) {
        this.id = id;
        this.user = user;
        this.tables = tables;
        this.dishes = dishes;
    }

    public LocalTime getTime() {
        return time;
    }
    public SystemUsers getClient() {
        return user;
    }
    public static ArrayList<Table> getTables() {
        // get from datebase 
        return tables;
    }
    public static ArrayList<Dish> getDishes() {
         // get from datebase 
        return dishes;
    }

}
