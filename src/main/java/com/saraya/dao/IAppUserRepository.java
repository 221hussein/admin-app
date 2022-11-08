package com.saraya.dao;

import com.saraya.entities.AppUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppUserRepository extends JpaRepository<AppUserEntity,Integer> {
    AppUserEntity findByEmail(String email);
}
