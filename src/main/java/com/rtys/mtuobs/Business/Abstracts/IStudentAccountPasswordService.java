package com.rtys.mtuobs.Business.Abstracts;

import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.StudentAccountPassword;

import java.util.List;

public interface IStudentAccountPasswordService {

    DataResult<List<StudentAccountPassword>> getAll();
    Result add(StudentAccountPassword studentAccountPassword);



}
