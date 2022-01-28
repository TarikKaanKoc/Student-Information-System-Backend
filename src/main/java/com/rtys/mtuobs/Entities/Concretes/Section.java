package com.rtys.mtuobs.Entities.Concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "sections")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "section_name")
    private String sectionName;

    @Column(name = "capacity")
    private int studentCapacity;

    @JsonIgnore
    @OneToMany(mappedBy = "sections")
    private List<Conselor> conselors;

    @JsonIgnore
    @OneToMany(mappedBy = "sections")
    private List<LessonsLearnedThisSemester>lessonsLearnedThisSemesters;

    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private Faculty faculties;

    @JsonIgnore
    @OneToMany(mappedBy = "sections")
    private List<Student>students;

}
 // learnedtgis semester , students, counselors ,