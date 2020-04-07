package com.kobe.practice.utils.mapStruct;

import org.mapstruct.factory.Mappers;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: Tao
 * @Date 2020-04-06 18:26
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setId(12345L);
        order.setOrderSn("orderSn");
        order.setOrderType(0);
        order.setReceiverKeyword("keyword");
        order.setSourceType(1);
        order.setStatus(2);

        OrderMapper mapper = Mappers.getMapper(OrderMapper.class);
        OrderQueryParam orderQueryParam = mapper.entity2queryParam(order);
        System.out.println(orderQueryParam);
    }

}
