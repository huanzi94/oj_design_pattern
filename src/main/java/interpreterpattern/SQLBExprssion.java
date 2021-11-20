package interpreterpattern;

/**
 * #{name}语法的解析实现类
 */
public class SQLBExprssion implements Expression {

    @Override
    public String interpret(String sql, Context context) {
        String s = "";
        String value = String.valueOf(context.getData("name"));
        s = sql.replaceAll("#\\{name}", "'" + value + "'");

        return s;
    }
}
