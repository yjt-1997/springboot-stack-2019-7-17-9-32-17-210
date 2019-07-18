package com.tw.apistackbase;

import com.tw.apistackbase.dao.CaseRepository;
import com.tw.apistackbase.dao.ProcuratorateRepository;
import com.tw.apistackbase.entity.Case;
import com.tw.apistackbase.entity.Procuratorate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


@DataJpaTest
@ExtendWith(SpringExtension.class)
public class CaseTest {

    @Autowired
    private CaseRepository caseRepository;

    @Test
    void should_save_case_given_case() {
        Case toSaveCase = new Case();
        toSaveCase.setHappenedTime(new Date().getTime());
        toSaveCase.setName("TestCase");

        caseRepository.save(toSaveCase);
        Case fetchCae = caseRepository.findById(toSaveCase.getId()).get();

        assertEquals(fetchCae.getName(), "TestCase");
    }

    @Test
    void should_list_cases_by_time() {
        Case case1 = new Case();
        case1.setName("TestCase1");
        case1.setHappenedTime(System.currentTimeMillis());
        Case case2 = new Case();
        case2.setName("TestCase2");
        case1.setHappenedTime(System.currentTimeMillis()-1000);

        caseRepository.save(case1);
        caseRepository.save(case2);
        List<Case> cases = caseRepository.findAllByOrderByHappenedTimeDesc();

        assertEquals(cases.size(), 2);
        assertEquals(cases.get(0).getName(),"TestCase1");
        assertEquals(cases.get(1).getName(),"TestCase2");
    }

    @Test
    void should_return_list_of_case_given_caseName() {
        Case case1 = new Case();
        case1.setName("TestCase1");
        Case case2 = new Case();
        case2.setName("TestCase2");

        caseRepository.save(case1);
        caseRepository.save(case2);
        List<Case> fetchCases = caseRepository.findAllByNameIsLike("%TestCase%");

        assertEquals(fetchCases.size(), 2);
    }

    @Test
    void should_delete_case_given_caseId() {
        Case case1 = new Case();
        case1.setName("TestCase1");

        caseRepository.save(case1);
        caseRepository.deleteById(case1.getId());
        Case fetchCase = caseRepository.findById(case1.getId()).orElse(null);

        assertNull(fetchCase);
    }
}
