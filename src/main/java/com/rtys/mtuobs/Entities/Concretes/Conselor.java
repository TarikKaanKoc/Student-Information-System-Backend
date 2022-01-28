package com.rtys.mtuobs.Entities.Concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name ="counselors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conselor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;


    @Column(name = "email_address")
    private String emailAddress;


    @Size(min = 11,max =11,message = "Telefon numarası 11 handen oluşmaktadır. Lütfen 11 hane giriniz.")
    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private Faculty faculties;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section sections;


    @ManyToOne
    @JoinColumn(name = "instructors_id")
    private Instructor instructors;


}
