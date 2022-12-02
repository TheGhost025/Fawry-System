import java.util.Scanner;

public class SignUp implements Aurthorize{
    public User signUp(){
        User u = null;
        Scanner myObj = new Scanner(System.in);
        String n=myObj.nextLine();
        String e=myObj.nextLine();
        String p=myObj.nextLine();
        u.Set(n,e,p);
        return u;
    }
}
