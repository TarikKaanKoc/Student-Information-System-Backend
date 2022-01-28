package com.rtys.mtuobs.Entities.Concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "instructors")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "status")
    private String statu;

    @JsonIgnore
    @OneToMany(mappedBy = "instructors")
    private List<Conselor> conselors;

    @JsonIgnore
    @OneToMany(mappedBy = "instructors")
    private List<LessonsLearnedThisSemester>lessonsLearnedThisSemesters;


}
