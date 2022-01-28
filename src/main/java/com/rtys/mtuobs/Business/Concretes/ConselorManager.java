package com.rtys.mtuobs.Business.Concretes;

import com.rtys.mtuobs.Business.Abstracts.IConselorService;
import com.rtys.mtuobs.Core.Utilities.*;
import com.rtys.mtuobs.DataAccess.IConselorDao;
import com.rtys.mtuobs.Entities.Concretes.Conselor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConselorManager implements IConselorService {


    private IConselorDao conselorDao;

    @Autowired
    public ConselorManager(IConselorDao conselorDao) {
        this.conselorDao = conselorDao;
    }

    @Override
    public DataResult<List<Conselor>> getAll() {
        return new SuccessDataResult<List<Conselor>>(this.conselorDao.findAll(),"Data listed.");
    }

    @Override
    public Result add(Conselor conselor) {
        this.conselorDao.save(conselor);
        return new SuccessResult("Successful");
    }

    @Override
    public DataResult<Conselor> findById(int id) {
        var result = conselorDao.findById(id);
        if(result==null) {
            return new ErrorDataResult<>("Data not found");
        }

        return new SuccessDataResult<>(result,"Successful");
    }

    @Override
    public DataResult<Conselor> findByEmailAddress(String emailAddress) {
        var dataResult = conselorDao.findByEmailAddress(emailAddress);
        if (dataResult==null){
            return new ErrorDataResult<>("Data Not Found");
        }
        return new SuccessDataResult<>(dataResult,"Successful");
    }
}
