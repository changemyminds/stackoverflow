package com.changemyminds.stackoverflow;

import com.changemyminds.stackoverflow.member.Member;
import com.changemyminds.stackoverflow.member.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Author: changemyminds.
 * Date: 2021/7/14.
 * Description: https://stackoverflow.com/questions/68341902/too-many-ddl-occur-when-using-datajpatest-in-h2db
 * Reference:
 */
@ActiveProfiles("test")
@DataJpaTest
public class MemberRepositoryTests {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    @Sql("Member.sql")
    public void testSomething() {
        Member member = memberRepository.findById(1L).orElse(null);
        assertThat(member).isNotNull();
        assertThat(member.getId()).isEqualTo(1L);
    }
}
