package com.example.Converter;

import com.example.domain.User;
import ognl.DefaultTypeConverter;

import java.util.Map;

/**
 * @Description
 * @Author Cai
 * @Date 2021-02-26 17:07
 */
public class UserConverter extends DefaultTypeConverter {
//    @Override
//    public Object convertFromString(Map map, String[] strings, Class aClass) {
//        System.out.println("TestType");
//        User user = new User();
//        user.setUsername(strings[0]);
//        user.setPassword(strings[1]);
//        return user;
//    }
//
//    @Override
//    public String convertToString(Map map, Object o) {
//        return null;
//    }
    @Override
    public Object convertValue(Map context, Object value, Class toType) {
        //需要将字符串向User类型转换时
        if (toType == User.class) {
            //系统的请求参数是一个字符串数组
            System.out.println("TestType");
            String[] params = (String[]) value;
            return new User(params[0],params[1]);
        } else if (toType == String.class) {
            User user = (User) value;
            System.out.println("--------------------");
            return user.getUsername() + " " + user.getPassword();
        }
        System.out.println("--------------------");
        return null;
//        return super.convertValue(context, value, toType);
    }
}


