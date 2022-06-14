package com.jaceybowley.rc.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AUTO_ID")
    private Integer userId;

    @Column(name="Login")
    private String userLogin;

    @Column(name = "Password")
    private String userPassword;

    @Column(name = "First_Name")
    private String userFirstName;

    @Column(name = "Last_Name")
    private String userLastName;

    @Column(name = "Street_Address")
    private String userStreetAddress;

    @Column(name = "City")
    private String userCity;

    @Column(name = "State")
    private String userState;

    @Column(name = "Zip_Code")
    private String userZipCode;

    @Column(name = "Email")
    private String userEmail;

    @Column(name = "Phone_Number")
    private Long userPhoneNumber;

}
