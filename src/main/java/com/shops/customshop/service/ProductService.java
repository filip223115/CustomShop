package com.shops.customshop.service;

import com.shops.customshop.model.Product;
import com.shops.customshop.request.AddProductRequest;
import com.shops.customshop.request.ProductUpdateRequest;

import java.util.List;

public interface ProductService {
    Product addProduct(AddProductRequest request);
    Product getProductById(Long id);
    Product updateProduct(ProductUpdateRequest request, Long productId);
    void deleteProductById(Long id);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);
}
