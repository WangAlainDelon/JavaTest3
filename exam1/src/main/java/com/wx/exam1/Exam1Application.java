package com.wx.exam1;

import com.wx.exam1.service.FilmService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootApplication
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Exam1Application {
    private final static String TITLE = System.getenv("TITLE");
    private final static String DESCRIPTION = System.getenv("DESCRIPTION");
    private final static String LANGUAGEID = System.getenv("LANGUAGEID");
    private final static Integer Times = 1;

    public static void main(String[] args) {
        SpringApplication.run(Exam1Application.class, args);
        Exam1Application exam1Application = new Exam1Application();
        exam1Application.testorder();
    }

    @Autowired
    private FilmService filmService;

    public void testorder() {
        System.out.println("Context Start");
        System.out.println("Film Title:");
        System.out.println(TITLE);
        System.out.println("Film Description:");
        System.out.println(DESCRIPTION);
        System.out.println("Film LanguageId:");
        System.out.println(LANGUAGEID);
        filmService.insert(TITLE, DESCRIPTION, Integer.parseInt(LANGUAGEID), Times);
        System.out.println("Context Stop");
    }


}
