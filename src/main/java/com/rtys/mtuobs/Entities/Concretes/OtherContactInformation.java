package com.rtys.mtuobs.Entities.Concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "other_contact_information")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OtherContactInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

   // @Column(name = "student_phone_number_id")

    @Column(name = "orcid")
    private String orcid;

    @Column(name = "web_address")
    private String webAddress;

    @Column(name = "social_media_account")
    private String socialMediaAcc;


    @ManyToOne
    @JoinColumn(name = "student_phone_number_id")
    private StudentPhoneNumber students_phone_numbers;

    @ManyToOne
    @JoinColumn(name = "student_email_address_id")
    private StudentEmailAddress students_email_address;


}
