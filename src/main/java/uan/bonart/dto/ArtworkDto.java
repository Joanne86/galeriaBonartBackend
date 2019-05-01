package uan.bonart.dto;

public class ArtworkDto {
   private int inscription_code;
   private String name ;
   private float price;
   private String document_artist ;
   private int number_room ;

    public ArtworkDto() {
    }

    public ArtworkDto(int inscription_code, String name, float price, String document_artist, int number_room) {
        this.inscription_code = inscription_code;
        this.name = name;
        this.price = price;
        this.document_artist = document_artist;
        this.number_room = number_room;
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

    public String getDocument_artist() {
        return document_artist;
    }

    public void setDocument_artist(String document_artist) {
        this.document_artist = document_artist;
    }

    public int getNumber_room() {
        return number_room;
    }

    public void setNumber_room(int number_room) {
        this.number_room = number_room;
    }
}
