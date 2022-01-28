package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.Conselor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IConselorDao extends JpaRepository<Conselor,Integer> {

    Conselor findById(int id);
    Conselor findByEmailAddress(String emailAddress);
}
