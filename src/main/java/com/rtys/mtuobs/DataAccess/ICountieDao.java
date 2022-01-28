package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.Countie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountieDao extends JpaRepository<Countie,Integer> {

}
