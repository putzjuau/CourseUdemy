package herancaEPolimorfismo.exercises.Interprise;

public class EmployeeTerceirizado extends Employee{
    private Double additionalCharge;

    public EmployeeTerceirizado(){}

    public EmployeeTerceirizado(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public EmployeeTerceirizado(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }


    @Override
    public Double payment() {
        return super.payment()+additionalCharge*1.1;
    }
}
