package iteratorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 信工学院
 */
public class InstituteScienceTechnology implements College {

    List<Object> technology;

    public InstituteScienceTechnology() {
        this.technology = new ArrayList<>();
        this.technology.add(new DepartmentInformationEngineering());
        this.technology.add(new NetworkSecurityDepartment());
    }

    @Override
    public InstituteScienceTechnologyIterator getIterator() {
        return new InstituteScienceTechnologyIterator();
    }

    final String getInstituteName() {
        return "信工学院";
    }
}
