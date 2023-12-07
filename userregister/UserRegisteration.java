package userregister;

import java.util.Scanner;

public class UserRegisteration {
    public static void main(String[] args) throws UserRegistrationException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String fname = sc.next();
        System.out.println(checkValidFname(fname));
        System.out.println("Enter Last Name :");
        String lname = sc.next();
        System.out.println(checkValidLname(lname));
        System.out.println("Enter Email :");
        String email = sc.next();
        System.out.println("Enter Mobile Number");
        String mob = sc.next();
        System.out.println(checkValidMobile(mob));
        System.out.println("Enter Password");
        String pass = sc.next();
        System.out.println(checkValidPassword(pass));
    }

    public static boolean checkValidFname(String fname) throws UserRegistrationException {
            String patt = "^[A-Z]([a-zA-Z]){2,}";
            boolean ans = fname.matches(patt);
            if(!ans){
                throw new UserRegistrationException("Enter valid first name");
            }
            return ans;
    }
    public static boolean checkValidLname(String lname) throws UserRegistrationException {
            String patt = "^[A-Z]([a-zA-Z]){2,}";
            boolean ans = lname.matches(patt);
            if(!ans){
                throw new UserRegistrationException("Enter valid last name");
            }
            return ans;
    }
    public static boolean checkValidEmail(String email) throws UserRegistrationException{
        String patt = "^[a-zA-Z_-]+[a-zA-Z0-9_-]*@[a-z]+.[a-z0-9]{2,}$";
        boolean ans = email.matches(patt);
        if(!ans){
            throw new UserRegistrationException("Enter valid email");
        }
        return ans;
    }
    public static boolean checkValidMobile(String mob) throws UserRegistrationException {
        String patt = "^[0-9]{1,3} [0-9]{10}$";
        boolean ans = mob.matches(patt);
        if(!ans){
            throw new UserRegistrationException("Enter valid mobile number");
        }
        return ans;
    }
    public static boolean checkValidPassword(String pass) throws UserRegistrationException {
        String patt = "^(?=.*[A-Z])(?=.*[0-9])[@#$%!^&*].{8,}$";
        boolean ans = pass.matches(patt);
        if(!ans){
            throw new UserRegistrationException("Enter valid password");
        }
        return ans;
    }
}
class UserRegistrationException extends Exception{
    UserRegistrationException(String msg){
        super(msg);
    }
}