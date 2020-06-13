package org.levelup.lesson.springlesson.service;

import org.levelup.lesson.springlesson.dto.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope(scopeName = "")
public class UserServiceImpl implements UserService{

    public Boolean isAdult(User user) {

        if (user.getAge() == null) return null;
        return user.getAge() >= 18;
    }

    @PostConstruct
    public void hello () {
        System.out.println("Hello!!");
    }

    @PreDestroy
    public void byBy () {
        System.out.println("byBy!!");
    }

}
