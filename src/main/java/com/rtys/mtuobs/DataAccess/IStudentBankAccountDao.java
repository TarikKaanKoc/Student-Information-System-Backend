package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.StudentBankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentBankAccountDao extends JpaRepository<StudentBankAccount,Integer> {
}
