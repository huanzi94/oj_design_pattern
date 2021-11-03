package interpretermodel;

public class SQLAExprssion implements Expression{
    @Override
    public String interpret(String sql) {
        return sql;
    }
}
