package com.gcp.heropersona.entity;

public class Villain extends Hero{
    private String villainName;
    private String archRival;

    public Villain(String villainName, String archRival, String image, String realName, String heroName, String height, String weight, String specialPower, String intelligence, String strength, String power, String speed, String agility, String description, String story) {
        super(image, realName, heroName, height, weight, specialPower, intelligence, strength, power, speed, agility, description, story);
        this.archRival = archRival;
        this.villainName = villainName;
    }

    public Villain(String villainName) {
        this.villainName = villainName;
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
