package com.rtys.mtuobs.API;

import com.rtys.mtuobs.Business.Abstracts.ILessonLearnedThisSemesterService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Entities.Concretes.LessonsLearnedThisSemester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/lessonlearnedthissemester")
public class LessonLearnedThisSemesterController {

    private ILessonLearnedThisSemesterService lessonLearnedThisSemesterService;

    @Autowired
    public LessonLearnedThisSemesterController(ILessonLearnedThisSemesterService lessonLearnedThisSemesterService) {
        this.lessonLearnedThisSemesterService = lessonLearnedThisSemesterService;
    }

    @GetMapping("/getAll")
    public DataResult<List<LessonsLearnedThisSemester>>getAll(){
        return this.lessonLearnedThisSemesterService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody LessonsLearnedThisSemester lessonsLearnedThisSemester){
        return ResponseEntity.ok(this.lessonLearnedThisSemesterService.add(lessonsLearnedThisSemester));
    }
}
