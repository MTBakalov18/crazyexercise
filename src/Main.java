import java.time.LocalDate;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Medicament medicament1 = new Medicament("Antibiotics", 5.50, 3, LocalDate.of(2022, 3, 25));
        Medicament medicament2 = new Medicament("VitaminC", 4, 6, LocalDate.of(2022, 5, 23));
        ArrayList<Medicament> medicaments = new ArrayList<>();
        medicaments.add(medicament1);
        medicaments.add(medicament2);
        printExpensiveMedicaments(medicaments);
        System.out.println(printQuantityInfo(medicaments));
        printAfterExpiryDate(medicaments);
    }

    public static void printExpensiveMedicaments(ArrayList<Medicament> medicament) {

        ArrayList<Medicament> expensiveMedicaments = new ArrayList<>();
        for (Medicament m : medicament) {
            if (m.getPrice() > 5) {
                expensiveMedicaments.add(m);
            }
        }

        for (Medicament m : medicament) {
            System.out.println(m.name);
        }
    }

    public static ArrayList<Medicament> printQuantityInfo(ArrayList<Medicament> medicament) {
        ArrayList<Medicament> quantitylessthan10 = new ArrayList<>();
        for (Medicament m : medicament) {
            if (m.getQuantity() < 10) {
                quantitylessthan10.add(m);
            }
        }
        return quantitylessthan10;
    }
    public static void printAfterExpiryDate(ArrayList<Medicament> medicament) {

        ArrayList<Medicament> AfterExpiryDate = new ArrayList<>();
        for (Medicament m : medicament) {
            if (m.expirydate.isAfter(LocalDate.of(2022,4,1))) {
                AfterExpiryDate.add(m);
            }
        }

        for (Medicament m : medicament) {
            System.out.println(m.name + " " +m.quantity);
        }
    }
}