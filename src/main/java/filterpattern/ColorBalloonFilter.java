package filterpattern;

import java.util.ArrayList;
import java.util.List;

public class ColorBalloonFilter implements Filter{
    @Override
    public List<Balloon> filterBalloon(List<Balloon> balloonList) {
        ArrayList<Balloon> balloons = new ArrayList<>();
        balloonList.forEach(balloon -> {
            if (balloon.getColor().equals("红色")) {
                balloons.add(balloon);
            }
        });

        return balloons;
    }
}
