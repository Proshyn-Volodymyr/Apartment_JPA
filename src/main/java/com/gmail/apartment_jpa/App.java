package com.gmail.apartment_jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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

    }
}
