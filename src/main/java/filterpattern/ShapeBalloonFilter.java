package filterpattern;

import java.util.ArrayList;
import java.util.List;

public class ShapeBalloonFilter implements Filter{
    @Override
    public List<Balloon> filterBalloon(List<Balloon> balloonList) {
        ArrayList<Balloon> balloons = new ArrayList<>();
        balloonList.forEach(balloon -> {
            if (balloon.getShape().equals("圆形")) {
                balloons.add(balloon);
            }
        });

        return balloons;
    }
}
