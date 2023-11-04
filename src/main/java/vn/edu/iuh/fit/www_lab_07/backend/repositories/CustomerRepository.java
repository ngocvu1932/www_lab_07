package vn.edu.iuh.fit.www_lab_07.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.www_lab_07.backend.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
