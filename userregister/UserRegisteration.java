package userregister;

import java.util.Scanner;

public class UserRegisteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String fname = sc.next();
        System.out.println(checkValidFname(fname));
        System.out.println("Enter Last Name :");
        String lname = sc.next();
        System.out.println(checkValidLname(lname));
        System.out.println("Enter Email :");
        String email = sc.next();
        System.out.println(checkValidEmail(email));
        System.out.println("Enter Mobile Number");
        String mob = sc.next();
        System.out.println(checkValidMobile(mob));
        System.out.println("Enter Password");
        String pass = sc.next();
        System.out.println(checkValidPassword(pass));
    }

    public static boolean checkValidFname(String fname) {
        String patt = "^(Cap)([a-z]|[A-Z]){3,}";
        return fname.matches(patt);
    }
    public static boolean checkValidLname(String lname){
        String patt = "^(Cap)([a-z]|[A-Z]){3,}";
        return lname.matches(patt);
    }
    public static boolean checkValidEmail(String email){
        String patt = "^[a-zA-Z_-]+[a-zA-Z0-9_-]*@[a-z]+.[a-z0-9]{2,}$";
        return email.matches(patt);
    }
    public static boolean checkValidMobile(String mob){
        String patt = "^[0-9]{1,3} [0-9]{10}$";
        return mob.matches(patt);
    }
    public static boolean checkValidPassword(String pass){
        String patt = "^(?=.*[A-Z]).{8,}$";
        return pass.matches(patt);
    }
}
