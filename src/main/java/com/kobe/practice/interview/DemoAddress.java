package com.kobe.practice.interview;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName: DemoAddress
 * @Description: TODO
 * @Author: Tao
 * @Date 2019-10-27 13:30
 */
public class DemoAddress {

    public static void main(String[] args) {

        List<AddressDto> resultList = Lists.newArrayList();

        AddressDto addressDto1 = new AddressDto("1", "2", "3");
        AddressDto addressDto2 = new AddressDto("1", "2", "3");
        resultList.add(addressDto1);
        resultList.add(addressDto2);
        boolean contains = resultList.contains(new AddressDto("1", "2", "3"));
        System.out.println(contains);

        // 省
        List<AddressDto> collectProvinceList
                = resultList.stream().filter(r -> StringUtils.isBlank(r.getParentGuid())).collect(Collectors.toList());
        List<String> collectProvince = collectProvinceList.stream().map(AddressDto::getGuid).collect(Collectors.toList());

        // 市、区
        List<AddressDto> collectList
                = resultList.stream().filter(r -> !resultList.contains(collectProvinceList)).collect(Collectors.toList());

        // 市
        List<AddressDto> collectCity
                = collectList.stream().filter(c -> collectProvince.contains(c.getParentGuid())).collect(Collectors.toList());

        // 区
        List<AddressDto> collectCounty = collectList.stream().filter(c -> !collectList.contains(collectCity)).collect(Collectors.toList());


    }

}
