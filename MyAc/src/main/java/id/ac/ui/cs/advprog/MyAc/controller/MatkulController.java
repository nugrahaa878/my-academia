package id.ac.ui.cs.advprog.MyAc.controller;

import id.ac.ui.cs.advprog.MyAc.model.Matkul;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RestController
@RequestMapping(path = "/matkul")
public class MatkulController {

    @GetMapping("/cobaapi")
    public String getSemua(Model model) throws IOException {

        RestTemplate restTemplate = new RestTemplate();
        Matkul[] listMatkul = restTemplate.getForObject("http://matkulservice.herokuapp.com/matkul", Matkul[].class);

        model.addAttribute(listMatkul);
        for (Matkul matkul :
                listMatkul) {
            System.out.println(matkul.getNama());
        }
        return null;
    }

}
