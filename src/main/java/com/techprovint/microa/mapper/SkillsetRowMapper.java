package com.techprovint.microa.mapper;

import com.techprovint.microa.model.Skillset;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SkillsetRowMapper implements RowMapper<Skillset> {
    @Override
    public Skillset mapRow(ResultSet rs, int rowNum) throws SQLException {
        Skillset skillset = new Skillset();

//        employee.setId(rs.getInt("ID"));
//        employee.setFirstName(rs.getString("FIRST_NAME"));
//        employee.setLastName(rs.getString("LAST_NAME"));
//        employee.setAddress(rs.getString("ADDRESS"));

        return skillset;
    }
}