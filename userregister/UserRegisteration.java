package userregister;

import java.util.Scanner;

public class UserRegisteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String fname = sc.next();
        System.out.println(checkValidFname(fname));
    }

    public static boolean checkValidFname(String fname) {
        String patt = "^(Cap)([a-z]|[A-Z]){3,}";
        return fname.matches(patt);
    }
}
