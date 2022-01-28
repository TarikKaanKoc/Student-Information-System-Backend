package com.rtys.mtuobs.Business.Abstracts;

import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.City;

import java.util.List;

public interface ICityService {

    DataResult<List<City>> getAll();
    Result add(City city);
}
