package demo.ui;
import demo.exceptions.PasswordMismatchException;
import demo.exceptions.UserNotFoundException;
import demo.model.UserDetail;
import demo.service.LoginService;
import demo.service.LoginServiceImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, PasswordMismatchException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the choice please:");
        System.out.println("1> Create new user 2> Login check 3>Get user details");
        int c = in.nextInt();
        switch (c){
            case 1:System.out.println("Enter the User id:");
                int id = in.nextInt();
                System.out.println("Enter the User name:");
                String username = in.next();
                System.out.println("Enter the User password: ");
                String password = in.next();
                UserDetail u = new UserDetail();
                u.setUserName(username);
                u.setUserId(id);
                u.setPassword(password);
                LoginService loginService=new LoginServiceImpl();
                loginService.createUser(u);
                System.exit(0);
            case 2:
                LoginService l2 = new LoginServiceImpl();
                System.out.println("Enter your username");
                String us = in.next();
                System.out.println("Enter the password");
                String pass=in.next();
                UserDetail u2 =new UserDetail();
                u2.setUserName(us);
                u2.setPassword(pass);
                if (l2.verifyUserNameAndPassword(u2)){
                    System.out.println("Welcome "+u2.getUserName());
                }
                else{
                    System.out.println("Incorrect password or username...Access restricted!! ");
                }
            case 3:
                LoginService l3 = new LoginServiceImpl();
                System.out.println("Enter your username");
                String u3 = in.next();
                System.out.println("Enter the password");
                String p3=in.next();
                UserDetail usr =new UserDetail();
                usr.setUserName(u3);
                usr.setPassword(p3);
                System.out.println("Userid: "+l3.getUserDetailsByUserName(u3).getUserId()+ "  Username: "+l3.getUserDetailsByUserName(u3).getUserName());
        }

    }
}
