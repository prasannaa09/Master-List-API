package com.example.masterlist.controller;

import com.example.masterlist.model.MasterList;
import com.example.masterlist.service.MasterListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2/master_list")
public class MasterListController {

    @Autowired
    private MasterListService service;

    @PostMapping
    public ResponseEntity<MasterList> createMasterList(@RequestBody MasterList masterList) {
        MasterList savedData = service.saveMasterList(masterList);
        return ResponseEntity.ok(savedData);
    }

    @GetMapping
    public List<MasterList> getAllMasterLists() {
        return service.getAllMasterLists();
    }
}

