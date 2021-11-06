package interpretermodel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SQLBExprssion implements Expression{

    @Override
    public String interpret(String sql, Context context) {
        String s = "";
        String value = String.valueOf(context.getData("name"));
        s = sql.replaceAll("#\\{name}", "'" + value + "'");

        return s;
    }
}
