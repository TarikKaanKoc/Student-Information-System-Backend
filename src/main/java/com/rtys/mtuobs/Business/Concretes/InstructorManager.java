package com.rtys.mtuobs.Business.Concretes;

import com.rtys.mtuobs.Business.Abstracts.IInstructorService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Core.Utilities.SuccessDataResult;
import com.rtys.mtuobs.Core.Utilities.SuccessResult;
import com.rtys.mtuobs.DataAccess.IInstructorDao;
import com.rtys.mtuobs.Entities.Concretes.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorManager implements IInstructorService {

    private IInstructorDao instructorDao;

    @Autowired
    public InstructorManager(IInstructorDao instructorDao) {
        this.instructorDao = instructorDao;
    }

    @Override
    public DataResult<List<Instructor>> getAll() {
        return new SuccessDataResult<List<Instructor>>(this.instructorDao.findAll(),"Data listed");
    }

    @Override
    public Result add(Instructor instructor) {
        this.instructorDao.save(instructor);
        return new SuccessResult("Successful");
    }
}
