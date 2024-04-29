<template>
  <h1 v-if="!pokemon">
    Cargando...
  </h1>
  <div v-else>
    <h1>
      Who's that Pokémon????
    </h1>
  </div>
</template>

<script>

import getOptions from './helpers/getPokemonOptions.js';


export default {
  name: "App",
  components: {
  },
  data(){
    return {
      pokemonArr:[],
      pokemon:null,
      showPokemon: false,
      mensaje: ''
    };
  },
  methods:{
    async mixPokemonArray(){
      this.pokemonArr = await getOptions();
      this.pokemon = this.pokemonArr[Math.floor(Math.random() * this.pokemonArr.length)]
    }
  },
  mounted(){
    this.mixPokemonArray();
  }
}
</script>

<style>
</style>
