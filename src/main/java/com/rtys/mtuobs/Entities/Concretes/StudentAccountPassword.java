package com.rtys.mtuobs.Entities.Concretes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "students_account_passwords")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentAccountPassword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "acc_password")
    private String accPass;


    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student students;


}
