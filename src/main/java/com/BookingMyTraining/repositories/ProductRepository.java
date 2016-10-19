package com.BookingMyTraining.repositories;

import org.springframework.data.repository.CrudRepository;

import com.BookingMyTraining.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}