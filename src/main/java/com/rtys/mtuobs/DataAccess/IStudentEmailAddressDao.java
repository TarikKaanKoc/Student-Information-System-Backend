package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.StudentEmailAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentEmailAddressDao extends JpaRepository<StudentEmailAddress,Integer> {
}
