package com.example.third.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.third.model.Queries;
import com.example.third.service.QueryService;

@RestController
@RequestMapping("/api")

public class QueryController {
    
    @Autowired
    QueryService queryService;

    @GetMapping("/show_all")
    public List<Queries> getDetails(){
        return queryService.getTableDatas();
    }

    @GetMapping("/show_all/{activeState}/{deignationList}")
    public List<Queries> getDatas(@PathVariable String activeState,@PathVariable List<String> designationList){
        return queryService.getDetails(activeState,designationList);
    }
}
