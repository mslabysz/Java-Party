package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean shouldContinue=true;

        Party party=new Party();

        while(shouldContinue){
            System.out.println("===========================");
            System.out.println();
            System.out.println("Wybierz opcje: ");
            System.out.println("1. Wyswietl gosci");
            System.out.println("2. Dodaj goscia");
            System.out.println("3. Wyswietl potrawy");
            System.out.println("4. Znajdz po numerze telefonu");
            System.out.println("5. Wyjscie");
            System.out.println();
            System.out.println("===========================");

            int userChoice=scanner.nextInt();
            System.out.println("===========================");
            System.out.println();

            try{
                switch (userChoice){
                    case 1 -> party.displayGuests();
                    case 2 -> party.addGuest();
                    case 3 -> party.displayMeals();
                    case 4 -> party.displayGuestByPhoneNumber();
                    case 5 -> shouldContinue=false;
                }
            }
            catch(Exception e){
                System.out.println("Niepoprawne dane! Sprobuj jeszcze raz. ");
            }
        }
    }
}
