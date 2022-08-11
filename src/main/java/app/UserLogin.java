package app;

import java.util.ResourceBundle;

public class UserLogin {

    public int login(String givenUsername, String givenPassword){
        ResourceBundle rb=ResourceBundle.getBundle("config");
        String actualUsername=rb.getString("username");
        String actualPassword=rb.getString("password");

        if(givenUsername.equals(actualUsername)&&givenPassword.equals(actualPassword)){
            return 1;
        }else{
            return 0;
        }
    }


}
