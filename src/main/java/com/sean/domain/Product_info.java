package com.sean.domain;

public class Product_info {
  private String product_id;
  private String product_name;
  private Double product_price;
  private Long product_stock;
  private String product_description;
  private String product_icon;
  private Long product_status;
  private Long category_type;
  private java.sql.Timestamp create_time;
  private java.sql.Timestamp update_time;

  public String getProduct_id() {
    return product_id;
  }

  public void setProduct_id(String product_id) {
    this.product_id = product_id;
  }

  public String getProduct_name() {
    return product_name;
  }

  public void setProduct_name(String product_name) {
    this.product_name = product_name;
  }

  public Double getProduct_price() {
    return product_price;
  }

  public void setProduct_price(Double product_price) {
    this.product_price = product_price;
  }

  public Long getProduct_stock() {
    return product_stock;
  }

  public void setProduct_stock(Long product_stock) {
    this.product_stock = product_stock;
  }

  public String getProduct_description() {
    return product_description;
  }

  public void setProduct_description(String product_description) {
    this.product_description = product_description;
  }

  public String getProduct_icon() {
    return product_icon;
  }

  public void setProduct_icon(String product_icon) {
    this.product_icon = product_icon;
  }

  public Long getProduct_status() {
    return product_status;
  }

  public void setProduct_status(Long product_status) {
    this.product_status = product_status;
  }

  public Long getCategory_type() {
    return category_type;
  }

  public void setCategory_type(Long category_type) {
    this.category_type = category_type;
  }

  public java.sql.Timestamp getCreate_time() {
    return create_time;
  }

  public void setCreate_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
  }

  public java.sql.Timestamp getUpdate_time() {
    return update_time;
  }

  public void setUpdate_time(java.sql.Timestamp update_time) {
    this.update_time = update_time;
  }
}
