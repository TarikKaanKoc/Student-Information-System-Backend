package com.rtys.mtuobs.Entities.Concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "city_name")
    private String cityName;

    @JsonIgnore
    @OneToMany(mappedBy = "cities")
    private List<Countie> counties;

    @JsonIgnore
    @OneToMany(mappedBy = "cities")
    private List<FamilyContactInformation>familyContactInformations;

    @JsonIgnore
    @OneToMany(mappedBy = "cities")
    private List<StudentContactInformation>studentContactInformations;

}
