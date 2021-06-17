package com.disqo.trainings.lesson11;

public enum Direction {

    NORTH("hyusis"),
    WEST("arevmutq"),

    EAST("arevelq");

    private String alias;

    Direction(String alias ) {
        this.alias = alias;
    }


    public String getAlias() {
        return alias;
    }
}
