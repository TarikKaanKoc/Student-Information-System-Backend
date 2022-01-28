package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.StudentPhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentPhoneNumberDao extends JpaRepository<StudentPhoneNumber,Integer> {
}
