package models;
public class Client extends SystemUsers{
    private boolean isSmoker,isPremium;
    private SystemUsers user;

    public Client(SystemUsers user,boolean isSmoker, boolean isPremium) {
        super(user.username, user.password, SystemRole.CLIENT);
        this.isPremium = isPremium;
        this.isSmoker = isSmoker; 
    }

    void reserve(Table e){
        System.out.println("reserved");
    }
    void checkOut(Table e){
        System.out.println("checkOut");
    } 

    public boolean isIsSmoker() {
        return isSmoker;
    }
    public void setIsSmoker(boolean isSmoker) {
        this.isSmoker = isSmoker;
    }
    public boolean isIsPremium() {
        return isPremium;
    }
    public void setIsPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }

    public SystemUsers getUser() {
        return user;
    }    
}
