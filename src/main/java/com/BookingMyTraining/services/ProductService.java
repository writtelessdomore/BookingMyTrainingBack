package com.BookingMyTraining.services;

import com.BookingMyTraining.domain.Product;

public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);
}