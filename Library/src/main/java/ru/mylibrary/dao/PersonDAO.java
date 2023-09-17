package ru.mylibrary.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDAO {
    private final JdbcTemplate jdbcTemplate;


    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
