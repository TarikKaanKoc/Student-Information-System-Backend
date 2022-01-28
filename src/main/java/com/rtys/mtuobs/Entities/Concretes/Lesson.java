package com.rtys.mtuobs.Entities.Concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "lessons")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "lesson_name")
    private String lessonName;

    @Column(name = "credit")
    private int credit;

    @Column(name = "akts")
    private int akts;

    @Column(name = "zs")
    private String zs;

    @Column(name = "class")
    private int clss;

    @Column(name = "theoric")
    private int theoric;

    @Column(name = "application")
    private int application;

    @Column(name = "lesson_code")
    private String lessonCode;

    @JsonIgnore
    @OneToMany(mappedBy = "lessons")
    private List<LessonsLearnedThisSemester>lessonsLearnedThisSemesters;

    @JsonIgnore
    @OneToMany(mappedBy = "lessons")
    private List<NoteList> noteList;

}
