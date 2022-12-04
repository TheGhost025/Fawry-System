public class SignIn implements Aurthorize{
    User u=new User();
    public boolean signIn(String Email,String Password,String e,String p) {
        if (Email == e) {
            if (Password == p) {
                return true;
            } else {
                return false;
            }
        } else if (Password == p) {
            if (Email == e) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean signUp() {
        return false;
    }
}
