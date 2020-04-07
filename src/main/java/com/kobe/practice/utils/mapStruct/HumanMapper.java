package com.kobe.practice.utils.mapStruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName: HumanMapper
 * @Description: TODO
 * @Author: Tao
 * @Date 2020-04-06 18:32
 */
@Mapper
public interface HumanMapper {

    HumanMapper INSTANCE = Mappers.getMapper(HumanMapper.class);

    @Mapping(target = "username", source = "name")
    @Mapping(target = "userage", source = "age")
    Student entity2Student(Person person);

}
