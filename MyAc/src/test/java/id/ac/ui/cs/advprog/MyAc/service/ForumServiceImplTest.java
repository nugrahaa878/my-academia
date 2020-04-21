package id.ac.ui.cs.advprog.MyAc.service;
import id.ac.ui.cs.advprog.MyAc.model.Post;
import id.ac.ui.cs.advprog.MyAc.repository.ForumRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ForumServiceImplTest {
    @Mock
    private ForumRepository forumRepository;

    @InjectMocks
    private ForumServiceImpl forumService;

    private Post post;


    @BeforeEach
    public void setUp() throws Exception {
        this.post = new Post(1, "judul post", "isi post", "topik matkul");
    }

    @Test
    public void whenFindAllIsCalledItShouldCallForumRepositoryFindAll() {
        forumService.findAll();

        verify(forumRepository, times(1)).findAll();
    }

    @Test
    public void whenGetIsCalledItShouldCallForumRepositoryFindById() {
        forumService.get((long) 1);

        verify(forumRepository, times(1)).findById((long) 1);
    }

    @Test
    public void whenDeleteIsCalledItShouldCallForumRepositoryDeleteById() {
        forumService.delete((long) 1);

        verify(forumRepository, times(1)).deleteById((long) 1);
    }



    @Test
    public void whenSaveIsCalledItShouldCallForumRepositorySave() {

        forumService.save(post);

        verify(forumRepository, times(1)).save(post);
    }
}
