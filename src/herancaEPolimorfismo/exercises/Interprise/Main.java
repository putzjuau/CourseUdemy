package herancaEPolimorfismo.exercises.Interprise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int n = scan.nextInt();
        List<Employee> list = new ArrayList<>();


        for (int i = 1; i <= n; i++) {
            System.out.println("Employee $" + i + " data:");
            System.out.print("Outsourced (y/n)?");
            char ch = scan.next().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.print("Hours: ");
            int hours = scan.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble();
            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double charge = scan.nextDouble();
                list.add(  new EmployeeTerceirizado(nome, hours, valuePerHour, charge));

            } else {
                list.add( new Employee(nome, hours, valuePerHour));
            }

        }
        for (int i = 0; i < n ; i++) {
            System.out.println(list.get(i).getName() +  " - " + " $  " + list.get(i).payment());
        }
    }
}

