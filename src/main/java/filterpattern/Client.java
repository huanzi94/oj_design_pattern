package filterpattern;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Balloon> balloonList = BalloonFactory.getBalloonList();
        ColorBalloonFilter colorBalloonFilter = new ColorBalloonFilter();
        List<Balloon> colorBalloons = colorBalloonFilter.filterBalloon(balloonList);
        System.out.println("====================颜色过滤器========================");
        colorBalloons.forEach(color -> System.out.println(color.toString()));

        SizeBalloonFilter sizeBalloonFilter = new SizeBalloonFilter();
        List<Balloon> sizeBalloons = sizeBalloonFilter.filterBalloon(balloonList);
        System.out.println("====================大小过滤器========================");
        sizeBalloons.forEach(size -> System.out.println(size.toString()));

        ShapeBalloonFilter shapeBalloonFilter = new ShapeBalloonFilter();
        List<Balloon> shapeBalloons = shapeBalloonFilter.filterBalloon(balloonList);
        System.out.println("====================形状过滤器========================");
        shapeBalloons.forEach(shape -> System.out.println(shape.toString()));


    }
}
