package cn.nglsk.service;

import java.util.Map;

public interface UserService {
    Map<String,Object> queryUserById(Long id);
}
