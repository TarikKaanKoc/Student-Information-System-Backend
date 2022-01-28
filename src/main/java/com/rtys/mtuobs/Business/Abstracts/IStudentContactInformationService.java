package com.rtys.mtuobs.Business.Abstracts;

import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.StudentContactInformation;

import java.util.List;

public interface IStudentContactInformationService {

    DataResult<List<StudentContactInformation>>getAll();
    Result add(StudentContactInformation studentContactInformation);
}
