package id.ac.ui.cs.advprog.MyAc.service;
import id.ac.ui.cs.advprog.MyAc.model.Post;
import id.ac.ui.cs.advprog.MyAc.repository.ForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@SuppressWarnings("checkstyle:WhitespaceAround")
@Service
@Transactional
public class ForumServiceImpl implements ForumService{
    @Autowired
    private ForumRepository repo;

    public List<Post> findAll() {
        return repo.findAll();
    }

    public void save(Post product) {
        repo.save(product);
    }

    public Optional<Post> get(long id) {
        return repo.findById(id);
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
