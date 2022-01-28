package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.StudentAccountPassword;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentAccountPasswordDao extends JpaRepository<StudentAccountPassword,Integer> {
}
