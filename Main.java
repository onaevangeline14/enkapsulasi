package enkapsulasi;


public class Main {
    public static void main(String[] args) {
        Enkapsulasi user= new Enkapsulasi ("aaa","bbb");
        Enkapsulasi user1 = new Enkapsulasi ();
        
        user.setUsername ("LOL");
        user.setPassword ("LIL");
        user.setId(001);
        user.setStatus(true);
        
            System.out.println("username :" +user.getUsername());
            System.out.println("Password:" +user.getPassword());
            System.out.println("Id :" +user.getId());
            System.out.println("status :"+user.isStatus());
        
        
    }
}
