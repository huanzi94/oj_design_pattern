package filterpattern;

import java.util.List;

/**
 * 过滤器接口
 */
public interface Filter {

    List<Balloon> filterBalloon(List<Balloon> balloonList);
}
