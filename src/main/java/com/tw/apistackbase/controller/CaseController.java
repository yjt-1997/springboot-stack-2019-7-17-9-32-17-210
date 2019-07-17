package com.tw.apistackbase.controller;

import com.tw.apistackbase.entity.Case;
import com.tw.apistackbase.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CaseController {

    @Autowired
    private CaseService caseService;

    @PostMapping("/cases")
    public ResponseEntity<Case> save(@RequestBody Case toSaveCase) {
        return ResponseEntity.status(HttpStatus.CREATED).body(caseService.save(toSaveCase));
    }

    @GetMapping("/cases/caseId/{caseId}")
    public ResponseEntity<Case> save(@PathVariable int caseId) {
        return ResponseEntity.status(HttpStatus.OK).body(caseService.findById(caseId));
    }

    @GetMapping("/cases/timeSort")
    public ResponseEntity<List<Case>> findByTime() {
        return ResponseEntity.status(HttpStatus.OK).body(caseService.findOrderByHappenedTime());
    }

    @GetMapping("/cases/name/{caseName}")
    public ResponseEntity<List<Case>> findByName(@PathVariable String caseName) {
        return ResponseEntity.status(HttpStatus.OK).body(caseService.findAllByNameIsLike(caseName));
    }

    @DeleteMapping("/cases/caseId/{caseId}")
    public void deleteById(@PathVariable int caseId) {
        //ResponseEntity.status(HttpStatus.OK).
        caseService.deleteById(caseId);
    }
}
