package com.rtys.mtuobs.Entities.Concretes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "students_phone_numbers")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentPhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Size(min = 11,max =11,message = "Telefon numarası 11 handen oluşmaktadır. Lütfen 11 hane giriniz.")
    @Column(name = "phone_number")
    private String phoneNumber;

    @JsonIgnore
    @OneToMany(mappedBy = "students_phone_numbers")
    private List<OtherContactInformation>otherContactInformations;

    @JsonIgnore
    @OneToMany(mappedBy = "students_phone_numbers")
    private List<StudentContactInformation>studentContactInformations;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student students;


}
