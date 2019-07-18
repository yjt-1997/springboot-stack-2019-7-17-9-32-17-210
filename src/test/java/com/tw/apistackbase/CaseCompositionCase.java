package com.tw.apistackbase;

import com.tw.apistackbase.dao.CaseCompositionRepository;
import com.tw.apistackbase.dao.CaseRepository;
import com.tw.apistackbase.dao.ProcuratorateRepository;
import com.tw.apistackbase.entity.Case;
import com.tw.apistackbase.entity.CaseComposition;
import com.tw.apistackbase.entity.Procuratorate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Calendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


@DataJpaTest
@ExtendWith(SpringExtension.class)
public class CaseCompositionCase {

    @Autowired
    private CaseCompositionRepository caseCompositionRepository;
    @Autowired
    private CaseRepository caseRepository;

    @Test
    void should_save_case_composition() {
        CaseComposition caseComposition1 = new CaseComposition();
        caseComposition1.setObjectiveDescription("ObjectiveDescription");
        caseComposition1.setSubjectiveDescription("SubjectiveDescription");

        caseCompositionRepository.save(caseComposition1);
        CaseComposition fetch1 = caseCompositionRepository.findById(caseComposition1.getId()).get();

        assertEquals(fetch1.getObjectiveDescription(), "ObjectiveDescription");
    }

    @Test
    void should_associate_case_and_composition() {
        CaseComposition caseComposition = new CaseComposition();
        caseComposition.setObjectiveDescription("ObjectiveDescription");
        caseComposition.setSubjectiveDescription("SubjectiveDescription");
        Case mycase = new Case();
        mycase.setCaseComposition(caseComposition);

        caseCompositionRepository.save(caseComposition);
        caseRepository.save(mycase);

        Case fetchCase = caseRepository.findById(mycase.getId()).get();

        assertEquals(fetchCase.getCaseComposition(), caseComposition);
    }
}
