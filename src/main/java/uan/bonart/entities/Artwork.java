package uan.bonart.entities;


import javax.persistence.*;

@Entity
@Table(name="artwork")
public class Artwork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int inscription_code;
    @Column
    private String name;
    @Column
    private float price;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "document_artist", referencedColumnName = "document" )
    private Artist artist;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "number_room", referencedColumnName = "code" )
    private Room room;

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

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
