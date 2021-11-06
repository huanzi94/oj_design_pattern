package filterpattern;

import java.util.Arrays;
import java.util.List;

public class BalloonFactory {

    public static List<Balloon> balloonList =
            Arrays.asList(new Balloon("圆形", 2, "红色"), new Balloon("圆形", 8, "红色"),
                    new Balloon("三角形", 2, "绿色"), new Balloon("圆形", 2, "黄色"),
            new Balloon("正方形", 4, "绿色"), new Balloon("三角形", 10, "红色"));

    public static List<Balloon> getBalloonList() {
        return balloonList;
    }
}
