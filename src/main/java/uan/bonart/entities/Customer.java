package uan.bonart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="customer")
public class Customer extends ParentEntity{

    @Column
    private String email;
    @Column
    private float entry_price;//tarifa cambia si es menor de edad

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getEntry_price() {
        return entry_price;
    }

    public void setEntry_price(float entry_price) {
        this.entry_price = entry_price;
    }
}
