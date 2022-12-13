import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;


        System.out.println("1. Insert data");
        System.out.println("2. Print data");
        System.out.println("3. Print data with price below 10lv");
        System.out.println("4. Print data with price above 15lv");
        System.out.println("5. Print data with expiration date");
        System.out.print("Choose: "); option = scanner.nextInt();

        Medicament Medicament1 = new Medicament("Antibiotics", 16, 30, LocalDate.now());
        Medicament Medicament2 = new Medicament("Vitamic C", 5, 50, LocalDate.now());
        Medicament Medicament3 = new Medicament("Nurofen", 8, 10, LocalDate.now());

        ArrayList<Medicament> medicaments = new ArrayList<>();

        medicaments.add(Medicament1);
        medicaments.add(Medicament2);
        medicaments.add(Medicament3);

        switch (option) {
            case 1: insertData(medicaments);
                break;
            case 2: printAllData(medicaments);
                break;
            case 3:  printAllMedicinesWithPriceHigherThan15(medicaments);
                break;
            case 4:  printAllMedicinesWithLowerPriceThan10(medicaments);
                break;
            case 5:  printmedicamentsWithExpirationDate(medicaments);
                break;
            default:
                System.out.println("Please don't break the code further, its already bad enough");

        }
    }

    public static void insertData(ArrayList<Medicament> medicaments) {
        Scanner scanner = new Scanner(System.in);
        Medicament Medicament = new Medicament();

        String name;
        double price;
        int quantity;

        System.out.println();
        System.out.print("Name: "); name = scanner.nextLine(); Medicament.name = name;
        System.out.println();
        System.out.print("Price: "); price = scanner.nextDouble(); Medicament.price = price;
        System.out.println();
        System.out.print("Quantity: "); quantity = scanner.nextInt(); Medicament.quantity = quantity;
        Medicament.expirydate = LocalDate.now();
        medicaments.add(Medicament);
    }

    public static void printAllData(ArrayList<Medicament> medicaments) {
        for (Medicament m : medicaments) {
            System.out.println(m.toString());
        }
    }

    public static void printAllMedicinesWithPriceHigherThan15(ArrayList<Medicament> medicaments) {

        ArrayList<Medicament> newmedicaments = new ArrayList<>();

        for (Medicament m : medicaments) {
            if(m.price > 15) {
                newmedicaments.add(m);
            }
        }

        for (Medicament m : newmedicaments) {
            System.out.println(m.name);
        }
    }

    public static void printAllMedicinesWithLowerPriceThan10(ArrayList<Medicament> medicaments){
        ArrayList<Medicament> newmedicaments = new ArrayList<>();
        for(Medicament p : medicaments){
            if(p.price < 10){
                newmedicaments.add(p);
            }
        }

        for (Medicament p : newmedicaments) {
            System.out.println(p.toString());
        }
    }

    public static void printmedicamentsWithExpirationDate(ArrayList<Medicament> medicaments){

        ArrayList<Medicament> newmedicaments = new ArrayList<>();

        LocalDate date = LocalDate.of(2023, 8, 25);

        for(Medicament m : medicaments){
            if(m.expirydate.equals(date)){
                newmedicaments.add(m);
            }
        }

        for (Medicament m : newmedicaments) {
            System.out.println(m.toString());
        }
    }
    }