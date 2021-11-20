package interpreterpattern;

/**
 * 解释器接口
 */
public interface Expression {

    /**
     * 解释器语法解释方法
     *
     * @param sql     输入字符串
     * @param context 辅助类
     * @return 返回解析后的字符串
     */
    String interpret(String sql, Context context);
}
