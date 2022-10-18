package com.hillel.dzhurynskyi.homework.hm17;

public enum DrinksMachine {
    COFFEE("кофе"),
    TEE("чай"),
    LEMONADE("лимонад"),
    MOJITO("мохіто"),
    MINERAL_WATER("мінералка"),
    COCA_COLA("кока-кола");
    private final String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
