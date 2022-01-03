/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import java.sql.SQLException;

public class DatebaseCon {
    
    static String datebase_url = "jdbc:sqlite:/home/ziad/Desktop/Projects/Restaurant-Reservation-System-sql/src/main/java/datebase.sqlite";
    private static ConnectionSource con;
    public static ConnectionSource getInstance() throws SQLException {
        if(null!=con){
            return con;
        }else{
            con  = new JdbcConnectionSource(datebase_url);  
        return con;
        }
      
   }
   private DatebaseCon(){}
    
}
