package com.rtys.mtuobs.API;

import com.rtys.mtuobs.Business.Abstracts.IStudentBankAccountService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Entities.Concretes.StudentBankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/BankAccounts")
public class StudentBankAccountController {

    private IStudentBankAccountService iStudentBankAccountService;

    @Autowired
    public StudentBankAccountController(IStudentBankAccountService iStudentBankAccountService) {
        this.iStudentBankAccountService = iStudentBankAccountService;
    }

    @GetMapping("/getAll")
    public DataResult<List<StudentBankAccount>> getAll(){
        return this.iStudentBankAccountService.getAll();
    }

    @PostMapping("/api/add")
    public ResponseEntity<?>add(StudentBankAccount studentBankAccount){
        return ResponseEntity.ok(this.iStudentBankAccountService.add(studentBankAccount));
    }
}
