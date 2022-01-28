package com.rtys.mtuobs.Business.Abstracts;

import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.Faculty;

import java.util.List;

public interface IFacultyService {

    DataResult<List<Faculty>> getAll();
    Result add(Faculty faculty);

}
