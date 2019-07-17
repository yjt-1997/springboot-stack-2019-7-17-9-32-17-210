package com.tw.apistackbase.dao;

import com.tw.apistackbase.entity.CaseComposition;
import com.tw.apistackbase.entity.Inquisitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InquisitorRepository extends JpaRepository<Inquisitor, Integer> {
}
