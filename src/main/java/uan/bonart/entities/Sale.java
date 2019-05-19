package uan.bonart.entities;

import javax.persistence.*;

@Entity
@Table (name = "sale")
public class Sale {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "document_customer", referencedColumnName = "document" )
    private Customer customer;

    @ManyToOne(optional = false)
    @JoinColumn(name = "artwork_code", referencedColumnName = "inscription_code" )
    private ArtworkSaled artworkSaled;


    public ArtworkSaled getArtworkSaled() {
        return artworkSaled;
    }

    public void setArtworkSaled(ArtworkSaled artworkSaled) {
        this.artworkSaled = artworkSaled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
