package uan.bonart.entities;

import javax.persistence.*;

@Entity
@Table(name="artworksaled")
public class ArtworkSaled {
    @Id
    @Column
    private int inscription_code;
    @Column
    private String name;
    @Column
    private float price;
    @Column (name= "artist")
    private String artist;
    @Column (name = "number_room")
    private int number_room;
    @Column (name = "customer")
    private String customer;
    @Column (name = "seller")
    private String seller;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public int getInscription_code() {
        return inscription_code;
    }

    public void setInscription_code(int inscription_code) {
        this.inscription_code = inscription_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumber_room() {
        return number_room;
    }

    public void setNumber_room(int number_room) {
        this.number_room = number_room;
    }
}
