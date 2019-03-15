package uan.bonart.entities;

import javax.persistence.*;

@Entity
@Table (name="artist")
@Access(AccessType.FIELD)
public class Artist extends ParentEntity{

    @Column
    private String address;
    @Column
    private String cellphone;
    @Column
    private String city;
    @Column
    private String exhibitions;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getExhibitions() {
        return exhibitions;
    }

    public void setExhibitions(String exhibitions) {
        this.exhibitions = exhibitions;
    }
}
