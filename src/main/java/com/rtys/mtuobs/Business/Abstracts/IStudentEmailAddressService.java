package com.rtys.mtuobs.Business.Abstracts;

import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.StudentEmailAddress;

import java.util.List;

public interface IStudentEmailAddressService {

    DataResult<List<StudentEmailAddress>>getAll();
    Result add(StudentEmailAddress studentEmailAddress);
}
