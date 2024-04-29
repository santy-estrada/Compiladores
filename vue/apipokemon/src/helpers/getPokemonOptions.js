import axios from "axios";
const pokemonApi = axios.create({
    baseURL: "https://pokeapi.co/api/v2/pokemon",
});

export const getPokemonOptions = () => {
    const pokemonsArray = Array.from(Array(650));
    return pokemonsArray.map((_, index) => index + 1);
};

const getPokemonNames = async([a,b,c,d]=[]) => {
    const promiseArra = [
        pokemonApi.get(`/${a}`),
        pokemonApi.get(`/${b}`),
        pokemonApi.get(`/${c}`),
        pokemonApi.get(`/${d}`)
    ];
    const [p1,p2,p3,p4] = await Promise.all(promiseArra);
    return [
        {name: p1.data.name, id: p1.data.id},
        {name: p2.data.name, id: p2.data.id},
        {name: p3.data.name, id: p3.data.id},
        {name: p4.data.name, id: p4.data.id},
    ];
};

const getOptions = async () => {
    const mixedPokemons = getPokemonOptions().sort(() => Math.random() - 0.5);
    console.log(mixedPokemons.slice(0,4));
    const options = await getPokemonNames(mixedPokemons.slice(0,4));
    return options;
};

export default getOptions;
