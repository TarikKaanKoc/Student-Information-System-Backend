package com.rtys.mtuobs.Business.Concretes;

import com.rtys.mtuobs.Business.Abstracts.IFacultyService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Core.Utilities.SuccessDataResult;
import com.rtys.mtuobs.Core.Utilities.SuccessResult;
import com.rtys.mtuobs.DataAccess.IFacultyDao;
import com.rtys.mtuobs.Entities.Concretes.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FacultyManager implements IFacultyService {

    private IFacultyDao facultyDao;

    @Autowired
    public FacultyManager(IFacultyDao facultyDao) {
        this.facultyDao = facultyDao;
    }

    @Override
    public DataResult<List<Faculty>> getAll() {
        return new SuccessDataResult<List<Faculty>>(this.facultyDao.findAll(),"Data listed");
    }

    @Override
    public Result add(Faculty faculty) {
        this.facultyDao.save(faculty);
        return new SuccessResult("Successful");
    }
}
