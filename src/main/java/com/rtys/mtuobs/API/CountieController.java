package com.rtys.mtuobs.API;

import com.rtys.mtuobs.Business.Abstracts.ICountieService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Entities.Concretes.Countie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/counties")
public class CountieController {


    private ICountieService iCountieService;

    @Autowired
    public CountieController(ICountieService iCountieService) {
        this.iCountieService = iCountieService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Countie>>getAll(){
        return iCountieService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Countie countie){
        return ResponseEntity.ok(this.iCountieService.add(countie));
    }


}
