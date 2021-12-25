package com.example.jpa.bookmanager.repository;

import com.example.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void crud(){
        // userRepository.save(new User());
        // userRepository.findAll().forEach(System.out::println);
        // List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
        // List<User> users = userRepository.findAllById(Lists.newArrayList(1L,3L,5L));
        // users.forEach(System.out::println);

        // User user1 = new User("jack", "jack@gmail.com");
        // User user2 = new User("steve", "steve@gmail.com");
        // userRepository.saveAll(Lists.newArrayList(user1, user2));
        // List<User> users = userRepository.findAll();
        // users.forEach(System.out::println);

        // User user = userRepository.findById(1L).orElse(null);
        // System.out.println(user);

        // userRepository.saveAndFlush(new User("new martin", "newmartic@gmail.com"));
        // userRepository.findAll().forEach(System.out::println);

        // long count = userRepository.count();
        // System.out.println(count);

        // boolean exists = userRepository.existsById(1L);
        // System.out.println(exists);

        // userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));
        // userRepository.deleteById(1L);
        // userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(1L,3L)));
        // userRepository.deleteAllInBatch();
        // userRepository.findAll().forEach(System.out::println);

        // Page<User> users = userRepository.findAll(PageRequest.of(0,3));
        // System.out.println("page : " + users);
        // System.out.println("totalElements : " + users.getTotalElements());
        // System.out.println("totalPages : " + users.getTotalPages());
        // System.out.println("numberOfElements : " + users.getNumberOfElements());
        // System.out.println("sort : " + users.getSort());
        // System.out.println("size : " + users.getSize());

        // users.getContent().forEach(System.out::println);

        // ExampleMatcher matcher = ExampleMatcher.matching().withIgnorePaths("name").withMatcher("email", endsWith());
        // Example<User> example = Example.of(new User("ma", "gmail.com"), matcher);
        User user = new User();
        user.setEmail("slow");
        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("email", contains());
        Example<User> example = Example.of(user, matcher);
        userRepository.findAll(example).forEach(System.out::println);
    }
}