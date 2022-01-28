package com.rtys.mtuobs.Business.Abstracts;

import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.StudentBankAccount;

import java.util.List;

public interface IStudentBankAccountService {

    DataResult<List<StudentBankAccount>>getAll();
    Result add(StudentBankAccount studentBankAccount);
}
