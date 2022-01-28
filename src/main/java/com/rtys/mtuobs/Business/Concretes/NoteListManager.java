package com.rtys.mtuobs.Business.Concretes;

import com.rtys.mtuobs.Business.Abstracts.INoteListService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Core.Utilities.SuccessDataResult;
import com.rtys.mtuobs.Core.Utilities.SuccessResult;
import com.rtys.mtuobs.DataAccess.INoteListDao;
import com.rtys.mtuobs.Entities.Concretes.NoteList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteListManager implements INoteListService {

    private INoteListDao noteListDao;

    @Autowired
    public NoteListManager(INoteListDao noteListDao) {
        this.noteListDao = noteListDao;
    }

    @Override
    public DataResult<List<NoteList>> getAll() {
        return new SuccessDataResult<List<NoteList>>(this.noteListDao.findAll(),"Data listed");
    }

    @Override
    public Result add(NoteList noteList) {
        this.noteListDao.save(noteList);
        return new SuccessResult("Successful");
    }
}
