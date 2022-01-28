package com.rtys.mtuobs.Business.Concretes;

import com.rtys.mtuobs.Business.Abstracts.IStudentAccountPasswordService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Core.Utilities.SuccessDataResult;
import com.rtys.mtuobs.Core.Utilities.SuccessResult;
import com.rtys.mtuobs.DataAccess.IStudentAccountPasswordDao;
import com.rtys.mtuobs.Entities.Concretes.StudentAccountPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentAccountPasswordManager implements IStudentAccountPasswordService {

    private IStudentAccountPasswordDao studentAccountPasswordDao;


    @Autowired
    public StudentAccountPasswordManager(IStudentAccountPasswordDao studentAccountPasswordDao) {
        this.studentAccountPasswordDao = studentAccountPasswordDao;
    }

    @Override
    public DataResult<List<StudentAccountPassword>> getAll() {
        return new SuccessDataResult<List<StudentAccountPassword>>(this.studentAccountPasswordDao.findAll(),"Data listed");

    }

    @Override
    public Result add(StudentAccountPassword studentAccountPassword) {
        this.studentAccountPasswordDao.save(studentAccountPassword);
        return new SuccessResult("Successful");
    }
}
