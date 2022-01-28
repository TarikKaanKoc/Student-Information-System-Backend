package com.rtys.mtuobs.Entities.Concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "faculties")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "faculty_name")
    private String facultyName;

    @JsonIgnore
    @OneToMany(mappedBy = "faculties")
    private List<Conselor> conselors;

    @JsonIgnore
    @OneToMany(mappedBy = "faculties")
    private List<Section>sections;

}
