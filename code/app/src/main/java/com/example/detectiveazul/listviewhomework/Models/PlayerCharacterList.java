package com.example.detectiveazul.listviewhomework.Models;

import java.util.ArrayList;

public class PlayerCharacterList {
    private ArrayList<PlayerCharacter> characterList;

    public PlayerCharacterList() {
        characterList = new ArrayList<>();

        this.characterList.add(new PlayerCharacter("Bree", "Trickster", 1));
        this.characterList.add(new PlayerCharacter("Lia", "Sorcerer", 1));
        this.characterList.add(new PlayerCharacter("Vickon", "Thief", 8));
        this.characterList.add(new PlayerCharacter("Gor'brak", "Fighter", 2));
        this.characterList.add(new PlayerCharacter("Velkin", "Bard", 1));
        this.characterList.add(new PlayerCharacter("Modero", "Healer", 4));

    }

    public ArrayList<PlayerCharacter> getCharacterList() {
        return characterList;
    }
}
