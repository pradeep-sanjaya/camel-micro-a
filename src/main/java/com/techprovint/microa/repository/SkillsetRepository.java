package com.techprovint.microa.repository;

import com.techprovint.microa.model.Skillset;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Table;

//@Table(name = "NIrtd_MWIND_SKLST")
public interface SkillsetRepository extends CrudRepository<Skillset, Long> {

    //List<Skillset> findByNIrtd_SKLST_SKILLSET_ID(String lastName);

    Skillset findByNIrtdSKLSTSKILLSETID(long id);
}