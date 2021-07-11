package com.techprovint.microa.runner;

import com.techprovint.microa.mapper.SkillsetRowMapper;
import com.techprovint.microa.model.Skillset;
import com.techprovint.microa.repository.SkillsetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StartupRunner implements CommandLineRunner {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    SkillsetRepository skillsetRepository;

    @Override
    public void run(String... strings) throws Exception {
        log.info("StartupRunner.run");
        for (Skillset skillset : skillsetRepository.findAll()) {
            log.info(skillset.toString());
        }
    }
}
