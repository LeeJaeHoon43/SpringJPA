package com.example.jpa.bookmanager.domain;

import com.example.jpa.bookmanager.domain.listener.Auditable;
import com.example.jpa.bookmanager.domain.listener.UserEntityListener;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Builder
@Entity
@EntityListeners(value = {UserEntityListener.class})
@Table(name = "user", indexes = {@Index(columnList = "name")}, uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
public class User extends BaseEntity implements Auditable { // Entity 도메인 클래스.
    @Id // PK 지정.
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

//    @Column(updatable = false)
//    @CreatedDate
//    private LocalDateTime createdAt;
//
//    @LastModifiedDate
//    private LocalDateTime updatedAt;

//    @OneToMany(fetch = FetchType.EAGER)
//    private List<Address> address;

//    @PrePersist
//    public void prePersist(){
//        this.createdAt = LocalDateTime.now();
//        this.updatedAt = LocalDateTime.now();
//    }
//
//    @PreUpdate
//    public void preUpdate(){
//        this.updatedAt = LocalDateTime.now();
//    }
}
