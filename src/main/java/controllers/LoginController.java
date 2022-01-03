package controllers;
import javax.swing.JOptionPane;
import models.SystemRole;
import models.SystemUsers;
import com.mycompany.restaurant.reservation.system.sql.RestaurantReservationSystem;
import static com.mycompany.restaurant.reservation.system.sql.RestaurantReservationSystem.clientFrame;
import static com.mycompany.restaurant.reservation.system.sql.RestaurantReservationSystem.cookerFrame;
import static com.mycompany.restaurant.reservation.system.sql.RestaurantReservationSystem.loginFrame;
import static com.mycompany.restaurant.reservation.system.sql.RestaurantReservationSystem.waiterFrame;
import java.sql.SQLException;
import models.Restaurant;

public class LoginController {
    Restaurant restaurant = Restaurant.getInstance();
    public void Login(String username,String password) throws SQLException{
        if(username.isEmpty() | password.isEmpty()){
            RestaurantReservationSystem.LOGGER.warning("username or password is Empty.");
            JOptionPane.showMessageDialog(null,"username or password is Empty.");
           return ;
        }
        SystemUsers user = SystemUsers.getUser(username,password); // query the datebase 
        if (null != user ){
                SystemRole role = user.getRole();
                restaurant.setAuthUser(user);
                loginFrame.setVisible(false);
                waiterFrame.setVisible(false);
                cookerFrame.setVisible(false);
                clientFrame.setVisible(false);
                switch (role) {
                    case CLIENT:
                        clientFrame.setVisible(true);
                        break;
                    case WAITER:
                        waiterFrame.setVisible(true);
                        break;
                    case COOKER:
                        cookerFrame.setVisible(true);
                        break;
                    default:
                        loginFrame.setVisible(true);
            }
            }
            else {
             JOptionPane.showMessageDialog(null,"username or password isn't correct.");  
            }
   }
    
    public void Logout(){
        restaurant.setAuthUser(null);
        loginFrame.setVisible(true);
        cookerFrame.setVisible(false);
        waiterFrame.setVisible(false);
        clientFrame.setVisible(false);
    }
}
