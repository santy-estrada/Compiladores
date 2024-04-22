<template>
  <nav>
    <li v-for="(meal, index) in food" v-bind:key="index">
        {{ meal }}
    </li>
    <input type="text" name = "nombre" v-model = "name" placeholder="Qué otra comida quiere??" v-on:keydown.enter="addElement"/>
    <br/>
    <p>{{ name }}</p>
    <h1>{{ counter }} <sup>2</sup> = {{ getSquareComputed }}</h1>
    <h1>{{ counter }} <sup>2</sup> = {{ getSquareComputed }}</h1>
    <h1>{{ counter }} <sup>2</sup> = {{ getSquareComputed }}</h1>

  </nav>

  <CounterApp title = "yey"/>
  <CounterApp title = "NO yey"/>
  
</template>

<script>
import CounterApp from './components/CounterApp.vue'
export default {
  name: 'App',
  components: {
    CounterApp
  },
  data(){ //Atributos del componente
    return{
      food: ['Pizza', 'Hamburguesa', 'Carne'],
      name:'',
      counter:5
    }
  },
  methods:{ //Métodos del componente
    addElement(){
      this.food.push(this.name);
      this.name='';
    },
    getSquare(){
      return this.counter*this.counter;
    }
  },
  computed:{  //Métodos que se calculan sólo una vez
    getSquareComputed (){
      return this.counter*this.counter;
    }
  }
}
</script>

<style>

</style>
