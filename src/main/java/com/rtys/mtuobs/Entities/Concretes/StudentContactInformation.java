package com.rtys.mtuobs.Entities.Concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "student_contact_information")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentContactInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "address")
    private String address;

    @Column(name = "post_code")
    private String postCode;


    @ManyToOne
    @JoinColumn(name = "city_id")
    private City cities;


    @ManyToOne
    @JoinColumn(name = "countie_id")
    private Countie counties;

    @ManyToOne
    @JoinColumn(name = "student_phone_number_id")
    private StudentPhoneNumber students_phone_numbers;


}
