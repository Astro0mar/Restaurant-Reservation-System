package models;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.ArrayList;

@DatabaseTable(tableName = "restaurant")
public class Restaurant {
//    private ArrayList<SystemUsers> users;
//    private ArrayList<Table> tables;
//    private ArrayList<Dish> dishes; 
    private ArrayList<Dish> readyDishes; 
    private ArrayList<Reservation> reservation;
    private SystemUsers authUser;
    Restaurant(){}
    private static Restaurant restaurant = new Restaurant();
    public static Restaurant getInstance(){
      return restaurant;
   }
//
//    public ArrayList<SystemUsers> getUsers() {
//        return users;
//    }
//    public ArrayList<Table> getTables(){
//        return tables;
//    }
//    public ArrayList<Dish> getDishes(){
//        return dishes;
//    }
//
//    public void setUsers(ArrayList<SystemUsers> users) {
//        this.users = users;
//    }
//    public void setTables(ArrayList<Table> tables) {
//        this.tables = tables;
//    }
//    public void setDishes(ArrayList<Dish> dishes) {
//        this.dishes = dishes;
//    }
    public ArrayList<Reservation> getReservation() {
        return reservation;
    }
    public void setReservation(ArrayList<Reservation> reservation) {
        this.reservation = reservation;
    }
    public SystemUsers getAuthUser() {
        return authUser;
    }
    public void setAuthUser(SystemUsers authUser) {
        this.authUser = authUser;
    }
    public ArrayList<Dish> getReadyDishes() {
        return readyDishes;
    }
    public void setReadyDishes(ArrayList<Dish> readyDishes) {
        this.readyDishes = readyDishes;
    }

}
