package com.tw.apistackbase.service;

import com.tw.apistackbase.dao.CaseRepository;
import com.tw.apistackbase.entity.Case;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

    public Case findById(int id) {
        return caseRepository.findById(id).get();
    }

    public List<Case> findOrderByHappenedTime() {
        return caseRepository.findAllOrderByHappenedTime();
    }

    public List<Case> findAllByNameIsLike(String name) {
        return caseRepository.findAllByNameIsLike(name);
    }

    public void deleteById(int id) {
        caseRepository.deleteById(id);
    }

}
