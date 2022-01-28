package com.rtys.mtuobs.Business.Concretes;

import com.rtys.mtuobs.Business.Abstracts.ILessonLearnedThisSemesterService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Core.Utilities.SuccessDataResult;
import com.rtys.mtuobs.Core.Utilities.SuccessResult;
import com.rtys.mtuobs.DataAccess.ILessonLearnedThisSemesterDao;
import com.rtys.mtuobs.Entities.Concretes.LessonsLearnedThisSemester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonLearnedThisSemesterManager implements ILessonLearnedThisSemesterService {

    private ILessonLearnedThisSemesterDao lessonLearnedThisSemesterDao;

    @Autowired
    public LessonLearnedThisSemesterManager(ILessonLearnedThisSemesterDao lessonLearnedThisSemesterDao) {
        this.lessonLearnedThisSemesterDao = lessonLearnedThisSemesterDao;
    }

    @Override
    public DataResult<List<LessonsLearnedThisSemester>> getAll() {
        return new SuccessDataResult<>(this.lessonLearnedThisSemesterDao.findAll(),"Data listed");
    }

    @Override
    public Result add(LessonsLearnedThisSemester lessonsLearnedThisSemester) {
        this.lessonLearnedThisSemesterDao.save(lessonsLearnedThisSemester);
    return new SuccessResult("Successful");
    }
}
