package com.rtys.mtuobs.Business.Concretes;

import com.rtys.mtuobs.Business.Abstracts.IStudentContactInformationService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Core.Utilities.SuccessDataResult;
import com.rtys.mtuobs.Core.Utilities.SuccessResult;
import com.rtys.mtuobs.DataAccess.IStudentContactInformationDao;
import com.rtys.mtuobs.Entities.Concretes.StudentContactInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentContactInformationManager implements IStudentContactInformationService {

    private IStudentContactInformationDao studentContactInformationDao;

    @Autowired
    public StudentContactInformationManager(IStudentContactInformationDao studentContactInformationDao) {
        this.studentContactInformationDao = studentContactInformationDao;
    }

    @Override
    public DataResult<List<StudentContactInformation>> getAll() {
        return new SuccessDataResult<List<StudentContactInformation>>(this.studentContactInformationDao.findAll(),"Data listed");
    }

    @Override
    public Result add(StudentContactInformation studentContactInformation) {
      this.studentContactInformationDao.save(studentContactInformation);
      return new SuccessResult("Successful");
    }
}
