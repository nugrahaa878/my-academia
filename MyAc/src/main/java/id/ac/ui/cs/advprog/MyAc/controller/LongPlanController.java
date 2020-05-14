package id.ac.ui.cs.advprog.MyAc.controller;

import id.ac.ui.cs.advprog.MyAc.model.LongPlan;
import id.ac.ui.cs.advprog.MyAc.model.Matkul;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Controller
@RequestMapping(path = "/longplan")
public class LongPlanController {

    @GetMapping
    public String longPlan() throws IOException {

        RestTemplate restTemplate = new RestTemplate();
        Matkul[] arrLongPlan = restTemplate.getForObject("http://matkulservice.herokuapp.com/matkul", Matkul[].class);

        for(Matkul longplan : arrLongPlan){
            System.out.println(longplan.getNama());
        }

        return "longPlan";
    }

    @GetMapping("/edit")
    public String longPlanEdit() {
        return "longPlanEdit";
    }

    @GetMapping("/create")
    public String longPlanCreate() {
        return "longPlanCreate";
    }
}
