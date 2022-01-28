package com.rtys.mtuobs.Business.Concretes;

import com.rtys.mtuobs.Business.Abstracts.IStudentPhoneNumberService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Core.Utilities.SuccessDataResult;
import com.rtys.mtuobs.Core.Utilities.SuccessResult;
import com.rtys.mtuobs.DataAccess.IStudentPhoneNumberDao;
import com.rtys.mtuobs.Entities.Concretes.StudentPhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentPhoneNumberManager implements IStudentPhoneNumberService {

    private IStudentPhoneNumberDao studentPhoneNumberDao;

    @Autowired
    public StudentPhoneNumberManager(IStudentPhoneNumberDao studentPhoneNumberDao) {
        this.studentPhoneNumberDao = studentPhoneNumberDao;
    }

    @Override
    public DataResult<List<StudentPhoneNumber>> getAll() {
        return new SuccessDataResult<List<StudentPhoneNumber>>(this.studentPhoneNumberDao.findAll(),"Data listed");
    }

    @Override
    public Result add(StudentPhoneNumber studentPhoneNumber) {
        return new SuccessResult("Successful");
    }
}
