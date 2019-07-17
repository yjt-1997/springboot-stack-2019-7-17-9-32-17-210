package com.tw.apistackbase.service;

import com.tw.apistackbase.dao.CaseRepository;
import com.tw.apistackbase.dao.InquisitorRepository;
import com.tw.apistackbase.entity.Case;
import com.tw.apistackbase.entity.Inquisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InquisitorService {
    @Autowired
    private InquisitorRepository inquisitorRepository;

    public Inquisitor findById(int id) {
        return inquisitorRepository.findById(id).get();
    }

}
