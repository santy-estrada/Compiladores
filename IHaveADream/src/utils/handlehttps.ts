import {Response} from "express";

const handlehttp = (res:Response, error: string) => {
    res.status(500).send({
        message: error
    })
}

export {handlehttp}