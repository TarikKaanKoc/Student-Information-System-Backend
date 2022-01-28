package com.rtys.mtuobs.API;

import com.rtys.mtuobs.Business.Abstracts.IStudentEmailAddressService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Entities.Concretes.StudentEmailAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/studentsemailadress")
public class StudentEmailAddressController {

    private IStudentEmailAddressService studentEmailAddressService;


    @Autowired
    public StudentEmailAddressController(IStudentEmailAddressService studentEmailAddressService) {
        this.studentEmailAddressService = studentEmailAddressService;
    }

    @GetMapping("/getAll")
    public DataResult<List<StudentEmailAddress>>getAll(){
        return this.studentEmailAddressService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?>add(@RequestBody StudentEmailAddress studentEmailAddress) {
        return ResponseEntity.ok(this.studentEmailAddressService.add(studentEmailAddress));
    }
}
