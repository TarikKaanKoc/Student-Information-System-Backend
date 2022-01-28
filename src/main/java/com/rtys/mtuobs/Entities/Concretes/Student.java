package com.rtys.mtuobs.Entities.Concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Table(name = "students")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_last_name")
    private String studentLastName;

    @Column(name = "class")
    private int clss;

    @Column(name = "agno")
    private double agno;

    @Column(name = "identity_number")
    private String identityNumber;

    @Column(name = "student_number")
    private String studentNumber;

    @JsonIgnore
    @OneToMany(mappedBy = "students")
    private List<StudentSemesterFeeInformation>studentSemesterFeeInformations;

    @ManyToOne
    @JoinColumn(name = "student_placement_id")
    private StudentPlacmentType student_placement_type;


    @ManyToOne
    @JoinColumn(name = "student_bank_acc_id")
    private StudentBankAccount student_bank_account;


    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section sections;

    @JsonIgnore
    @OneToMany(mappedBy = "students")
    private List<StudentAccountPassword>studentAccountPasswords;

    @JsonIgnore
    @OneToMany(mappedBy = "students")
    private List<StudentEmailAddress>studentEmailAddresses;

    @JsonIgnore
    @OneToMany(mappedBy = "students")
    private List<StudentPhoneNumber>studentPhoneNumbers;



}
