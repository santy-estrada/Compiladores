import { NextFunction, Request, Response } from "express";
import { verifyToken } from "../utils/jwt.util";

export const checkJWT = (req: Request, res: Response, next: NextFunction) => {
    try{
        const jsonwebtoken = req.headers.authorization ||'';
        console.log(jsonwebtoken);
        const jwt = jsonwebtoken.split(' ')[1];
        const isOk = verifyToken(jwt);

        if(!isOk){
            res.status(401).send({
                message: "Más inválido que Mark Vujicic (mala sesión)"
            });
        }
        next();
    }catch(e){
        res.status(400).send("Más inválido que Mark Vujicic (Sesión inválida)")
    }
}