package com.rtys.mtuobs.Business.Abstracts;


import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.StudentPhoneNumber;

import java.util.List;


public interface IStudentPhoneNumberService {

    DataResult<List<StudentPhoneNumber>>getAll();
    Result add(StudentPhoneNumber studentPhoneNumber);


}
