package com.rtys.mtuobs.Business.Concretes;

import com.rtys.mtuobs.Business.Abstracts.IFamilyContactInformationService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Core.Utilities.SuccessDataResult;
import com.rtys.mtuobs.Core.Utilities.SuccessResult;
import com.rtys.mtuobs.DataAccess.IFamilyContactInformationDao;
import com.rtys.mtuobs.Entities.Concretes.FamilyContactInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyContactInformationManager implements IFamilyContactInformationService {

    private IFamilyContactInformationDao familyContactInformationDao;

    @Autowired
    public FamilyContactInformationManager(IFamilyContactInformationDao familyContactInformationDao) {
        this.familyContactInformationDao = familyContactInformationDao;
    }

    @Override
    public DataResult<List<FamilyContactInformation>> getAll() {
        return new SuccessDataResult<List<FamilyContactInformation>>(this.familyContactInformationDao.findAll(),"Data listed");
    }

    @Override
    public Result add(FamilyContactInformation familyContactInformation) {
        this.familyContactInformationDao.save(familyContactInformation);
        return new SuccessResult("Successful");
    }
}
