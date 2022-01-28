package com.rtys.mtuobs.Business.Concretes;

import com.rtys.mtuobs.Business.Abstracts.ICountieService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Core.Utilities.SuccessDataResult;
import com.rtys.mtuobs.Core.Utilities.SuccessResult;
import com.rtys.mtuobs.DataAccess.ICountieDao;
import com.rtys.mtuobs.Entities.Concretes.Countie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountieManager implements ICountieService {

    private ICountieDao countieDao;

    @Autowired
    public CountieManager(ICountieDao countieDao) {
        this.countieDao = countieDao;
    }

    @Override
    public DataResult<List<Countie>> getAll() {
        return new SuccessDataResult<List<Countie>>(this.countieDao.findAll(),"Data listed");
    }

    @Override
    public Result add(Countie countie) {
        this.countieDao.save(countie);
        return new SuccessResult("Successful");
    }
}
