import java.util.Scanner;

public class SignUp implements Aurthorize{
    User u = new User();
    @Override
    public boolean signIn(String Email, String Password, String e, String p) {
        return false;
    }

    public boolean signUp(){
        Scanner myObj = new Scanner(System.in);
        String n = myObj.nextLine();
        String e = myObj.nextLine();
        String p = myObj.nextLine();
        u.Set(n,e,p);
        return true;
    }
}
