package id.ac.ui.cs.advprog.MyAc.controller;

import id.ac.ui.cs.advprog.MyAc.model.Matkul;
import id.ac.ui.cs.advprog.MyAc.service.MatkulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/api/matkul")
public class MatkulController {

    @Autowired
    private MatkulService matkulService;

    @RequestMapping
    public String matkulHome(Model model) {

        Matkul[] listMatkul = matkulService.findAll();
        model.addAttribute("matkulALl", listMatkul);
        return "matkulSearch";

    }

    @GetMapping("/search")
    public String find(@RequestParam(required = false) String matkul, @RequestParam(required = false) String semester, Model model){

        List<Matkul> filteredMatkul = new ArrayList<>();
        if (matkul.length() == 0 && semester ==null){
            return "redirect:/api/matkul";
        }

        else if (matkul.length() != 0 && semester == null) {
            filteredMatkul = matkulService.findMatkul(matkul);
        }

        else if (matkul.length() != 0) {
            filteredMatkul = matkulService.findMatkulWithSemester(matkul, semester);
        }

        else if (matkul.length() == 0){
            filteredMatkul = matkulService.findMatkulBySemester(semester);
        }

        if (filteredMatkul.size() == 0){
            return "redirect:/api/matkul";
        }

        model.addAttribute("matkulALl", filteredMatkul);
        return "matkulSearch";

    }
}
