package vn.edu.iuh.fit.www_lab_07.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_lab_07.backend.models.Product;
import vn.edu.iuh.fit.www_lab_07.backend.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void saveProduct (Product product) {
        productRepository.save(product);
    }

    public Optional<Product> findPro(Long id) {
        return productRepository.findById(id);
    }

//    public Product findProductById(Long id) {
//        return productRepository.findById(id);
//    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

}
