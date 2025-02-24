package herancaEPolimorfismo.exercises.product.application;

import herancaEPolimorfismo.exercises.product.entities.ImportedProduct;
import herancaEPolimorfismo.exercises.product.entities.Product;
import herancaEPolimorfismo.exercises.product.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of products:");
        int n = scan.nextInt();
        List<Product> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)?");
            char ch = scan.next().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.print("Price: ");
            Double price = scan.nextDouble();
            if (ch == 'c') {
                list.add(new Product(nome, price));
            } else if(ch== 'u'){
                System.out.print("Manufacture Date: ");
                LocalDate date = LocalDate.parse(scan.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(nome, price, date ));
            }else{
                System.out.print("Customs fee: ");
                double customsfee = scan.nextDouble();
                list.add(new ImportedProduct(nome, price, customsfee));
            }

        }
        System.out.println("PRICE TAGS: ");
        for (Product produtos:list){
            System.out.println(produtos.priceTag());
        }
    }
}



