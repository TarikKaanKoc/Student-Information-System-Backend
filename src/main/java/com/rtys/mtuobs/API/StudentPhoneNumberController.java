package com.rtys.mtuobs.API;

import com.rtys.mtuobs.Business.Abstracts.IStudentPhoneNumberService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Entities.Concretes.StudentPhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/studentsphonenumbers")
public class StudentPhoneNumberController {

    private IStudentPhoneNumberService studentPhoneNumberService;


    @Autowired
    public StudentPhoneNumberController(IStudentPhoneNumberService studentPhoneNumberService) {
        this.studentPhoneNumberService = studentPhoneNumberService;
    }

    @GetMapping("/getAll")
    public DataResult<List<StudentPhoneNumber>>getAll(){
        return this.studentPhoneNumberService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody  StudentPhoneNumber studentPhoneNumber){
        return ResponseEntity.ok(this.studentPhoneNumberService.add(studentPhoneNumber));
    }

}
