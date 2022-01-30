package com.rtys.mtuobs.API;

import com.rtys.mtuobs.Business.Abstracts.IConselorService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Core.Utilities.Result;
import com.rtys.mtuobs.Entities.Concretes.Conselor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/conselors")
public class ConselorController {


    private IConselorService conselorService;

    @Autowired
    public ConselorController(IConselorService conselorService) {
        this.conselorService = conselorService;
    }


    @GetMapping("/getAll")
    public DataResult<List<Conselor>> getAll(){
        return conselorService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Conselor conselor){
        return ResponseEntity.ok(this.conselorService.add(conselor));
    }

    @GetMapping("/findById")
    public DataResult<Conselor> findById(@RequestParam int id){
        return conselorService.findById(id);
    }

    @GetMapping("/findByEmailAddress")
    public DataResult<Conselor>findByEmailAddress(@RequestParam String emailAddress){
        return conselorService.findByEmailAddress(emailAddress);
    }

    @PutMapping("/update")
    public Result update(@RequestBody int id){
        return this.conselorService.update(id);
    }


}
