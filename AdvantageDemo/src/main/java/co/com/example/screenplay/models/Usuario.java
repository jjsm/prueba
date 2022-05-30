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

}
