package cn.nglsk.service;

import java.util.*;

public class UserServiceImpl implements UserService {


    @Override
    public Map<String, Object> queryUserById(Long id) {
        Map<String, Object> data = new HashMap<>();
        List<String> dataList = new ArrayList<>();

        Collections.addAll(dataList, "dam", "add", "da");
        data.put("status", 200);
        data.put("data", dataList);
        data.put("message", "查询用户数据成功");
        data.put("cecc", "xwuhsi");
        data.put("demo","简单测试");
        return data;
    }
}
