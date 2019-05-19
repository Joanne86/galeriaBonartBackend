package uan.bonart.entities;

import javax.persistence.*;

@Entity
@Table (name= "typecustomer")
public class TypeCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer codetype;
    @Column
    private String typec;
    @Column
    private float price;

    public Integer getCodetype() {
        return codetype;
    }

    public void setCodetype(Integer codetype) {
        this.codetype = codetype;
    }

    public String getTypec() {
        return typec;
    }

    public void setTypec(String typec) {
        this.typec = typec;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
