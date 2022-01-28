package com.rtys.mtuobs.Business.Concretes;

import com.rtys.mtuobs.Business.Abstracts.IStudentSemesterFeeInformationService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Core.Utilities.SuccessDataResult;
import com.rtys.mtuobs.Core.Utilities.SuccessResult;
import com.rtys.mtuobs.DataAccess.IStudentSemesterFeeInformationDao;
import com.rtys.mtuobs.Entities.Concretes.StudentSemesterFeeInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentSemesterFeeInformationManager implements IStudentSemesterFeeInformationService {

    private IStudentSemesterFeeInformationDao studentSemesterFeeInformationDao;

    @Autowired
    public StudentSemesterFeeInformationManager(IStudentSemesterFeeInformationDao studentSemesterFeeInformationDao) {
        this.studentSemesterFeeInformationDao = studentSemesterFeeInformationDao;
    }

    @Override
    public DataResult<List<StudentSemesterFeeInformation>> getAll() {
        return new SuccessDataResult<List<StudentSemesterFeeInformation>>(this.studentSemesterFeeInformationDao.findAll(),"Data listed");
    }

    @Override
    public Result add(StudentSemesterFeeInformation studentSemesterFeeInformation) {
        this.studentSemesterFeeInformationDao.save(studentSemesterFeeInformation);
        return new SuccessResult("Successful");
    }
}
