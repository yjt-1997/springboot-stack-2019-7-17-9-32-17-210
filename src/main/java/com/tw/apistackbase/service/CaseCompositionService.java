package com.tw.apistackbase.service;

import com.tw.apistackbase.dao.CaseCompositionRepository;
import com.tw.apistackbase.entity.Case;
import com.tw.apistackbase.entity.CaseComposition;
import com.tw.apistackbase.utils.ObjectJudge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseCompositionService {

    @Autowired
    private CaseCompositionRepository caseCompositionRepository;

    public CaseComposition save(CaseComposition caseComposition) throws Exception {
        if (!ObjectJudge.isObjectNull(caseComposition, "id")) {
            return caseCompositionRepository.save(caseComposition);
        }
        return null;
    }

    public List<CaseComposition> findByExample(CaseComposition caseComposition){
        //return caseCompositionRepository.findAllByExample(caseComposition);
        return null;
    }
}
