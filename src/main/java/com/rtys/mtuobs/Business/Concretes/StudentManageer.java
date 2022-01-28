package com.rtys.mtuobs.Business.Concretes;

import com.rtys.mtuobs.Business.Abstracts.IStudentService;
import com.rtys.mtuobs.Core.Utilities.*;
import com.rtys.mtuobs.DataAccess.IStudentDao;
import com.rtys.mtuobs.Entities.Concretes.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentManageer implements IStudentService {

    private IStudentDao studentDao;

    @Autowired
    public StudentManageer(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public DataResult<List<Student>> getAll() {
        return new SuccessDataResult<>(this.studentDao.findAll(),"Data listed");
    }

    @Override
    public Result add(Student student) {
        this.studentDao.save(student);
        return new SuccessResult("Successful");
    }

    @Override
    public DataResult<String> findByIdentityNumber(String identityNumber) {
        var status = studentDao.findByIdentityNumber(identityNumber);
        if (identityNumber==null){
            return new ErrorDataResult<>("Data not found");
        }
        return new SuccessDataResult<>(status,"Data found");
    }

    @Override
    public DataResult<String> findByStudentNumber(String studentNumber) {
        var status = studentDao.findByStudentNumber(studentNumber);
        if (status==null){
            return new ErrorDataResult<>("Data not found");
        }
        return new SuccessDataResult<>(status,"Data found");
    }
}
