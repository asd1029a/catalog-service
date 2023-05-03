package com.example.catalogservice.dto;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

/**
 * CatalogDto.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.05.03
 */
@Data
public class CatalogDto implements Serializable {

    private String productId;
    private Integer stock;
    private Integer unitPrice;
    private Integer totalPrice;

    private String orderId;
    private String userId;
}
