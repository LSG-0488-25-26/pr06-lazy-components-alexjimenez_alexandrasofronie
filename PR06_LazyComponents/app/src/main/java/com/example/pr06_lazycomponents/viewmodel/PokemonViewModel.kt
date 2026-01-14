package com.example.pr06_lazycomponents.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pr06_lazycomponents.model.Pokemon
import com.example.pr06_lazycomponents.repository.PokemonRepository

class PokemonViewModel : ViewModel() {
    private val repository = PokemonRepository()

    // Para guardar la lista de Pokémon
    private val _pokemonList = MutableLiveData<List<Pokemon>>()
    val pokemonList: LiveData<List<Pokemon>> get() = _pokemonList

    // Para guardar el Pokémon seleccionado
    private val _selectedPokemon = MutableLiveData<Pokemon>()
    val selectedPokemon: LiveData<Pokemon> get() = _selectedPokemon

    init {
        loadPokemon()
    }

    private fun loadPokemon() {
        _pokemonList.value = repository.getPokemonList()
    }

    fun selectPokemon(pokemon: Pokemon) {
        _selectedPokemon.value = pokemon
    }
}