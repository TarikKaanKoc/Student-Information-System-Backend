package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.City;
import org.hibernate.sql.Update;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICityDao extends JpaRepository<City,Integer> {


}
