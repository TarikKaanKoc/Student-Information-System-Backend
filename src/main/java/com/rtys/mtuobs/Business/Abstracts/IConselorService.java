package com.rtys.mtuobs.Business.Abstracts;

import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.Conselor;

import java.util.List;

public interface IConselorService {

    DataResult<List<Conselor>> getAll();
    Result add(Conselor conselor);
    DataResult<Conselor> findById(int id);
    DataResult<Conselor>findByEmailAddress(String emailAddress);
    Result update(int id);

}
