import {model,models, Schema} from "mongoose";
import { Keyboard } from "../interfaces/Keyboard";


const KeyboadSchema = new Schema<Keyboard>({
    color:{
        type:String,
        required:true,
        trim: true,
        lowercase: true,
    },

    brand:{
        type:String,
        required:true,
        trim: true,
        lowercase: true,
        values:['Logitech','Razer','HyperX', 'Genius', 'Asus ROG', 'RedDragon']
    },

    size:{
        type:Number,
        required:true,
        trim: true,
        lowercase: true,
    },

    price:{
        type:Number,
        required:true,
        trim: true,
        lowercase: true,
    },

    wireless:{
        type:Boolean,
        required:true,
        trim: true,
        lowercase: true,
    }
})

const KeyboardModel = model('Keyboard',KeyboadSchema);
export default KeyboardModel;