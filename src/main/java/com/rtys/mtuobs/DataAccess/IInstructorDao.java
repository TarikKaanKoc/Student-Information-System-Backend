package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IInstructorDao extends JpaRepository<Instructor,Integer> {

}
