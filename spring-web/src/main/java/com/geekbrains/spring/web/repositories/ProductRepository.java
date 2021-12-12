package com.geekbrains.spring.web.repositories;

import com.geekbrains.spring.web.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long>, JpaSpecificationExecutor<Product> {

    @Query("select p from product p where p.cost > :min")
    List<Product> findAllByCostMin( Long min);

    @Query("select p from product p where p.cost < :max")
    List<Product> findAllByCostMax(Long max);

    @Query("select p from product p where p.cost between :min and :max")
    List<Product> findAllByCostMinMax(Long min,Long max);
}
