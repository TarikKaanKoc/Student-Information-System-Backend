package com.rtys.mtuobs.Business.Abstracts;

import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.LessonsLearnedThisSemester;

import java.util.List;

public interface ILessonLearnedThisSemesterService {

    DataResult<List<LessonsLearnedThisSemester>> getAll();
    Result add(LessonsLearnedThisSemester lessonsLearnedThisSemester);
}
