import Axios from "axios";
import { url } from "./urls"

const getKeyBoards = async () => {
    const response = await Axios.get(url+"/keyboard");
    return response.data;
}

export default getKeyBoards;