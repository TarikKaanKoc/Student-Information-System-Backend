package com.rtys.mtuobs.API;

import com.rtys.mtuobs.Business.Abstracts.IStudentSemesterFeeInformationService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Entities.Concretes.StudentSemesterFeeInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/studentssemesterfeeinformation")
public class StudentSemesterFeeInformationController {

    private IStudentSemesterFeeInformationService studentSemesterFeeInformationService;


    @Autowired
    public StudentSemesterFeeInformationController(IStudentSemesterFeeInformationService studentPhoneNumberService) {
        this.studentSemesterFeeInformationService = studentPhoneNumberService;
    }

    @GetMapping("/getAll")
    public DataResult<List<StudentSemesterFeeInformation>> getAll(){
        return this.studentSemesterFeeInformationService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody StudentSemesterFeeInformation studentSemesterFeeInformation){
        return ResponseEntity.ok(this.studentSemesterFeeInformationService.add(studentSemesterFeeInformation));
    }
}
