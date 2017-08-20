package com.sean.java8_lambda;

import com.sean.domain.ProductCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by admin on 2017/8/13.
 */
public class Stream01 {
    public static void main(String[] args) {
        List<ProductCategory> productCategories=new ArrayList<>();
        productCategories.add(new ProductCategory("223",2L));
        productCategories.add(new ProductCategory("224",3L));
        productCategories.add(new ProductCategory("225",4L));
        productCategories.add(new ProductCategory("226",5L));
        Stream<ProductCategory> productCategoryStream=productCategories.stream();




        //过滤器
         productCategoryStream.filter(productCategory -> productCategory.getCategoryType()>2).forEach(
                productCategory -> System.out.println(productCategory.toString())
        );
    }
}
