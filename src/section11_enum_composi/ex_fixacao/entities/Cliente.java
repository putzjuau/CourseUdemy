package section11_enum_composi.ex_fixacao.entities;

import java.util.Date;

public class Cliente {
    private String name;
    private String email;
    private Date birthDate;

    public Cliente(Date birthDate, String email, String name) {
        this.birthDate = birthDate;
        this.email = email;
        this.name = name;
    }
    public Cliente(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Clien: "
                + name
                +" (" +
                birthDate + ")"
                + " - "
                + email;
    }
}
