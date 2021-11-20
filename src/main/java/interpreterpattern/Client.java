package interpreterpattern;

public class Client {

    public static void main(String[] args) {
        String sql = "select * from user where name = #{name} order by ${order};";

        Context context = new Context();
        context.setData("name", "张三");
        context.setData("order", "time");

        Context context1 = new Context();
        context1.setData("name", "李四");
        context1.setData("order", "name");

        String sql1 = sql;

        SQLAExprssion sqlaExprssion = new SQLAExprssion();
        SQLBExprssion sqlbExprssion = new SQLBExprssion();
        sql = sqlaExprssion.interpret(sql, context);
        sql = sqlbExprssion.interpret(sql, context);

        sql1 = sqlaExprssion.interpret(sql1, context1);
        sql1 = sqlbExprssion.interpret(sql1, context1);

        System.out.println(sql);
        System.out.println(sql1);
    }
}
