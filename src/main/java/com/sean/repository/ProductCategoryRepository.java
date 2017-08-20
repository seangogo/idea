package com.sean.repository;

import com.sean.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by admin on 2017/8/12.
 */

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
   List<ProductCategory> findbycategoryTypeOrOrderByCategoryIdDesc(Integer categoryType);

}
