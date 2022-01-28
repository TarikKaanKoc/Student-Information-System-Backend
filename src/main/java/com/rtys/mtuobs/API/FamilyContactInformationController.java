package com.rtys.mtuobs.API;

import com.rtys.mtuobs.Business.Abstracts.IFamilyContactInformationService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Entities.Concretes.FamilyContactInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/students'familycontactinformation")
public class FamilyContactInformationController {

    private IFamilyContactInformationService familyContactInformationService;


    @Autowired
    public FamilyContactInformationController(IFamilyContactInformationService familyContactInformationService) {
        this.familyContactInformationService = familyContactInformationService;
    }

    @GetMapping("/getAll")
    public DataResult<List<FamilyContactInformation>>getAll(){
        return this.familyContactInformationService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody FamilyContactInformation familyContactInformation){
        return ResponseEntity.ok(this.familyContactInformationService.add(familyContactInformation));
    }
}
