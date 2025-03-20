package com.ian.javatospring01.order;

// 주문 요청 처리 완료 후 응답 반환을 위해 생성되는 객체
public class Order {
    private Long memberId;
    private String productName;
    private int productPrice;
    private int discountPrice;

    public int calculateDiscount() {
        return productPrice - discountPrice;
    }

    public Order(Long memberId, String productName, int productPrice, int discountPrice) {
        this.memberId = memberId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.discountPrice = discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
