package uan.bonart.entities;

import javax.persistence.*;

@Entity
@Table (name = "room")
public class Room {
    @Id
    @Column (name="code")
    private int code ;
    @Column
    private String name;
    @ManyToOne(optional = false)
    @JoinColumn(name = "document_seller", referencedColumnName = "document" )
    private Seller seller;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
