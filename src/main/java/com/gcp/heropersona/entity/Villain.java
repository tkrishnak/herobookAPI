package com.gcp.heropersona.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Villain{
    @Id
    private String villainName;
    private String archRival;
    private String image;
    private String realName;
    private String heroName;
    private String height;
    private String weight;
    private String specialPower;
    private String intelligence;
    private String strength;
    private String power;
    private String speed;
    private String agility;
    private String description;
    private String story;

    public Villain(String villainName, String archRival, String image, String realName, String heroName, String height, String weight, String specialPower, String intelligence, String strength, String power, String speed, String agility, String description, String story) {
        this.villainName = villainName;
        this.archRival = archRival;
        this.image = image;
        this.realName = realName;
        this.heroName = heroName;
        this.height = height;
        this.weight = weight;
        this.specialPower = specialPower;
        this.intelligence = intelligence;
        this.strength = strength;
        this.power = power;
        this.speed = speed;
        this.agility = agility;
        this.description = description;
        this.story = story;
    }

    public Villain(String villainName) {
        this.villainName = villainName;
    }

    public Villain() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }

    public String getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(String intelligence) {
        this.intelligence = intelligence;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getAgility() {
        return agility;
    }

    public void setAgility(String agility) {
        this.agility = agility;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getArchRival() {
        return archRival;
    }

    public void setArchRival(String archRival) {
        this.archRival = archRival;
    }

    public String getVillainName() {
        return villainName;
    }

    public void setVillainName(String villainName) {
        this.villainName = villainName;
    }
}
