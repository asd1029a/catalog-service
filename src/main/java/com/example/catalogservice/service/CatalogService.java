package com.example.catalogservice.service;

import com.example.catalogservice.entity.CatalogEntity;

/**
 * CatalogService.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.05.03
 */
public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
