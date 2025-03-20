package com.ian.javatospring01.order;

public interface OrderService {
    Order createOrder(Long memberId, String productName, int productPrice);
}
