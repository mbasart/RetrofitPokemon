package com.dsa.android.pokedex.pokeapi;

import com.dsa.android.pokedex.mdels.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeapiService {

    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon();
}
