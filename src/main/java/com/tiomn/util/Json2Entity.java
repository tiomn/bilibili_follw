package com.tiomn.util;

import com.google.gson.JsonObject;
import com.tiomn.entity.Bilibili;

import java.util.Map;

/**
 * @Date 2020/04/24 11:21
 * @Version v1.0
 * @Author jishupeng
 * @Description TODO 用于JSONObject与实体类之间的转换
 * @ClassName Json2Entity
 */
public class Json2Entity {
    public static Bilibili changeJSONObjectToBiLiBiLi(JsonObject jot){
        Bilibili blbl = new Bilibili();
        blbl.setCode(jot.get("code").getAsInt());
        blbl.setMessage(jot.get("message").toString());
        blbl.setTtl(jot.get("ttl").toString());
        JsonObject dataJson = jot.get("data").getAsJsonObject();
        blbl.setMid(dataJson.get("mid").getAsInt());
        blbl.setFollowing(dataJson.get("following").getAsInt());
        blbl.setWhisper(dataJson.get("whisper").getAsInt());
        blbl.setBlack(dataJson.get("black").getAsInt());
        blbl.setFollower(dataJson.get("follower").getAsInt());
        return blbl;
    }
}
