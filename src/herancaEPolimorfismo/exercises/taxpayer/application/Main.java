package herancaEPolimorfismo.exercises.taxpayer.application;

import herancaEPolimorfismo.exercises.taxpayer.entities.Company;
import herancaEPolimorfismo.exercises.taxpayer.entities.Individual;
import herancaEPolimorfismo.exercises.taxpayer.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers:");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + "data:");
            System.out.print("Individual or company (i/c)?");
            char person = scan.next().charAt(0);
            if (person == 'i') {
                System.out.print("Name: ");
                String name = scan.next();

                System.out.println();

                System.out.print("Anual income: ");
                Double anualIncome = scan.nextDouble();

                System.out.println();

                System.out.print("Health expenditures: ");
                Double healthexpenditures = scan.nextDouble();

                list.add(new Individual(name, anualIncome, healthexpenditures));
            }
            else if (person == 'c') {
                System.out.print("Name: ");
                String name = scan.next();

                System.out.println();

                System.out.print("Anual income: ");
                Double anualIncome = scan.nextDouble();

                System.out.println();

                System.out.print("Number of employees: ");
                int numberOfEmployess = scan.nextInt();

                list.add(new Company(name, anualIncome, numberOfEmployess));
            }
        }
        double sum = 0.0;
        for(TaxPayer taxpayer: list){
            System.out.println("TAXES PAID: ");
            System.out.println(taxpayer.getName() + ":  $ " + taxpayer.tax());
            sum+= taxpayer.tax();
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

    }
}
