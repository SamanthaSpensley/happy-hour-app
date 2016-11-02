package barinfo.rest;

import barinfo.models.BarInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import barinfo.services.BarService;

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

    @RequestMapping(value = "/barinfo", method = RequestMethod.POST)
    // used to convert your incoming Json request to Model object
    public @ResponseBody BarInfo createBarInfo(@RequestBody BarInfo barInfo){
        return barService.create(barInfo);
    }
}
