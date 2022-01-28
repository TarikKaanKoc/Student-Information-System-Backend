package com.rtys.mtuobs.Business.Concretes;

import com.rtys.mtuobs.Business.Abstracts.IStudentBankAccountService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Core.Utilities.SuccessDataResult;
import com.rtys.mtuobs.Core.Utilities.SuccessResult;
import com.rtys.mtuobs.DataAccess.IStudentBankAccountDao;
import com.rtys.mtuobs.Entities.Concretes.StudentBankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentBankAccountManager implements IStudentBankAccountService {

    private IStudentBankAccountDao studentBankAccountDao;

    @Autowired
    public StudentBankAccountManager(IStudentBankAccountDao studentBankAccountDao) {
        this.studentBankAccountDao = studentBankAccountDao;
    }

    @Override
    public DataResult<List<StudentBankAccount>> getAll() {
        return new SuccessDataResult<List<StudentBankAccount>>(this.studentBankAccountDao.findAll(),"Data listed");
    }

    @Override
    public Result add(StudentBankAccount studentBankAccount) {
        this.studentBankAccountDao.save(studentBankAccount);
        return new SuccessResult("Successful");
    }
}
