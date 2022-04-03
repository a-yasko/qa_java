package com.example;
import java.util.List;

public class LionAlex extends Lion {

    private static final String sex = "Самец";
    boolean hasMane;

    public LionAlex() throws Exception {
        super(sex);
        this.hasMane = true;
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return getKittens(0);
    }

}
