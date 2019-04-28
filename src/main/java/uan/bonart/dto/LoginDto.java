package uan.bonart.dto;

public class LoginDto {
    private String document;
    private String name;
    private String cellphone;

    private String user;
    private String password;

    public LoginDto(String document, String name, String cellphone, String user, String password) {
        this.document = document;
        this.name = name;
        this.cellphone = cellphone;
        this.user = user;
        this.password = password;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
