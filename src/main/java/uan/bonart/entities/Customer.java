package uan.bonart.entities;

import javax.persistence.*;

@Entity
@Table (name="customer")
public class Customer extends ParentEntity{

    @Column
    private String email;
    @Column
    private boolean flag;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codetype", referencedColumnName = "codetype" )
    private TypeCustomer typeCustomer;//tarifa cambia si es menor de edad

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TypeCustomer getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(TypeCustomer typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
