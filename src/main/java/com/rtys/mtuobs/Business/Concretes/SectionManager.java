package com.rtys.mtuobs.Business.Concretes;

import com.rtys.mtuobs.Business.Abstracts.ISectionService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Core.Utilities.SuccessDataResult;
import com.rtys.mtuobs.Core.Utilities.SuccessResult;
import com.rtys.mtuobs.DataAccess.ISectionDao;
import com.rtys.mtuobs.Entities.Concretes.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionManager implements ISectionService {

    private ISectionDao sectionDao;

    @Autowired
    public SectionManager(ISectionDao sectionDao) {
        this.sectionDao = sectionDao;
    }

    @Override
    public DataResult<List<Section>> getAll() {
        return new SuccessDataResult<List<Section>>(this.sectionDao.findAll(),"Data listed");
    }

    @Override
    public Result add(Section section) {
        this.sectionDao.save(section);
        return new SuccessResult("Successful");
    }
}
