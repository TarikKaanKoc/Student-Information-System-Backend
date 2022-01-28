package com.rtys.mtuobs.API;


import com.rtys.mtuobs.Business.Abstracts.IStudentContactInformationService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Entities.Concretes.StudentContactInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/studentscontactinformations")
public class StudentContactInformationController {

    private IStudentContactInformationService iStudentContactInformationService;


    @Autowired
    public StudentContactInformationController(IStudentContactInformationService iStudentContactInformationService) {
        this.iStudentContactInformationService = iStudentContactInformationService;
    }

    @GetMapping("/getAll")
    public DataResult<List<StudentContactInformation>> getAll(){
        return this.iStudentContactInformationService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(StudentContactInformation studentContactInformation){
    return ResponseEntity.ok(this.iStudentContactInformationService.add(studentContactInformation));
    }


}
