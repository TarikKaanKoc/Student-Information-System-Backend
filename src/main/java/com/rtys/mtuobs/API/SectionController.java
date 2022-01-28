package com.rtys.mtuobs.API;

import com.rtys.mtuobs.Business.Abstracts.ISectionService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Entities.Concretes.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/sections")
public class SectionController {


    private ISectionService iSectionService;


    @Autowired
    public SectionController(ISectionService iSectionService) {
        this.iSectionService = iSectionService;
    }


    @GetMapping("/getAll")
    public DataResult<List<Section>> getAll(){
        return iSectionService.getAll();
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> add(@RequestBody Section section){
        return ResponseEntity.ok(this.iSectionService.add(section));
    }

}
