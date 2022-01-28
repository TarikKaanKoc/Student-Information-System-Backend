package com.rtys.mtuobs.Entities.Concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student_placement_type")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentPlacmentType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "placement_type")
    private String placementType;

    @JsonIgnore
    @OneToMany(mappedBy = "student_placement_type")
    private List<Student>students;

}
