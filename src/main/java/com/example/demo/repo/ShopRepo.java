package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Shop;

@RepositoryRestResource(collectionResourceRel="shop", path="shops")
public interface ShopRepo extends JpaRepository<Shop, String> {

}
