<template>  
    <div>
        <h1>Home</h1>
        
        <ul>
            <li v-for="keyboard in keyBoards" :key="keyboard.id">
                {{ keyboard.brand }}
            </li>
        </ul>
    </div>
</template>

<script>
import getKeyBoards from "./helpers/getKeyBoards.js";
export default {
    data() {
        return {
            keyBoards: []
        }
    },
    methods:{
        async getKeyBoards(){
            this.keyBoards = await getKeyBoards();
        }
    },
    mounted() {
        this.getKeyBoards();
    }
}
</script>

<style>

</style>