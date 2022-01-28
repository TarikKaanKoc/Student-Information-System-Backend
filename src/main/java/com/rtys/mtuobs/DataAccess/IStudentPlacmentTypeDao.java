package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.Student;
import com.rtys.mtuobs.Entities.Concretes.StudentPlacmentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentPlacmentTypeDao extends JpaRepository<StudentPlacmentType,Integer> {

}
