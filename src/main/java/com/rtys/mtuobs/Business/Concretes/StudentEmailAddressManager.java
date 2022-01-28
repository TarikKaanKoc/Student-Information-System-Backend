package com.rtys.mtuobs.Business.Concretes;

import com.rtys.mtuobs.Business.Abstracts.IStudentEmailAddressService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Core.Utilities.SuccessDataResult;
import com.rtys.mtuobs.DataAccess.IStudentEmailAddressDao;
import com.rtys.mtuobs.Entities.Concretes.StudentEmailAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentEmailAddressManager implements IStudentEmailAddressService {

    private IStudentEmailAddressDao studentEmailAddressDao;


    @Autowired
    public StudentEmailAddressManager(IStudentEmailAddressDao studentEmailAddressDao) {
        this.studentEmailAddressDao = studentEmailAddressDao;
    }

    @Override
    public DataResult<List<StudentEmailAddress>> getAll() {
        return new SuccessDataResult<List<StudentEmailAddress>>(this.studentEmailAddressDao.findAll(),"Data listed");
    }

    @Override
    public Result add(StudentEmailAddress studentEmailAddress) {
        this.studentEmailAddressDao.save(studentEmailAddress);
        return new SuccessDataResult("Successful");
    }
}
