<template>
    <h1>{{ title || "Componente sin nombre" }}</h1>
    <p>{{ counter }}</p>
    <button @click="addOne">+1</button> <button @click="subOne">-1</button>
</template>

<script>
export default{
    props:['title'], 
    data(){
        return{
            counter:0
        }
    },
    methods:{
        addOne(){
            this.counter++;
        },
        subOne(){
            this.counter--;
        }
    }
}
</script>

<style>
    button{
        background-color: #64b664;
        border-radius: 5px;
        border: 1px solid white;
        cursor: pointer;
        margin: 0 5px;
        padding: 5px 15px;
        transition: 0.3 ease-in-out;
    }
    button:hover{
        background-color: #6565b6;
        transition: 0.3s ease-in-out;
    }
</style>