package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentDao extends JpaRepository<Student,Integer> {

    Student findByIdentityNumber(String identityNumber);
    Student findByStudentNumber(String studentNumber);

}
