package com.example.Converter;

import com.example.domain.User;
import ognl.DefaultTypeConverter;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * @Description
 * @Author Cai
 * @Date 2021-02-26 17:07
 */
public class UserConverter extends DefaultTypeConverter {
    @Override
    public Object convertValue(Map context, Object value, Class toType) {
        //需要将字符串向userbean类型转换时
        if (toType == User.class) {
            //系统的请求参数是一个字符串数组
            System.out.println("TestType");
            String[] params = (String[]) value;
            User user = new User();
            user.setUsername(params[0]);
            user.setPassword(params[1]);
            return user;
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


