package com.app.ecom.dto;

import lombok.Data;

@Data
public class CartItemRequest {
    private Integer productId;
    private Integer quantity;
}
