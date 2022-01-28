package com.rtys.mtuobs.Entities.Concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "students_email_address")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentEmailAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "email_address")
    private String emailAddress;

    @JsonIgnore
    @OneToMany(mappedBy = "students_email_address")
    private List<OtherContactInformation>otherContactInformations;


    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student students;


}
