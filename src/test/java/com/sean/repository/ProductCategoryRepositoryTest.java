package com.sean.repository;

import com.sean.domain.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by admin on 2017/8/12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    ProductCategoryRepository repository;
    @Test
    public void findOneTest(){
        ProductCategory productCategory=repository.findOne(1);
        System.out.println(productCategory.toString());
    }
    @Test
    public void saveOne(){
        ProductCategory productCategory=new ProductCategory("女生最爱",3L);
        ProductCategory result=repository.save(productCategory);
        Assert.assertNotNull(result);
    }
    @Test
    public void updateOne(){
        ProductCategory productCategory=repository.findOne(1);
        productCategory.setCategoryName("update最爱");
        ProductCategory result=repository.save(productCategory);
        Assert.assertNotNull(result);
    }
}