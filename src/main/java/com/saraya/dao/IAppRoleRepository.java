package com.saraya.dao;

import com.saraya.entities.AppRolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppRoleRepository extends JpaRepository<AppRolesEntity,Integer> {
}
