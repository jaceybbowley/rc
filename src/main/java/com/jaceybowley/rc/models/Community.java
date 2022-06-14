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
public class Community {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AUTO_ID")
    private Integer comId;

    @Column(name="Login")
    private String comLogin;

    @Column(name = "Password")
    private String comPassword;

    @Column(name = "Business_Name")
    private String comName;

    @Column(name = "Street_Address")
    private String comStreetAddress;

    @Column(name = "City")
    private String comCity;

    @Column(name = "State")
    private String comState;

    @Column(name = "Zip_Code")
    private String comZipCode;

    @Column(name = "Email")
    private String comEmail;

    @Column(name = "Phone_Number")
    private Long comPhoneNumber;

}
