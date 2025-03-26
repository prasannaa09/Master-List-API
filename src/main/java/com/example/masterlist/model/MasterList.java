package com.example.masterlist.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "master_list")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MasterList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String parentCode;
    private String parentName;
    private String name;
    private String plan;
    private String option;
    private String optionFrequency;
    private String subCategory;
    private String sector;
    private String benchmark;
    private Integer faceValue;

    @Column(columnDefinition = "jsonb")
    @JdbcTypeCode(SqlTypes.JSON)
    private String transactionModeAllowed;
}