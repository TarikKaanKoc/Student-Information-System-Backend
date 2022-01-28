package com.rtys.mtuobs.Business.Concretes;

import com.rtys.mtuobs.Business.Abstracts.IOtherContactInformationService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Core.Utilities.SuccessDataResult;
import com.rtys.mtuobs.Core.Utilities.SuccessResult;
import com.rtys.mtuobs.DataAccess.IOtherContactInformationDao;
import com.rtys.mtuobs.Entities.Concretes.OtherContactInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OtherContactInformationManager implements IOtherContactInformationService {

    private IOtherContactInformationDao otherContactInformationDao;


    @Autowired
    public OtherContactInformationManager(IOtherContactInformationDao otherContactInformationDao) {
        this.otherContactInformationDao = otherContactInformationDao;
    }

    @Override
    public DataResult<List<OtherContactInformation>> getAll() {
        return new SuccessDataResult<List<OtherContactInformation>>(this.otherContactInformationDao.findAll(),"Data listed");

    }

    @Override
    public Result add(OtherContactInformation otherContactInformation) {
        this.otherContactInformationDao.save(otherContactInformation);
        return new SuccessResult("Successful");
    }
}
