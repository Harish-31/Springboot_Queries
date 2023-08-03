package com.example.third.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.third.model.Queries;
import com.example.third.repository.QueryRepository;

@Service
public class QueryService {
    
    @Autowired
    QueryRepository queryRepository;

    public List<Queries> getTableDatas(){
        return queryRepository.findAllData();
    }

    public List<Queries> getDetails(String activeState,List<String> designationList){
        return queryRepository.findData(activeState,designationList);
    }

}
