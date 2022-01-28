package com.rtys.mtuobs.API;


import com.rtys.mtuobs.Business.Abstracts.IStudentAccountPasswordService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Entities.Concretes.StudentAccountPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/studentsaccountpasswords")
public class StudentAccountPasswordController {

    private IStudentAccountPasswordService iStudentAccountPasswordService;

    @Autowired
    public StudentAccountPasswordController(IStudentAccountPasswordService iStudentAccountPasswordService) {
        this.iStudentAccountPasswordService = iStudentAccountPasswordService;
    }

    @GetMapping("/getAll")
    public DataResult<List<StudentAccountPassword>>getAll(){
        return this.iStudentAccountPasswordService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody StudentAccountPassword studentAccountPassword){
        return ResponseEntity.ok(studentAccountPassword);
    }

}
