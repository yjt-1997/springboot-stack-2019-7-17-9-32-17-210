package com.tw.apistackbase.service;

import com.tw.apistackbase.dao.CaseRepository;
import com.tw.apistackbase.entity.Case;
import org.springframework.beans.factory.annotation.Autowired;

public class CaseService {
    @Autowired
    private CaseRepository caseRepository;

    public Case save(Case mycase) {
        if (mycase.getHappenedTime() == null || mycase.getName() == null) {
            return null;
        } else {
            return caseRepository.save(mycase);
        }
    }

}
