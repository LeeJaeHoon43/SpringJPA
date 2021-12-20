package com.example.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void test(){
        User user = new User();
        user.setName("ljh");
        user.setEmail("ljh1111@gmail.com");
        System.out.println(">>> " + user);

        User user1 =  new User(null,"ljh","ljh1111@gmail.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("hong","ljh2222@gmail.com");

        System.out.println(">>> " + user1);
        System.out.println(">>> " + user2);
    }
}