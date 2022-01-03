package models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
@DatabaseTable(tableName = "Dishs")
public class Dish {
    @DatabaseField
    private String name;
    @DatabaseField
    private int price ;
    @DatabaseField
    private DishCategory category; 
    
    Dish(){
    
    
    }
    
    public Dish(String name,int price, DishCategory category ){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public DishCategory getCategory() {
        return category;
    }

    public void setCategory(DishCategory category) {
        this.category = category;
    }
    @Override
    public String toString() {
      return name + "-" + "Price : "+ price + "-" + category.toString();
   }
    
}
