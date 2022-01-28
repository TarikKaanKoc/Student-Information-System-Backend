package com.rtys.mtuobs.API;

import com.rtys.mtuobs.Business.Abstracts.ICityService;
import com.rtys.mtuobs.Core.Utilities.DataResult;
import com.rtys.mtuobs.Entities.Concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/cities")
public class CityController {

    private ICityService cityService;


    @Autowired
    public CityController(ICityService cityService){
      this.cityService=cityService;

    }

    @GetMapping(value = "/getAll")
    public DataResult<List<City>> getAll(){
        return cityService.getAll();
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> add( @RequestBody City city){
        return ResponseEntity.ok(this.cityService.add(city));
    }


}
