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
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AUTO_ID")
    private int comAcctId;

    @Column(name = "Alcohol")
    private boolean alcoholServices;

    @Column(name = "Eating_Disoder")
    private boolean eatingDisorderServices;

    @Column(name = "Sex_Addiction")
    private boolean sexServices;

    @Column(name = "Gambling")
    private boolean gamblingServices;

    @Column(name = "Narcotics")
    private boolean narcoticServices;

    @Column(name = "Tobacco")
    private boolean tobaccoServices;

    @Column(name = "Inhalant")
    private boolean inhalantServices;

    @Column(name = "Cannabis")
    private boolean cannabisServices;

    @Column(name = "Hallucinogens")
    private boolean hallucinogenServices;

    @Column(name = "Detox")
    private boolean detoxServices;

    @Column(name = "Insurance_One_Accepted")
    private boolean insuranceOne;

    @Column(name = "Insurance_Two_Accepted")
    private boolean insuranceTwo;

    @Column(name = "Insurance_Three_Accepted")
    private boolean insuranceThree;

    @Column(name = "Insurance_Four_Accepted")
    private boolean insuranceFour;

    @Column(name = "Insurance_Five_Accepted")
    private boolean insuranceFive;

    @Column(name = "Insurance_Six_Accepted")
    private boolean insuranceSix;

    @Column(name = "Insurance_Seven_Accepted")
    private boolean insuranceSeven;

    @Column(name = "Insurance_Eight_Accepted")
    private boolean insuranceEight;

    @Column(name = "Insurance_Nine_Accepted")
    private boolean insuranceNine;

    @Column(name = "Insurance_Ten_Accepted")
    private boolean insuranceTen;

}
