package com.rtys.mtuobs.API;

import com.rtys.mtuobs.Business.Abstracts.IFacultyService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Entities.Concretes.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/faculties")
public class FacultyController {

    private IFacultyService iFacultyService;

    @Autowired
    public FacultyController(IFacultyService iFacultyService) {
        this.iFacultyService = iFacultyService;
    }

    @GetMapping(value = "/getAll")
    public DataResult<List<Faculty>>getAll(){
        return this.iFacultyService.getAll();
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?>add(@RequestBody Faculty faculty){
        return ResponseEntity.ok(this.iFacultyService.add(faculty));
    }

}
