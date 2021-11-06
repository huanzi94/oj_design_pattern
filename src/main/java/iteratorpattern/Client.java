package iteratorpattern;

public class Client {

    public static void main(String[] args) {
        SchoolFinance schoolFinance = new SchoolFinance();
        System.out.println("====" + schoolFinance.getCollegeName());
        System.out.println("======" + schoolFinance.getInstituteName());
        SchoolFinanceIterator schoolFinanceIterator = schoolFinance.getIterator();
        while (schoolFinanceIterator.hasNext()) {
            CollegeSeries collegeSeries = schoolFinanceIterator.next();
            System.out.println("========" + collegeSeries.getDesc());
        }

        InstituteScienceTechnology instituteScienceTechnology = new InstituteScienceTechnology();
        System.out.println("======" + instituteScienceTechnology.getInstituteName());
        InstituteScienceTechnologyIterator instituteScienceTechnologyIterator = instituteScienceTechnology.getIterator();
        while (instituteScienceTechnologyIterator.hasNext()) {
            CollegeSeries collegeSeries = instituteScienceTechnologyIterator.next();
            System.out.println("========" + collegeSeries.getDesc());
        }
    }
}
