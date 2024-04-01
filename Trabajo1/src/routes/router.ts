import {Router, Request, Response} from "express";

const router = Router();

router.get('/', (req: Request, res: Response) => {
    res.send({
        data: "The gus one",
        message: "The bad one"
    });
})

export {router};