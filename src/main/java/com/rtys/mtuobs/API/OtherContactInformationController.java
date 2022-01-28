package com.rtys.mtuobs.API;

import com.rtys.mtuobs.Business.Abstracts.IOtherContactInformationService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Entities.Concretes.OtherContactInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/othercontactinformation")
public class OtherContactInformationController {

    private IOtherContactInformationService otherContactInformationService;

    @Autowired
    public OtherContactInformationController(IOtherContactInformationService iOtherContactInformationService) {
        this.otherContactInformationService = iOtherContactInformationService;
    }

    @GetMapping("/getAll")
    public DataResult<List<OtherContactInformation>> getAll(){
        return this.otherContactInformationService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody OtherContactInformation otherContactInformation){
        return ResponseEntity.ok(this.otherContactInformationService.add(otherContactInformation));
    }

}
