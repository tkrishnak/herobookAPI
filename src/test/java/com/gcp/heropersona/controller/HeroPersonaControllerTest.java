package com.gcp.heropersona.controller;

import com.gcp.heropersona.service.HeroPersonaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
public class HeroPersonaControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testFindAllHeros() throws Exception {
        mvc.perform(
                (get("/gcp/api/heros")))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].heroName").value("Batman"))
                .andExpect(jsonPath("$[1].heroName").value("SpiderMan"));
    }


}
