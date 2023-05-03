package com.example.catalogservice.repository;

import com.example.catalogservice.entity.CatalogEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * CatalogRepository.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.05.03
 */
@Repository
public interface CatalogRepository extends CrudRepository<CatalogEntity, Long> {

    Optional<CatalogEntity> findByProductId(String productId);
}
