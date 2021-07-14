package com.changemyminds.stackoverflow.member;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Author: changemyminds.
 * Date: 2021/7/14.
 * Description:
 * Reference:
 */
@Table
@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                '}';
    }

    public Long getId() {
        return id;
    }
}
