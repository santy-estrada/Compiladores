<template>
    <h2> Ask about anything, only Y/N questions</h2>
    <img :src="image" class="bg"/>
    <div class="bg-dark">
        <div class="indecision-container">
            <input type="text" v-model="question" placeholder="Ask a question"/>
            <p> Please use ? at the end</p>
            <div v-if="isValidQuestion">
                <h2> {{ question }}</h2>
                <h1> {{ answer }}</h1>
            </div>
        </div>
        <div>
            <button @click="getQuote">Obtenga una cita</button>
            <h1>{{ quote }}</h1>
            <h2>{{ author }}</h2>
        </div>
    </div>
</template>

<script>
export default {
    data(){
        return {
            question: '',
            answer: null,
            image: 'https://via.placeholder.com/250',
            isValidQuestion: false,
            quote: '',
            author: ''
        }
    },
    methods:{
        async getAnswer(){
            this.answer = 'Loading...';
            const {answer, image} = await (await fetch('https://yesno.wtf/api')).json();
            this.answer = answer;
            this.image = image;
        },
        async getQuote(){
            this.quote = "pere mirrei";
            const [{quote, author}] = await (await fetch('https://api.breakingbadquotes.xyz/v1/quotes')).json();
            this.quote = quote;
            this.author = author;
        }
    },
    watch:{
        question(value,olValue){
            if(value.includes('?')){
                this.isValidQuestion = true;
                this.getAnswer();
            }else{
                this.isValidQuestion=false;
                this.image='https://via.placeholder.com/250';
            }
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

    img, .bg-dark {
        height: 100vh;
        left: 0px;
        max-height: 100%;
        max-width: 100%;
        position: fixed;
        top: 0px;
        width: 100vw;
    }

    .bg-dark {
        background-color: rgba(0, 0, 0, 0.4);
    }

    .indecision-container {
        position: relative;
        z-index: 99;
    }
    
    input {
        width: 250px;
        padding: 10px 15px;
        border-radius: 5px;
        border: none;
    }
    input:focus {
        outline: none;
    }

    p {
        color: white;
        font-size: 20px;
        margin-top: 0px;
    }

    h1, h2 {
        color: white;
    }
    
    h2 {
        margin-top: 150px;
    }

</style>