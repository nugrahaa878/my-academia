package id.ac.ui.cs.advprog.MyAc.service;

import id.ac.ui.cs.advprog.MyAc.model.Post;

import java.util.List;
import java.util.Optional;

public interface ForumService {
    public List<Post> findAll();
    public void save(Post product);
    public Optional<Post> get(long id);
    public void delete(long id);
}
