package com.example.detectiveazul.listviewhomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.example.detectiveazul.listviewhomework.Models.PlayerCharacter;
import com.example.detectiveazul.listviewhomework.Models.PlayerCharacterList;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        //We get the character list array
        PlayerCharacterList characterList = new PlayerCharacterList();
        ArrayList<PlayerCharacter> characterArray = characterList.getCharacterList();

        //We create the adaptor
        PlayerCharacterListAdaptor characterAdaptor = new PlayerCharacterListAdaptor(this, characterArray);

        //Create the listview variable and find the one in the layout
        ListView listView = findViewById(R.id.playerCharacterListViewId);

        //Set the adaptor for this listView
        listView.setAdapter(characterAdaptor);
    }

    public void onItemClick(View view) {
        PlayerCharacter playerCharacter = (PlayerCharacter) view.getTag();
        Log.d("Character is ", playerCharacter.getName());
        Intent intent = new Intent(this, PlayerCharacterDetailsActivity.class);
        intent.putExtra("character", playerCharacter);
        startActivity(intent);
    }
}
