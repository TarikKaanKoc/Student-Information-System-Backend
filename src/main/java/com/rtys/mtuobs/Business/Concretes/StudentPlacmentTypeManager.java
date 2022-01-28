package com.rtys.mtuobs.Business.Concretes;

import com.rtys.mtuobs.Business.Abstracts.IStudentPlacmentTypeService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Core.Utilities.SuccessDataResult;
import com.rtys.mtuobs.Core.Utilities.SuccessResult;
import com.rtys.mtuobs.DataAccess.IStudentPlacmentTypeDao;
import com.rtys.mtuobs.Entities.Concretes.StudentPlacmentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentPlacmentTypeManager implements IStudentPlacmentTypeService {

    private IStudentPlacmentTypeDao studentPlacmentTypeDao;

    @Autowired
    public StudentPlacmentTypeManager(IStudentPlacmentTypeDao studentPlacmentTypeDao) {
        this.studentPlacmentTypeDao = studentPlacmentTypeDao;
    }

    @Override
    public DataResult<List<StudentPlacmentType>> getAll() {
        return new SuccessDataResult<List<StudentPlacmentType>>(this.studentPlacmentTypeDao.findAll(),"Data listed");
    }

    @Override
    public Result add(StudentPlacmentType studentPlacmentType) {
        this.studentPlacmentTypeDao.save(studentPlacmentType);
        return new SuccessResult("Successful");
    }


}
