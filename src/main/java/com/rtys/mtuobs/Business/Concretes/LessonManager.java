package com.rtys.mtuobs.Business.Concretes;

import com.rtys.mtuobs.Business.Abstracts.ILessonService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Core.Utilities.SuccessDataResult;
import com.rtys.mtuobs.Core.Utilities.SuccessResult;
import com.rtys.mtuobs.DataAccess.ILessonDao;
import com.rtys.mtuobs.Entities.Concretes.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonManager implements ILessonService {

    private ILessonDao lessonDao;

    @Autowired
    public LessonManager(ILessonDao lessonDao) {
        this.lessonDao = lessonDao;
    }

    @Override
    public DataResult<List<Lesson>> getAll() {
        return new SuccessDataResult<List<Lesson>>(this.lessonDao.findAll(),"Data listed");
    }

    @Override
    public Result add(Lesson lesson) {
        this.lessonDao.save(lesson);
        return new SuccessResult("Successful");
    }
}
