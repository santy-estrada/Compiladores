import "dotenv/config";
import express from "express";
import cors from "cors";
import { router } from "./routes/router";

//Se habilita el puerto de nuestra app
//Si no está en el arvhico sería el 8081
const PORT = process.env.PORT || 8081;
//Se crea una aplicación
const app = express();
//Los cors nos dan permiso a externos a conectarse al api
app.use(cors());
//Se crean las turas
app.use(router);
//Mostrar mensaje
app.listen(PORT, () => 
{console.log(`Corriendo en localhost: ${PORT}`)});