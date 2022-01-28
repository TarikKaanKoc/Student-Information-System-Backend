package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.NoteList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INoteListDao extends JpaRepository<NoteList,Integer> {
}
