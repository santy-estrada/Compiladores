import "dotenv"
import {sign, verify} from 'jsonwebtoken';

const JWT_SECRET = process.env.JW_SECRET || 'Secret';

export const signToken = async(id: string)=>{
    const jwt = sign({id}, JWT_SECRET, {expiresIn: '2h'});
    return jwt;
}

export const verifyToken = async(token: string)=>{
    const isOk = verify(token, JWT_SECRET);
    return isOk;
}