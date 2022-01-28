package com.rtys.mtuobs.API;

import com.rtys.mtuobs.Business.Abstracts.IStudentPlacmentTypeService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Entities.Concretes.StudentPlacmentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/studentplacmenttypes")
public class StudentPlacmentTypeController {

    private IStudentPlacmentTypeService studentPlacmentTypeService;


    @Autowired
    public StudentPlacmentTypeController(IStudentPlacmentTypeService studentPlacmentTypeService) {
        this.studentPlacmentTypeService= studentPlacmentTypeService;
    }

    @GetMapping("/getAll")
    public DataResult<List<StudentPlacmentType>> getAll(){
        return this.studentPlacmentTypeService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody StudentPlacmentType studentPlacmentType){
        return ResponseEntity.ok(this.studentPlacmentTypeService.add(studentPlacmentType));
    }



}
