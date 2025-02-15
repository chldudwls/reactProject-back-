package com.BackEndTeam1.repository;

import com.BackEndTeam1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByUserId(String UserId);

    // 맞는 아이디 확인
    boolean existsByUserId(String UserId);


    //맞는 전화번호 확인
    boolean existsByHp(String phoneNumber);



}
