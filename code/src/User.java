public class User implements Notifications{
    private String Name;
    private String Email;
    private String Password;

    void Set(String n ,String e,String p){
        Name =n;
        Email=e;
        Password=p;

    }

    public void searchService(String Service){
        if(Service=="charge"){

        }
        else if(Service=="internet"){

        }
        else if(Service=="landline"){

        }
        else if(Service=="donation"){

        }
    }

    public void refund(){

    }

    @Override
    public void update(String s) {

    }
}
