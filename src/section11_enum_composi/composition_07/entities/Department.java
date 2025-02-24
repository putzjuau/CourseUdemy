package section11_enum_composi.composition_07.entities;

public class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }
    public Department(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
