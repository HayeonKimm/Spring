package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){

        repository.clearStore();

    }

    @Test
    public void save() {

        Member member = new Member();
        member.setName("spring");

        repository.save(member);
        Member result =repository.findById(member.getId()).get();
        Assertions.assertEquals(member, result);

    }

    public void clearStore(){

        store.clear();
    }
}
