package herancaEPolimorfismo.entities;

public class BusinessAccount extends Account{ //<subclasse de account>
    private Double loanLimit;
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); //acaba puxando da classe mae o construtor
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount<=loanLimit){ // se quantia for menor ou igual ao emprestimo
            deposit(amount);
        }
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
        balance-=2.0;
    }
}
