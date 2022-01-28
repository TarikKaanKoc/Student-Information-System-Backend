package com.rtys.mtuobs.Business.Abstracts;

import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.StudentPlacmentType;

import java.util.List;

public interface IStudentPlacmentTypeService {

    DataResult<List<StudentPlacmentType>> getAll();
    Result add(StudentPlacmentType studentPlacmentType);

}
