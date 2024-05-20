// ProductRepository
package dev.demoecommerce.products;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    Optional<Product> findById(String id);
    List<Product> findByNameIgnoreCaseContaining(String name);
}
