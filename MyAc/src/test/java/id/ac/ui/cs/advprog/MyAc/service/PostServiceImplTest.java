package id.ac.ui.cs.advprog.MyAc.service;
import id.ac.ui.cs.advprog.MyAc.model.Post;
import id.ac.ui.cs.advprog.MyAc.repository.PostRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Timestamp;
import java.util.Date;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class PostServiceImplTest {
    @Mock
    private PostRepository forumRepository;

    @InjectMocks
    private PostServiceImpl forumService;

    private Post post;
    Date date = new Date();
    Timestamp timestamp = new Timestamp(date.getTime());


    @BeforeEach
    public void setUp() throws Exception {
        this.post = new Post(1, "post title", "post text", "course topic", timestamp);
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
