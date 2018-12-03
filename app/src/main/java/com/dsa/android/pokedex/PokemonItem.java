package com.dsa.android.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PokemonItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_pokemon);
    }
}
