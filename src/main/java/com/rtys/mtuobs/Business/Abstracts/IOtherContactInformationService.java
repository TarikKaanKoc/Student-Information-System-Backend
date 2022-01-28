package com.rtys.mtuobs.Business.Abstracts;

import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.OtherContactInformation;

import java.util.List;

public interface IOtherContactInformationService {

    DataResult<List<OtherContactInformation>> getAll();
    Result add(OtherContactInformation otherContactInformation);
}
