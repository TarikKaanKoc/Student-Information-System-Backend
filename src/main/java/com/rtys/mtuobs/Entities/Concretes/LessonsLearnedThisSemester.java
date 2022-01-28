package com.rtys.mtuobs.Entities.Concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "lessons_learned_this_semester")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class  LessonsLearnedThisSemester {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "branch")
    private int branch;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lessons;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section sections;


    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructors;


}
