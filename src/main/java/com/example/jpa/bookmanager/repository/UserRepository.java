package com.example.jpa.bookmanager.repository;

import com.example.jpa.bookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
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
}
