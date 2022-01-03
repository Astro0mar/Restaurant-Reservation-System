package models;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTable;
import com.mycompany.restaurant.reservation.system.sql.RestaurantReservationSystem;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;

@DatabaseTable(tableName = "users")
public class SystemUsers {
    @DatabaseField
    String username;
    @DatabaseField(canBeNull = false)
    String password; 
    @DatabaseField
    private SystemRole role;
     	

SystemUsers() {
    // all persisted classes must define a no-arg constructor
    // with at least package visibility
}


    public SystemUsers(String username ,String password , SystemRole r){
       this.username = username;
       this.password = password;
       this.role = r;
       
    }
    
    public static SystemUsers getUser(String username,String password) throws SQLException {
        ConnectionSource con = DatebaseCon.getInstance();
        try {
          Dao<SystemUsers, String> accountDao = DaoManager.createDao(con, SystemUsers.class);
          QueryBuilder<SystemUsers, String> qb = accountDao.queryBuilder();
          qb.limit(1L).where().eq("username", username).and().eq("password",password);
          List<SystemUsers> users = accountDao.query(qb.prepare());
          if (!users.isEmpty()) {
            return users.get(0);
          }
        } catch (SQLException ex) {
          RestaurantReservationSystem.LOGGER.log(Level.FINER,"Error getting a user from DB -{0} " , ex);
        }
        return null;
    }

    public SystemRole getRole() {
        return role;
    }
    
    
}
