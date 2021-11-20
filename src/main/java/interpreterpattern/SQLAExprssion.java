package interpreterpattern;

/**
 * ${order}语法的解析实现类
 */
public class SQLAExprssion implements Expression {

    @Override
    public String interpret(String sql, Context context) {
        String s = "";
        String value = String.valueOf(context.getData("order"));
        s = sql.replaceAll("\\$\\{order}", value);

        return s;
    }
}
