package id.ac.ui.cs.advprog.MyAc.repository;

import id.ac.ui.cs.advprog.MyAc.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForumRepository extends JpaRepository<Post, Long> {

}
