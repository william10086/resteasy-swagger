package com.william.service;

import com.william.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author: william
 * Date: 2018-03-10
 * Time: 上午10:58
 * Description: com.william.service
 */
@Api(value = "userservice", description = "用户接口")
@Path("userservice") // 服务路径
public class UserService {
    /**
     * 初始化三个用户数据，存入map中，key为用户id，value为用户对象
     */
    static Map<Integer, User> userMap = new HashMap<>();

    static {
        User user1 = new User("Lee", 24, "138***");
        userMap.put(1, user1);
        User user2 = new User("Cathy", 25, "188***");
        userMap.put(2, user2);
        User user3 = new User("Aaron", 26, "186***");
        userMap.put(3, user3);
    }

    /**
     * 获取指定id的用户
     */
    @ApiOperation(nickname = "user/{}", value = "查询某个用户", notes = "返回查询对象")
    @GET
    @Path("user/{id}") // 具体服务的路径, id是入参
    @Produces("application/json") // 返回的格式
    public User getById(@PathParam("id") Integer id) {
        return userMap.get(id);
    }

    /**
     * 以json格式返回所有用户
     */
    @GET
    @Path("users")
    @Produces("application/json")
    @ApiOperation(nickname = "users", value = "查询所有", notes = "返回查询对象")
    public List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        for (Map.Entry<Integer, User> user : userMap.entrySet()) {
            userList.add(user.getValue());
        }
        return userList;
    }
}
