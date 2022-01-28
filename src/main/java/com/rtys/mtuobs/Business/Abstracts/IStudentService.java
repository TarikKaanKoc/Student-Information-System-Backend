package com.rtys.mtuobs.Business.Abstracts;

import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.Student;

import java.util.List;

public interface IStudentService {

    DataResult<List<Student>> getAll();
    Result add(Student student);
    DataResult<String> findByIdentityNumber(String identityNumber);
    DataResult<String> findByStudentNumber(String studentNumber);

}
