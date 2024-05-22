package in.dj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dj.entities.Product;

public interface ProductRepo extends JpaRepository<Product, String>{

}
