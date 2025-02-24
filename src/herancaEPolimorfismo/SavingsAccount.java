package herancaEPolimorfismo;

public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(){
        super();
    }
    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance); //acaba puxando da classe mae o construtor
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance+=balance * interestRate;
    }

    @Override
    public void withdraw(Double amount) { // sobreescrevendo o metodo withdraw para conseguir diferenciar do account
        balance-=amount;

    }
}
