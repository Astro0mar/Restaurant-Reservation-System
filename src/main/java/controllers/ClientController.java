package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Dish;
import models.DishCategory;
import models.Restaurant;
import models.Table;

public class ClientController {
        public static String [] removeTables(List items, String [] selected_items){
           Restaurant restaurant = Restaurant.getInstance();
           
           ArrayList<Table> removeTables = new ArrayList();
           for(String temp: selected_items){
               Table e = new Table(0, 0, true, true);
               removeTables.add(e); 
               items.remove(temp);
           }
           
           Object[] show_array = items.toArray(new String[0]); // ArrayList to String []  
           return (String[]) show_array;
        }
        public static String [] removeDishs(List items, String [] selected_items){
           Restaurant restaurant = Restaurant.getInstance();
           
           ArrayList<Dish> readyDishes = new ArrayList();
           for(String temp: selected_items){
               Dish e = new Dish(temp, 100, DishCategory.MAINCOURSE);
               readyDishes.add(e); 
               items.remove(temp);
           }
           restaurant.setReadyDishes(readyDishes);
         

           Object[] show_array = items.toArray(new String[0]); // ArrayList to String []  
           return (String[]) show_array;
           
    }  
}
    
