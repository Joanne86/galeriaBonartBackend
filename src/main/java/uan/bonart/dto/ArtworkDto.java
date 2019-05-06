package uan.bonart.dto;

public class ArtworkDto {
   private int inscription_code;
   private String name ;
   private float price;
   private String artistName ;


    public ArtworkDto() {
    }

    public ArtworkDto(int inscription_code, String name, float price, String artistName) {
        this.inscription_code = inscription_code;
        this.name = name;
        this.price = price;
        this.artistName = artistName;
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

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
