package com.rtys.mtuobs.Entities.Concretes;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


@Table(name = "student_semester_fee_information")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentSemesterFeeInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name = "id")
    private int id;

    @Column(name = "period_fee")
    private double periodFee;

    @Column(name = "total_fee_payable")
    private double totalFeePayable;

    @Column(name = "total_fee_paid")
    private  double totalFeePaid;

    @Column(name = "remaining_wage")
    private double remainingWage;

    /*@Column(name = "payment_date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate paymentDate;*/

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student students;

}
