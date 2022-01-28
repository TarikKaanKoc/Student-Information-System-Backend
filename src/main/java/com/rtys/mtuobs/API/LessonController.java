package com.rtys.mtuobs.API;


import com.rtys.mtuobs.Business.Abstracts.ILessonService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Entities.Concretes.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/lessons")
public class LessonController {

    private ILessonService iLessonService;

    @Autowired
    public LessonController(ILessonService iLessonService) {
        this.iLessonService = iLessonService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Lesson>> getAll(){
        return iLessonService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Lesson lesson){
        return ResponseEntity.ok(this.iLessonService.add(lesson));
    }

}

