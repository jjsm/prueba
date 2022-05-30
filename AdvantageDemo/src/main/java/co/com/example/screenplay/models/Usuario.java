package co.com.example.screenplay.models;

import lombok.Data;

@Data
public class Usuario {



    private String username;
    private String  email;
    private String password;
    private String confirm_password;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String country;
    private String city;
    private String address;
    private String  state;
    private String postal_code;


    public Usuario(String username, String email, String password, String confirm_password, String first_name, String last_name, String phone_number, String country, String city, String address, String state, String postal_code) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirm_password = confirm_password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.country = country;
        this.city = city;
        this.address = address;
        this.state = state;
        this.postal_code = postal_code;
    }
}
