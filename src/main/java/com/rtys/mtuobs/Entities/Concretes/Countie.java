package com.rtys.mtuobs.Entities.Concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "counties")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Countie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "countie_name")
    private String countieName;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City cities;

    @JsonIgnore
    @OneToMany(mappedBy = "counties")
    private List<FamilyContactInformation> familyContactInformationList;

    @JsonIgnore
    @OneToMany(mappedBy = "counties")
    private List<StudentContactInformation>studentContactInformations;


}
