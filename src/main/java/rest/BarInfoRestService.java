package rest;

import models.BarInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import services.BarService;

import java.util.List;

@RestController
public class BarInfoRestService {

    @Autowired
    private BarService barService;

    @RequestMapping("/barinfo")
    public List<BarInfo> getAllBarInfo(){
        System.out.println("Get all bar info...");
        return barService.findAll();
    }

//    @RequestMapping(value = "/barinfo", method = RequestMethod.POST)
//
//    public BarInfo createBarInfo(BarInfo barInfo){
//        return barService.create(barInfo);
//    }
}
