import { encrypt, verify } from "../utils/bcrypts.util";
import { User } from "../interfaces/User";
import { Auth } from "../interfaces/Auth";
import UserModel from "../models/User.models";
import { signToken } from "../utils/jwt.util";

export const registerUser = async (authUser: User) => {
    const {email, password, description, name}= authUser;
    console.log(password);
    const exist = await UserModel.findOne({email});

    if(exist) {
        return 'Ia esiste';
    }

    const passwordHash = await encrypt(password);
    console.log(passwordHash);
    const newUser = await UserModel.create({email, password: passwordHash, description, name});
    console.log(newUser);
    return newUser;
}

export const loginUserService = async(authUser: Auth) => {
    const {email, password} = authUser;
    const userPass = await UserModel.findOne({email});

    if(!userPass) {
        return 'No existe el usuario';
    }

    const passwordHash = userPass.password;
    const isCorrect = await verify(password, passwordHash);

    if(!isCorrect) {
        return 'Contraseña incorrecta';
    }
    const token = await signToken(email);

    const user = {email, 
        message: "Success", 
        token}

    return user;
}

export const getUsers = async() => {
    try{
        const response = await UserModel.find();
        return response;
    }catch(error){
        console.log(error);
    }
}
