package com.rtys.mtuobs.Business.Abstracts;

import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.Instructor;

import java.util.List;

public interface IInstructorService {
    DataResult<List<Instructor>> getAll();
    Result add(Instructor instructor);

}
