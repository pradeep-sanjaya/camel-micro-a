package com.techprovint.microa.model;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "NIrtd_MWIND_SKLST")
@ToString
public class Skillset {
    @Id
    //@GeneratedValue(strategy= GenerationType.TABLE)
    @Column(name = "NIrtd_SKLST_SKILLSET_ID")
    private Long NIrtdSKLSTSKILLSETID;
}
