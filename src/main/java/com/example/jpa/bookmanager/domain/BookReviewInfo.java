package com.example.jpa.bookmanager.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@ToString(callSuper = true) // BaseEntity(부모클래스)의 toString()을 호출하게 함.
@EqualsAndHashCode(callSuper = true) // BaseEntity(부모클래스)의 equalsAndHashcode()을 호출하게 함.
public class BookReviewInfo extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // private Long bookId;
    @OneToOne(optional = false)
    private Book book;

    private float averageReviewScore;

    private int reviewCount;
}
