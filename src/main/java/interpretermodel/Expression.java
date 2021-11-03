package interpretermodel;

public interface Expression {

    String interpret(String sql, Context contex);
}
