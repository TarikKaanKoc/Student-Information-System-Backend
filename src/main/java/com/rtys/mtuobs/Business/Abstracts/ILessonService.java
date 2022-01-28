package com.rtys.mtuobs.Business.Abstracts;

import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.Lesson;

import java.util.List;

public interface ILessonService {

    DataResult<List<Lesson>> getAll();
    Result add(Lesson lesson);
}
