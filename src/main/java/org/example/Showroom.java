package org.example;

import java.util.Scanner;

public class Showroom implements utility {

   String showroom_Name;
   String showroom_Address;
   int total_employees;
   int total_cars_in_stock;
   String manager_name;





    @Override
    public void get_details() {
        System.out.println("showroom name is:"+showroom_Name);
        System.out.println("showroom address is "+showroom_Address);
        System.out.println("total no of employes is "+total_employees);
        System.out.println("total cars in stock  is"+total_cars_in_stock);
        System.out.println("manages name is "+manager_name);

    }

    @Override
    public void set_details() {
        Scanner sc =new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        System.out.println("enter showroom name");
        showroom_Name=sc.nextLine();
        System.out.println("enter the showrrom address");
        showroom_Address=sc.nextLine();
        System.out.print("MANAGER NAME: ");
        manager_name = sc.nextLine();
        System.out.print("TOTAL NO OF EMPLOYEES: ");
        total_employees = sc.nextInt();
        System.out.print("TOTAL CARS IN STOCK: ");
        total_cars_in_stock = sc.nextInt();


    }
}
