package com.example.masterlist.repository;


import com.example.masterlist.model.MasterList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterListRepository extends JpaRepository<MasterList, Long> {
}
