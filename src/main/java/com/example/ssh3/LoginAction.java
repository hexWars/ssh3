package com.example.ssh3;

import com.example.Converter.UserConverter;
import com.example.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;
import sun.net.www.protocol.jar.URLJarFile;

import java.util.Objects;

/**
 * @Description
 * @Author Cai
 * @Date 2021-02-25 19:36
 */
@Data
public class LoginAction extends ActionSupport {
    private User user = new User();

    @Override
    public String execute() throws Exception{
        System.out.println("111");
        return login();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public String login() {
        if (Objects.equals(user.getUsername(), "Cai") && Objects.equals(user.getPassword(), "123456")) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
