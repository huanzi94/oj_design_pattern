package iteratorpattern;

import java.util.Iterator;
import java.util.Objects;

/**
 * 金融学院迭代器
 */
public class SchoolFinanceIterator implements Iterator {

    SchoolFinance finance;
    int index = -1;

    public SchoolFinanceIterator() {
        this.finance = new SchoolFinance();
    }

    @Override
    public boolean hasNext() {
        if (finance.finance.length - 1 <= index) {
            return false;
        }
        CollegeSeries collegeSeries = (CollegeSeries) this.finance.finance[++index];
        return Objects.nonNull(collegeSeries);
    }

    @Override
    public CollegeSeries next() {
        return (CollegeSeries) this.finance.finance[index];
    }
}
