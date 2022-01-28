package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.StudentContactInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentContactInformationDao extends JpaRepository<StudentContactInformation,Integer> {
}
