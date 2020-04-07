package com.kobe.practice.utils.mapStruct;

import org.mapstruct.Mapper;

/**
 * @ClassName: OrderMapper
 * @Description: TODO
 * @Author: Tao
 * @Date 2020-04-06 18:25
 */
@Mapper
public interface OrderMapper {

    OrderQueryParam entity2queryParam(Order order);

}
