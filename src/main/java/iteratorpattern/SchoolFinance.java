package iteratorpattern;

/**
 * 金融学院
 */
public class SchoolFinance implements College {

    Object[] finance;

    public SchoolFinance() {
        this.finance = new Object[]{new DepartmentFinance(), new DepartmentAccounting()};
    }

    @Override
    public SchoolFinanceIterator getIterator() {
        return new SchoolFinanceIterator();
    }

    final String getInstituteName() {
        return "金融学院";
    }
}
