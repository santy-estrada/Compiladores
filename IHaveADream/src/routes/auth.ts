import {Router} from "express";
import {loginUserController, registerUserController, getUserController} from "../controllers/user.controller";

const router = Router();

router.post("/register", registerUserController);
router.post("/login", loginUserController);
router.get("/", getUserController);

export {router};