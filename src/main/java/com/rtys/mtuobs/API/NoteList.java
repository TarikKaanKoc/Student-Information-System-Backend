package com.rtys.mtuobs.API;

import com.rtys.mtuobs.Business.Abstracts.INoteListService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/notelist")
public class NoteList {

    private INoteListService iNoteListService;

    @Autowired
    public NoteList(INoteListService iNoteListService) {
        this.iNoteListService = iNoteListService;
    }

    @GetMapping("/getAll")
    public DataResult<List<com.rtys.mtuobs.Entities.Concretes.NoteList>> getAll(){
        return this.iNoteListService.getAll();
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> add(@RequestBody com.rtys.mtuobs.Entities.Concretes.NoteList noteList){
        return ResponseEntity.ok(this.iNoteListService.add(noteList));
    }
}
