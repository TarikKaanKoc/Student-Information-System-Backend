package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.StudentSemesterFeeInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentSemesterFeeInformationDao extends JpaRepository<StudentSemesterFeeInformation,Integer> {
}
