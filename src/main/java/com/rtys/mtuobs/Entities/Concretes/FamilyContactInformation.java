package com.rtys.mtuobs.Entities.Concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Table(name = "family_contact_information")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FamilyContactInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Size(min = 11,max =11,message = "Telefon numarası 11 handen oluşmaktadır. Lütfen 11 hane giriniz.")
    @Column(name = "family_phone_number")
    private String phoneNumber;

    @Size(min = 5,max = 5,message = "Posta kodu 5 haneden oluşmaktadır. Lütfen 5 hane giriniz.")
    @Column(name = "post_code")
    private String postCode;

    @Column(name = "address")
    private String text;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City cities;

    @ManyToOne
    @JoinColumn(name = "countie_id")
    private Countie counties;



}
