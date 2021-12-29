package com.example.jpa.bookmanager.repository;

import com.example.jpa.bookmanager.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public Set<User> findByName(String name);
    public Set<User> findUserByNameIs(String name);
    public Set<User> findUserByName(String name);
    public Set<User> findUserByNameEquals(String name);

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

    public List<User> findByIdIsNotNull();
    // public List<User> findByAddressIsNotEmpty();

    public List<User> findByNameIn(List<String> name);
    public List<User> findByNameStartingWith(String name);
    public List<User> findByNameEndingWith(String name);
    public List<User> findByNameContains(String name);
    public List<User> findByNameLike(String name);
    public List<User> findTopByNameOrderByIdDesc(String name);
    public List<User> findFirstByNameOrderByIdDescEmailAsc(String name);
    public List<User> findFirstByName(String name, Sort sort);

    public Page<User> findByName(String name, Pageable pageable);
}
