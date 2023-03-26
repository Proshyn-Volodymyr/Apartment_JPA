package com.gmail.apartment_jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    static EntityManagerFactory emf;
    static EntityManager em;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("JPA_Apartment");
        em = emf.createEntityManager();
        boolean flag = true;

        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Show the table");
            System.out.println("2. Add the new apartment");
            System.out.println("3. Search apartment by parameter");
            System.out.println("4. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }


    }

    private static void addNewApartment() {

        boolean flag = true;
        String district;
        Address address;
        Integer square;
        Integer amountOfRooms;
        Integer price;
        while (flag) {

            System.out.println("====== ADDING A NEW APARTMENT ======");
            Scanner scanner = new Scanner(System.in);

            System.out.println("1. Enter the name district: ");
            district = scanner.nextLine();

            System.out.println("2. Enter the address: ");


            System.out.println("3. Enter the square of apartment: ");
            square = scanner.nextInt();
            scanner.nextLine();

            System.out.println("4. Enter the quantity of rooms");
            amountOfRooms = scanner.nextInt();
            scanner.nextLine();

            System.out.println("5. Enter the price of apartment");
            price = scanner.nextInt();
            scanner.nextLine();

            System.out.println("1. Submit");
            System.out.println("0. Back");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:

                    flag = false;
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }
    }

    private static Address addAddress() {
        boolean flag = true;
        String countryName = "";
        String cityName = "";
        String streetName = "";
        Integer buildingNumber = 0;
        Integer apNumber = 0;
        Integer index = 0;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            System.out.println("====== ADDING A NEW APARTMENT ======");
            System.out.println("Enter the country: ");
            countryName = scanner.nextLine();
            System.out.println("Enter the city: ");
            cityName = scanner.nextLine();
            System.out.println("Enter the street name: ");
            streetName = scanner.nextLine();
            System.out.println("Enter the building number: ");
            buildingNumber = scanner.nextInt();
            System.out.println("Enter the apartment number: ");
            apNumber = scanner.nextInt();
            System.out.println("Enter the post index: ");
            index = scanner.nextInt();
        }
        Address address = new Address.Builder().countryName(countryName).cityName(cityName).streetName(streetName)
                .buildingNumber(buildingNumber).apNumber(apNumber).index(index).build();
        return address;
    }
}
