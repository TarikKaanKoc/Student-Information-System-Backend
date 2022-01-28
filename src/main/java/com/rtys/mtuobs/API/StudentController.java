package com.rtys.mtuobs.API;


import com.rtys.mtuobs.Business.Abstracts.IStudentService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Entities.Concretes.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/students")
public class StudentController {


    private IStudentService iStudentService;

    @Autowired
    public StudentController(IStudentService iStudentService) {
        this.iStudentService = iStudentService;
    }

    @GetMapping("/api/getAll")
    public DataResult<List<Student>> getAll(){
        return this.iStudentService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Student student) {
        return ResponseEntity.ok(this.iStudentService.add(student));
    }

    @GetMapping("/findByStudentNumber")
    public DataResult<String> findByStudentNumber(@RequestParam String studentNumber){
        return iStudentService.findByStudentNumber(studentNumber);
    }

    @GetMapping("/findByIdentityNumber")
    public DataResult<String> findByIdentityNumber(@RequestParam String identityNumber){
        return iStudentService.findByIdentityNumber(identityNumber);
    }


}
