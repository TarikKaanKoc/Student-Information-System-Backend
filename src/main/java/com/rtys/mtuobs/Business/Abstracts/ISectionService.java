package com.rtys.mtuobs.Business.Abstracts;

import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.Section;

import java.util.List;

public interface ISectionService {

    DataResult<List<Section>> getAll();
    Result add(Section section);
}
