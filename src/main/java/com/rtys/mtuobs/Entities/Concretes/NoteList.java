package com.rtys.mtuobs.Entities.Concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "note_list")
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class NoteList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "statu")
    private String statu;

    @Column(name = "midterm_exam")
    private double midtermExam;

    @Column(name = "average")
    private String average;

    @Column(name = "letter_note")
    private String letterNote;

    @Column(name = "result_case")
    private String resultCase;

    @Column(name = "final_note")
    private double finalNote;

    @Column(name = "integration")
    private double integration;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lessons;


}
