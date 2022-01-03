package com.mycompany.restaurant.reservation.system.sql;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import views.LoginDashboard;
import java.util.logging.Logger;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import models.DatebaseCon;
import models.Dish;
import models.DishCategory;
import models.Restaurant;
import models.SystemRole;
import models.SystemUsers;
import models.Table;
import views.ClientDashboard;
import views.CookerDashboard;
import views.WaiterDashboard;

public class RestaurantReservationSystem {
  public static final Logger LOGGER =  Logger.getLogger(RestaurantReservationSystem.class.getName());
  public static LoginDashboard loginFrame  = new LoginDashboard();
  public static CookerDashboard cookerFrame  = new CookerDashboard(); 
  public static WaiterDashboard waiterFrame  = new WaiterDashboard();
  public static ClientDashboard clientFrame  = new ClientDashboard();
  public static void main(String[] args) throws SQLException{ 
         
    //  Restaurant restaurant = Restaurant.getInstance();

//      try {
//        final ConnectionSource connectionSource = new JdbcConnectionSource("jdbc:sqlite:/home/ziad/Desktop/Projects/Restaurant-Reservation-System-sql/src/main/java/datebase.sqlite");   
//          } catch (SQLException ex) {
//              Logger.getLogger(RestaurantReservationSystem.class.getName()).log(Level.SEVERE, null, ex);
//          }
       
//        try {
//            Dao<SystemUsers, String> accountDao = DaoManager.createDao(connectionSource, SystemUsers.class);
//            TableUtils.createTable(connectionSource, SystemUsers.class);
//            SystemUsers account = new SystemUsers("Ziad", "123", SystemRole.CLIENT);
//            accountDao.create(account);
//
//            Dao<Dish, String> dishDao = DaoManager.createDao(connectionSource, Dish.class);
//            TableUtils.createTable(connectionSource, Dish.class);
//            Dish dish = new Dish("Molhaia", 0, DishCategory.MAINCOURSE);
//            dishDao.create(dish);
//
//            Dao<Table, String> tableDao = DaoManager.createDao(connectionSource, Table.class);
//            TableUtils.createTable(connectionSource, Table.class);
//            Table table1 = new Table(0,0, true, true);
//            tableDao.create(table1);
//            Table table2 = new Table(1,0, true, true);
//            tableDao.create(table2);
//
//            ArrayList<Table> tables = new ArrayList();
//            tables.add(table1);
//            tables.add(table2);
//
//            ArrayList<Dish> dishs = new ArrayList();
//            dishs.add(dish);
//
//          } catch (SQLException ex) {
//              Logger.getLogger(RestaurantReservationSystem.class.getName()).log(Level.SEVERE, null, ex);
//          }
        // fake datebase
//        Dish dish1 = new Dish("HHH", 100, DishCategory.MAINCOURSE);
//        Dish dish2 = new Dish("AAA", 200, DishCategory.APPETIZER);
//        Dish dish3 = new Dish("CCC", 300, DishCategory.DESSERT);    
//        Dish dish4 = new Dish("VVv", 100, DishCategory.MAINCOURSE);
//        Dish dish5 = new Dish("YYY", 200, DishCategory.APPETIZER);
//        Dish dish6 = new Dish("CCC", 500, DishCategory.DESSERT);
//        
//        ArrayList<Dish> dishs = new ArrayList<>();
//        dishs.add(dish1);
//        dishs.add(dish2);   
//        dishs.add(dish3);
//        dishs.add(dish4);           
//        dishs.add(dish5);
//        dishs.add(dish6);       
        
   //     restaurant.setDishes(dishs);
        
//        Table table1 = new Table(0, 5, false, false);
//        Table table2 = new Table(1, 4, true, true);
//        Table table3 = new Table(2, 8, false, true);
//        Table table4 = new Table(3, 3, true, true);
//        Table table5 = new Table(4, 2, true, false);
//        Table table6 = new Table(5, 4, false, true);
//        Table table7 = new Table(6, 7, true, false);
//        Table table8 = new Table(7, 9, true, true);
//        
//        ArrayList<Table> tables = new ArrayList<>();
//        tables.add(table1);
//        tables.add(table2);
//        tables.add(table3);
//        tables.add(table4);
//        tables.add(table5);
//        tables.add(table6);
//        tables.add(table7);
//        tables.add(table8);
   //     restaurant.setTables(tables);
//        
//        SystemUsers user1 = new SystemUsers("Ali", "sdggsd", SystemRole.COOKER);
//        SystemUsers user2 = new SystemUsers("Ahmed", "kjsdg", SystemRole.CLIENT);
//        SystemUsers user3 = new SystemUsers("Mohamed", "sdgkk", SystemRole.CLIENT);
//        SystemUsers user4 = new SystemUsers("Mostafa", "ghdfjgreiu", SystemRole.WAITER);
//        SystemUsers user5 = new SystemUsers("Ziad", "ui3ewt", SystemRole.COOKER);
//        SystemUsers user6 = new SystemUsers("Omar", "hlksf", SystemRole.WAITER);
//        SystemUsers user7 = new SystemUsers("Mohamed", "sdhsdkjl", SystemRole.CLIENT);
//        SystemUsers user8 = new SystemUsers("Ahmed", "jkgdsg", SystemRole.WAITER);
//        SystemUsers user9 = new SystemUsers("Masrs", "showeo", SystemRole.COOKER);
//        SystemUsers user10 = new SystemUsers("Ali", "galgaslk", null);
//       
//        ArrayList<SystemUsers> users = new ArrayList<>();
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//        users.add(user4);
//        users.add(user5);
//        users.add(user6);
//        users.add(user7);
//        users.add(user8);
//        users.add(user9);
//        users.add(user10);  
        
     //   restaurant.setUsers(users);
        
        try{
            //Creating consoleHandler and fileHandler
            Handler consoleHandler = new ConsoleHandler();
            Handler fileHandler  = new FileHandler("./system.log",true);
             
            //Assigning handlers to LOGGER object
            LOGGER.addHandler(consoleHandler);
            LOGGER.addHandler(fileHandler);
             
            //Setting levels to handlers and LOGGER
            consoleHandler.setLevel(Level.ALL);
            fileHandler.setLevel(Level.ALL);
            LOGGER.setLevel(Level.ALL);
             
            LOGGER.config("Configuration done.");
             
            //Console handler removed
            LOGGER.removeHandler(consoleHandler);
             
            LOGGER.log(Level.FINE, "Finer logged");
        }catch(IOException exception){
            LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", exception);
        }
        loginFrame.setVisible(true); // load th Gui 
        LOGGER.finer("Finest example on LOGGER handler completed.");
         
    }
    }
