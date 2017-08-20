package com.sean.domain;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DynamicUpdate
public class ProductCategory {
  //类目ID
  @Id
  @GeneratedValue
  private Integer categoryId;

  //类目名称
  private String categoryName;

  //类目编号
  private Long categoryType;

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public Long getCategoryType() {
    return categoryType;
  }

  public void setCategoryType(Long categoryType) {
    this.categoryType = categoryType;
  }

  public ProductCategory(String categoryName, Long categoryType) {
    this.categoryName = categoryName;
    this.categoryType = categoryType;
  }

  public ProductCategory() {
  }

  @Override
  public String toString() {
    return "ProductCategory{" +
            "categoryId=" + categoryId +
            ", categoryName='" + categoryName + '\'' +
            ", categoryType=" + categoryType +
            '}';
  }
}
