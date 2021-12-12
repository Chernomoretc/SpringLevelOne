package com.geekbrains.spring.web.repositories.specifications;

import com.geekbrains.spring.web.entities.Product;
import org.springframework.data.jpa.domain.Specification;

public class ProductsSpecifications {
    public static Specification <Product> costGreaterOrEqualsThan(Long cost)
    {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("cost"),cost));
    }
    public static Specification <Product> costLessThanOrEqualsThan(Long cost)
    {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.lessThanOrEqualTo(root.get("cost"),cost));
    }

}
