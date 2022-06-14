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
public class Preferences {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AUTO_ID")
    private int userAcctId;

    @Column(name = "Alcohol")
    private boolean alcoholRecovery;

    @Column(name = "Eating_Disorder")
    private boolean eatingDisorderRecovery;

    @Column(name = "Sex_Addiction")
    private boolean sexRecovery;

    @Column(name = "Gambling")
    private boolean gamblingRecovery;

    @Column(name = "Narcotics")
    private boolean narcoticRecovery;

    @Column(name = "Tobacco")
    private boolean tobaccoRecovery;

    @Column(name = "Inhalant_Abuse")
    private boolean inhalantRecovery;

    @Column(name = "Cannabis")
    private boolean cannabisRecovery;

    @Column(name = "Hallucinogens")
    private boolean hallucinogenRecovery;

    @Column(name = "Detox")
    private boolean detoxRecovery;

    @Column(name = "Insurance_One")
    private boolean insuranceOne;

    @Column(name = "Insurance_Two")
    private boolean insuranceTwo;

    @Column(name = "Insurance_Three")
    private boolean insuranceThree;

    @Column(name = "Insurance_Four")
    private boolean insuranceFour;

    @Column(name = "Insurance_Five")
    private boolean insuranceFive;

    @Column(name = "Insurance_Six")
    private boolean insuranceSix;

    @Column(name = "Insurance_Seven")
    private boolean insuranceSeven;

    @Column(name = "Insurance_Eight")
    private boolean insuranceEight;

    @Column(name = "Insurance_Nine")
    private boolean insuranceNine;

    @Column(name = "Insurance_Ten")
    private boolean insuranceTen;

}
