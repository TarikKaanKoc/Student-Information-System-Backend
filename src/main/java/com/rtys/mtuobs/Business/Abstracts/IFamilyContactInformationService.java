package com.rtys.mtuobs.Business.Abstracts;

import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.FamilyContactInformation;

import java.util.List;

public interface IFamilyContactInformationService {

    DataResult<List<FamilyContactInformation>>getAll();
    Result add(FamilyContactInformation familyContactInformation);
}
