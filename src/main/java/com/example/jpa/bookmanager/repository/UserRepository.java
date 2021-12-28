package com.example.jpa.bookmanager.repository;

import com.example.jpa.bookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public List<User> findByName(String name);
    public User findByEmail(String email);
    public User getByEmail(String email);
    public User readByEmail(String email);
    public User queryByEmail(String email);
    public User searchByEmail(String email);
    public User streamByEmail(String email);
    public User findUserByEmail(String email);
    public User findSomethingByEmail(String email);
    public List<User> findFirstByName(String name);
    public List<User> findTop1ByName(String name);
    public List<User> findLast1ByName(String name);

    public List<User> findByEmailAndName(String email, String name);
    public List<User> findByEmailOrName(String email, String name);
    public List<User> findByCreatedAtAfter(LocalDateTime yesterday);
    public List<User> findByIdAfter(Long id);
    public List<User> findByCreatedAtGreaterThan(LocalDateTime yesterday);
    public List<User> findByCreatedAtGreaterThanEqual(LocalDateTime yesterday);
    public List<User> findByCreatedAtBetween(LocalDateTime yesterday, LocalDateTime tomorrow);
    public List<User> findByIdBetween(Long id1, Long id2);
    public List<User> findByIdGreaterThanEqualAndIdLessThanEqual(Long id1, Long id2);
}
