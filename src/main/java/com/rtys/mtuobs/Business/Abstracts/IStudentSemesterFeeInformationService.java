package com.rtys.mtuobs.Business.Abstracts;

import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.StudentSemesterFeeInformation;

import java.util.List;

public interface IStudentSemesterFeeInformationService {

    DataResult<List<StudentSemesterFeeInformation>> getAll();
    Result add(StudentSemesterFeeInformation studentSemesterFeeInformation);

}
