package com.example.func;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FuncController {

    @Autowired
    private FuncRepository funcRepository;

    @GetMapping("/")
    public List<Func> find() {
        return funcRepository.findAll();
    }

    @PostMapping("/")
    public void create(@RequestBody Func func) {
        funcRepository.save(func);
    }

}
