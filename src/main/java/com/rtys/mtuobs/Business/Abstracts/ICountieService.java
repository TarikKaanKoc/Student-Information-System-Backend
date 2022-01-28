package com.rtys.mtuobs.Business.Abstracts;

import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.Countie;

import java.util.List;

public interface ICountieService {

    DataResult<List<Countie>>getAll();
    Result add(Countie countie);
}
