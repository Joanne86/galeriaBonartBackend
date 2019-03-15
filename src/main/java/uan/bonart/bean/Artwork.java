package uan.bonart.bean;


import javax.persistence.*;

@Entity
@Table(name="artwork")
public class Artwork {
    @Id
    @Column
    private int inscription_code;
    @Column
    private String artwork_type;
    @Column
    private float price;
    @ManyToOne(optional = false)
    @JoinColumn(name = "document_artist", referencedColumnName = "document" )
    private Artist artist;
    @ManyToOne(optional = false)
    @JoinColumn(name = "number_room", referencedColumnName = "code" )
    private Room room;

    public int getInscription_code() {
        return inscription_code;
    }

    public void setInscription_code(int inscription_code) {
        this.inscription_code = inscription_code;
    }

    public String getArtwork_type() {
        return artwork_type;
    }

    public void setArtwork_type(String artwork_type) {
        this.artwork_type = artwork_type;
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
