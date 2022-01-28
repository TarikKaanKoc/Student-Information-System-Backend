package com.rtys.mtuobs.Business.Abstracts;

import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.NoteList;

import java.util.List;

public interface INoteListService {

    DataResult<List<NoteList>> getAll();
    Result add(NoteList noteList);
}
