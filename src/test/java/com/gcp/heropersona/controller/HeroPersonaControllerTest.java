package com.gcp.heropersona.controller;

import com.gcp.heropersona.entity.Hero;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
public class HeroPersonaControllerTest {

    @Autowired
    private MockMvc mvc;
    private List<Hero> heroList;


    @Test
    public void testFindAllHeros() throws Exception {
        mvc.perform(
                (get("/gcp/api/heros")))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].heroName").value("Batman"))
                .andExpect(jsonPath("$[1].heroName").value("SpiderMan"))
                .andExpect(jsonPath("length()").value(3));
    }

    @Test
    public void testFindHeroByName() throws Exception {
        String expected = "{ \"image\":\"/src/batman.jpg\",\n" +
                "\"realName\":\"Bruce Wayne\",\n" +
                "\"heroName\":\"Batman\",\n" +
                "\"height\":\"6 feet\",\n" +
                "\"weight\":\"180 lbs\", \"specialPower\":\"None\",\n" +
                "\"intelligence\":\"100\",\n" +
                "\"strength\":\"90\", \"power\":\"None\", \"speed\":\"Normal\", \"agility\":\"60\", \"description\":\"Fighting crime at night wearing bat suit\", \"story\":\"Turned into batman to make the gotham city safer\" }";

        mvc.perform(
                (get("/gcp/api/heros/Batman")))
                .andExpect(status().isOk())
                .andExpect(content().json(expected));

    }

    @Test
    public void testNoHeroFound() throws Exception {
        String expected = "Hero doesn't exist";
        mvc.perform(
                (get("/gcp/api/heros/xxx")))
                .andExpect(status().isNotFound())
                .andExpect(content().string(expected));
    }
    @Test
    public void testFindAllVillains() throws Exception {
        mvc.perform(
                (get("/gcp/api/villains")))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].villainName").value("Joker"))
                .andExpect(jsonPath("$[1].villainName").value("Dr.Octopus"))
                .andExpect(jsonPath("length()").value(3));
    }

    @Test
    public void testFindVillainByName() throws Exception {
        String expected = "{ \"archRival\":\"Batman\", \"image\":\"/src/joker.jpg\",\n" +
                "\"realName\":\"Jack Napier\",\n" +
                "\"heroName\":\"Batman\",\n" +
                "\"height\":\"6 feet\",\n" +
                "\"weight\":\"180 lbs\", \"specialPower\":\"None\",\n" +
                "\"intelligence\":\"200\",\n" +
                "\"strength\":\"60\", \"power\":\"None\", \"speed\":\"Fast\", \"agility\":\"70\", " +
                "\"description\":\"Fighting Batman\", \"story\":\"Fight Batman with all his evil ideas\" }";

        mvc.perform(
                (get("/gcp/api/villains/Joker")))
                .andExpect(status().isOk())
                .andExpect(content().json(expected));

    }

    @Test
    public void testNoVillainFound() throws Exception {
        String expected = "Villain doesn't exist";
        mvc.perform(
                (get("/gcp/api/villains/xxx")))
                .andExpect(status().isNotFound())
                .andExpect(content().string(expected));
    }
}
