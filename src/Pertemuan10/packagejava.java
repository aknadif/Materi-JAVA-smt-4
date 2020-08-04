package Pertemuan10;

import java.util.*;

public class packagejava {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String username;

        System.out.println("Enter Username");
        username = myObj.nextLine();
        myObj.close();
        System.out.println("Username is = " + username);
    }
}