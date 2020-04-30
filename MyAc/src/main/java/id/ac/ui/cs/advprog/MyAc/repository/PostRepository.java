package id.ac.ui.cs.advprog.MyAc.repository;

import id.ac.ui.cs.advprog.MyAc.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
}
