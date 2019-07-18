package com.wx.exam1.service.imp;

import com.wx.exam1.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FilmServiceImp implements FilmService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 插入一条数据到film表
     *
     * @param TITLE
     * @param DESCRIPTION
     * @param LANGUAGEID
     */
    @Transactional
    public void insert(String TITLE, String DESCRIPTION, Integer LANGUAGEID,Integer Times) {
        jdbcTemplate.update("INSERT INTO film(title.description,language_id) VALUES (?,?,?)", TITLE, DESCRIPTION, LANGUAGEID);
        if (Times == 1) {
            throw new RuntimeException("第一次添加");
        }
        Times++;
    }

}
