package iteratorpattern;

import java.util.Iterator;
import java.util.Objects;

/**
 * 信工学院迭代器
 */
public class InstituteScienceTechnologyIterator implements Iterator{

    InstituteScienceTechnology instituteScienceTechnology;

    public InstituteScienceTechnologyIterator() {
        this.instituteScienceTechnology = new InstituteScienceTechnology();
    }

    private int index = -1;

    @Override
    public boolean hasNext() {
        if (instituteScienceTechnology.technology.size() - 1 <= index) {
            return false;
        }
        CollegeSeries collegeSeries = (CollegeSeries) this.instituteScienceTechnology.technology.get(++index);
        return Objects.nonNull(collegeSeries);
    }

    @Override
    public CollegeSeries next() {
        return (CollegeSeries) this.instituteScienceTechnology.technology.get(index);
    }
}
