package herancaEPolimorfismo.exercises.taxpayer.entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {
    }
    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if(getAnualIncome() <= 20000.00){
            return ( (getAnualIncome()*0.15)) - getHealthExpenditures()/2;
        }else{
            return ( (getAnualIncome()*0.25) - getHealthExpenditures()/2);
        }
    }
}
