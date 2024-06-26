import {Router,Request,Response} from "express";
import {getKeyboards1, getKeyboard1, createKeyBoard, deleteKeyBoard} from "../controllers/keyboard.controller";
import { logMiddleware } from "../middleware/log";
import { checkJWT } from "../middleware/login.middleware";

const router = Router();

router.get("/", getKeyboards1);
router.get("/:id",getKeyboard1);
router.post("/", createKeyBoard);
router.delete("/:brand",deleteKeyBoard);

export {router};