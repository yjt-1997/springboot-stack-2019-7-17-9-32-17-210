package com.tw.apistackbase;

import com.tw.apistackbase.dao.ProcuratorateRepository;
import com.tw.apistackbase.entity.Procuratorate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DataJpaTest
@ExtendWith(SpringExtension.class)
public class ProcuratorateTest {

    @Autowired
    private ProcuratorateRepository procuratorateRepository;

    @Test
    void should_save_given_procuratorate() {
        Procuratorate procuratorate = new Procuratorate();
        procuratorate.setInquisitors(null);
        procuratorate.setName("OOCL");

        procuratorateRepository.save(procuratorate);
        Procuratorate fetchPro = procuratorateRepository.findById(procuratorate.getId()).get();

        assertEquals(fetchPro.getName(),"OOCL");
    }
}
