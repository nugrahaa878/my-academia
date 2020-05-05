package id.ac.ui.cs.advprog.MyAc.repository;

import id.ac.ui.cs.advprog.MyAc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
