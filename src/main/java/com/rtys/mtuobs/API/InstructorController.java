package com.rtys.mtuobs.API;

import com.rtys.mtuobs.Business.Abstracts.IInstructorService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Entities.Concretes.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/instroctors")
public class InstructorController {

    private IInstructorService iInstructorService;

    @Autowired
    public InstructorController(IInstructorService iInstructorService) {
        this.iInstructorService = iInstructorService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Instructor>>getAll(){
        return this.iInstructorService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?>add(@RequestBody Instructor instructor){
        return ResponseEntity.ok(this.iInstructorService.add(instructor));
    }
}
