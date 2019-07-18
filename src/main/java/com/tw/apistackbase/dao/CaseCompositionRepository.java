package com.tw.apistackbase.dao;

import com.tw.apistackbase.entity.CaseComposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaseCompositionRepository extends JpaRepository<CaseComposition, Integer> {
}
