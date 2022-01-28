package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacultyDao extends JpaRepository<Faculty,Integer> {
}
