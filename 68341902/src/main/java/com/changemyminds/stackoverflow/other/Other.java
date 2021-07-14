package com.changemyminds.stackoverflow.other;

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
@Entity
@Table
public class Other {
    @Id
    @GeneratedValue
    private Long id;
}
