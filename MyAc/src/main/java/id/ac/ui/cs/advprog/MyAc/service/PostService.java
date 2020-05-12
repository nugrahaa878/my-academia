package id.ac.ui.cs.advprog.MyAc.service;
import id.ac.ui.cs.advprog.MyAc.model.Post;
import java.util.List;
import java.util.Optional;

public interface PostService {
    List<Post> findAll();
    void save(Post product);
    Optional<Post> findById(long id);
    void delete(Post post);
}
