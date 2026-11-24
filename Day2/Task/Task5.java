class UserRegistration{
    void register(String name,int userId){
        System.out.println(" Registered user: " + name + " with ID: " + userId);
                        
    }
    void register(int userID,String name){
        System.out.println("Registered ID:" + userID + " for user: " + name);
                        
    }
}
public class Task5 {
    public static void main(String[] args) {
        UserRegistration u=new UserRegistration();
        u.register("keru", 170);
        u.register(02, "heme");
    }
    
}
