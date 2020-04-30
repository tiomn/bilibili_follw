package com.tiomn.mian;

import com.tiomn.entity.Bilibili;
import com.tiomn.util.Json2Entity;
import com.tiomn.util.RequestUtil;
import lombok.SneakyThrows;

/**
 * @Date 2020/04/24 11:07
 * @Version v1.0
 * @Author jishupeng
 * @Description TODO 运行测试口
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        getapi getapi =new getapi();
        getapi.run();
    }
}
class getapi implements Runnable {
    private static Bilibili bilibili = new Bilibili();
    @SneakyThrows
    public void bibillili(String url){
        while (true) {
            Bilibili bili = Json2Entity.changeJSONObjectToBiLiBiLi(RequestUtil.getXpath(url));
            Integer num = bili.getFollower() - bilibili.getFollower();
            if (num >= 0) {
                bili.setFollowerIncrease(true);
            } else {
                bili.setFollowerIncrease(false);
            }
            bili.setIncreaseNum(num);
            bilibili = bili;
            System.out.println("mid:" + bilibili.getMid());
            System.out.println("当前关注量：" + bilibili.getFollowing());
            System.out.println("当前私信量：" + bilibili.getWhisper());
            System.out.println("当前粉丝量：" + bilibili.getFollower());
            System.out.println("当前粉丝" + (bilibili.isFollowerIncrease() ? "上升了：" + bilibili.getIncreaseNum() : "下降了：" + bilibili.getIncreaseNum()));
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            Thread.sleep(1000);
        }
    }

    public void run() {
        bibillili("https://api.bilibili.com/x/relation/stat?vmid=196356191&jsonp=jsonp");
//        bibillili("https://api.bilibili.com/x/relation/stat?vmid=546195&jsonp=jsonp");
    }
}