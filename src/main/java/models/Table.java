package models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Tables")
public class Table {
    @DatabaseField(id = true)
    private int number;
    @DatabaseField        
    private int seats;
    @DatabaseField 
    private boolean Smoking;
    @DatabaseField         
    private boolean Premium;
    
    Table(){}
    
    public Table(int number, int seats, boolean Smoking, boolean Premium) {
        this.number = number;
        this.seats = seats;
        this.Smoking = Smoking;
        this.Premium = Premium;
    }
    
   
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isSmoking() {
        return Smoking;
    }

    public void setSmoking(boolean Smoking) {
        this.Smoking = Smoking;
    }

    public boolean isPremium() {
        return Premium;
    }

    public void setPremium(boolean Premium) {
        this.Premium = Premium;
    }

}
