package com.example.detectiveazul.listviewhomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.detectiveazul.listviewhomework.Models.PlayerCharacter;

public class PlayerCharacterDetailsActivity extends AppCompatActivity {
    private PlayerCharacter playerCharacter;
    private TextView characterName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_character_details);

        Intent intent = getIntent();
        this.playerCharacter = (PlayerCharacter) intent.getSerializableExtra("character");
        this.characterName = findViewById(R.id.characterNameID);
        this.characterName.setText(playerCharacter.getName());
    }
}
