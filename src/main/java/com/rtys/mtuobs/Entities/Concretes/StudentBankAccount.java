package com.rtys.mtuobs.Entities.Concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "student_bank_account")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentBankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "branch_code")
    private String  branchCode;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "ıban")
    private String ıban;

    @Column(name = "account_holder_name_surname")
    private String accHolderFullName;

    @JsonIgnore
    @OneToMany(mappedBy = "student_bank_account")
    private List<Student>students;

}
