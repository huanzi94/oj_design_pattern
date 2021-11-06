package filterpattern;

import java.util.ArrayList;
import java.util.List;

public class SizeBalloonFilter implements Filter{
    @Override
    public List<Balloon> filterBalloon(List<Balloon> balloonList) {
        ArrayList<Balloon> balloons = new ArrayList<>();
        balloonList.forEach(balloon -> {
            if (balloon.getSize() > 8) {
                balloons.add(balloon);
            }
        });

        return balloons;
    }
}
