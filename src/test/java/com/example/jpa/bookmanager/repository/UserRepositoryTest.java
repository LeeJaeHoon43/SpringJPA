package com.example.jpa.bookmanager.repository;

import com.example.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
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
        // User user = new User();
        // user.setEmail("slow");
        // ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("email", contains());
        // Example<User> example = Example.of(user, matcher);
        // userRepository.findAll(example).forEach(System.out::println);

        // userRepository.save(new User("david", "david@naver.com"));

        // User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        // user.setEmail("martin-updated@gmail.com");

        // userRepository.save(user);
    }

    @Test
    public void select(){
        System.out.println(userRepository.findByName("dennis"));
        System.out.println("findByEmail : " + userRepository.findByEmail("martin@fastcampus.com"));
        System.out.println("getByEmail : " + userRepository.getByEmail("martin@fastcampus.com"));
        System.out.println("readByEmail : " + userRepository.readByEmail("martin@fastcampus.com"));
        System.out.println("queryByEmail : " + userRepository.queryByEmail("martin@fastcampus.com"));
        System.out.println("searchByEmail : " + userRepository.searchByEmail("martin@fastcampus.com"));
        System.out.println("streamByEmail : " + userRepository.streamByEmail("martin@fastcampus.com"));
        System.out.println("findUserByEmail : " + userRepository.findUserByEmail("martin@fastcampus.com"));
        System.out.println("findSomethingByEmail : " + userRepository.findSomethingByEmail("martin@fastcampus.com"));
        System.out.println("findFirstByName : " + userRepository.findFirstByName("martin"));
        System.out.println("findTop1ByName : " + userRepository.findTop1ByName("martin"));
        System.out.println("findLast1ByName : " + userRepository.findLast1ByName("martin"));

        System.out.println("findByEmailAndName : " + userRepository.findByEmailAndName("martin@fastcampus.com", "martin"));
        System.out.println("findByEmailOrName : " + userRepository.findByEmailOrName("martin@fastcampus.com", "martin"));
        System.out.println("findByCreatedAtAfter : " + userRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1L)));
        System.out.println("findByIdAfter : " + userRepository.findByIdAfter(4L));
        System.out.println("findByCreatedAtGreaterThan : " + userRepository.findByCreatedAtGreaterThan(LocalDateTime.now().minusDays(1L)));
        System.out.println("findByCreatedAtGreaterThanEqual : " + userRepository.findByCreatedAtGreaterThanEqual(LocalDateTime.now().minusDays(1L)));
        System.out.println("findByCreatedAtBetween : " + userRepository.findByCreatedAtBetween(LocalDateTime.now().minusDays(1L), LocalDateTime.now().plusDays(1L)));
        System.out.println("findByIdBetween : " + userRepository.findByIdBetween(1L,3L));
        System.out.println("findByIdGreaterThanEqualAndIdLessThanEqual : " + userRepository.findByIdGreaterThanEqualAndIdLessThanEqual(1L,3L));

        System.out.println("findByIdIsNotNull : " + userRepository.findByIdIsNotNull());
        // System.out.println("findByAddressIsNotEmpty : " + userRepository.findByAddressIsNotEmpty());
        System.out.println("findByNameIn : " + userRepository.findByNameIn(Lists.newArrayList("martin", "dennis")));
        System.out.println("findByNameStartingWith : " + userRepository.findByNameStartingWith("mar"));
        System.out.println("findByNameEndingWith : " + userRepository.findByNameEndingWith("tin"));
        System.out.println("findByNameContains : " + userRepository.findByNameContains("art"));
        System.out.println("findByNameLike : " + userRepository.findByNameLike("%art%"));
    }

    @Test
    void pagingAndSortingTest(){
        System.out.println("findTop1ByName : " + userRepository.findTop1ByName("martin"));
        System.out.println("findLast1ByName : " + userRepository.findLast1ByName("martin"));
        System.out.println("findTopByNameOrderByIdDesc : " + userRepository.findTopByNameOrderByIdDesc("martin"));
        System.out.println("findFirstByNameOrderByIdDescEmailAsc : " + userRepository.findFirstByNameOrderByIdDescEmailAsc("martin"));
        System.out.println("findFirstByNameWithSortParams : " + userRepository.findFirstByName("martin", Sort.by(Sort.Order.desc("id"), Sort.Order.asc("email"))));
        System.out.println("findByNameWithPaging : " + userRepository.findByName("martin", PageRequest.of(1, 1,Sort.by(Sort.Order.desc("id")))).getTotalElements());
    }

    private Sort getSort(){
        return Sort.by(
                Sort.Order.desc("id"),
                Sort.Order.asc("email"),
                Sort.Order.desc("createdAt"),
                Sort.Order.asc("updatedAt")
        );
    }
}