package com.example.detectiveazul.listviewhomework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.detectiveazul.listviewhomework.Models.PlayerCharacter;
import com.example.detectiveazul.listviewhomework.Models.PlayerCharacterList;

import java.util.ArrayList;

public class PlayerCharacterListAdaptor extends ArrayAdapter<PlayerCharacter> {
    public PlayerCharacterListAdaptor(Context context, ArrayList<PlayerCharacter> playerCharacters) {
        super(context, 0, playerCharacters);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.player_character_item, parent, false);
        }
        PlayerCharacter currentCharacter = getItem(position);

        TextView characterLevel = (TextView) listItemView.findViewById(R.id.characterLevelTextViewId);
        characterLevel.setText(currentCharacter.getLevel().toString());

        TextView characterClass = (TextView) listItemView.findViewById(R.id.characterClassTextViewId);
        characterClass.setText(currentCharacter.getC_class());

        TextView characterName = (TextView) listItemView.findViewById(R.id.characterNameTextViewID);
        characterName.setText(currentCharacter.getName());

        //Set a tag to retrieve the item object
        listItemView.setTag(currentCharacter);

        return listItemView;
    }

}
