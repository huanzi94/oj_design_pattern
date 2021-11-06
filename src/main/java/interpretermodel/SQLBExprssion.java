package interpretermodel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SQLBExprssion implements Expression{

    private static final String REGEX = "[#{*}]";

    @Override
    public String interpret(String sql, Context context) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(sql);
        while (matcher.matches()) {
            String key = matcher.group();
            String value = String.valueOf(context.getData(key));
            String s = sql.replaceAll("#{" + key + "}", value);
        }

        return sql;
    }
}
