package herancaEPolimorfismo.application;

import herancaEPolimorfismo.Account;
import herancaEPolimorfismo.BusinessAccount;
import herancaEPolimorfismo.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        //UPCASTING
        Account acc1 = bacc; // Classe pai recebendo valor de classe filha
        Account acc2 = new BusinessAccount(1004, "Ana", 0.0, 0.01);
        Account acc3 = new SavingsAccount(1003, "Bob", 0.0, 200.00);

        // DOWCASTING
        //Um elemento da superclasse para a subclasse

        BusinessAccount acc4 = (BusinessAccount) acc2; //Não posso converter de account para businessAccount, se quisessemos realmente, teriamos que fazer um casting manualmente
        // BusinessAccount acc5 = (BusinessAccount) acc3; // queridissima instanciada como SavingsAccount
        if (acc3 instanceof BusinessAccount) {//instance0f-> instancia de:
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }

        if(acc3 instanceof  SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

        Account acc6 = new BusinessAccount(1003, "bob", 1000.0, 500.00);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

    }
}
