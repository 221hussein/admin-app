package com.saraya.dao;


import com.saraya.entities.ProduitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduitRepository extends JpaRepository<ProduitEntity,Integer> {

}
