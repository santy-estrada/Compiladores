import axios from "axios";

(
    async function () {
        async function getQuote() {
            //const resp = await axios.get("https://api.breakingbadquotes.xyz/v1/quotes");
            const {data} = await axios.get("https://api.breakingbadquotes.xyz/v1/quotes");
            return data;
        }
        const quote = await getQuote();
        console.log(quote);
    }
)();
