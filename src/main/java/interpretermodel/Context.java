package interpretermodel;

import java.util.HashMap;

/**
 * 辅助类，存储不同的输入
 */
public class Context {

    private HashMap<String, Object> map = new HashMap<>();

    public void setData(String key, String data) {
        map.put(key, data);
    }

    public Object getData(String key) {
        return map.get(key);
    }
}
