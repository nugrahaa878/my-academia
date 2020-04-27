package id.ac.ui.cs.advprog.MyAc.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostTest {

    private Post post;

    @BeforeEach
    public void setUp() throws Exception {
        this.post = new Post(1, "post title", "post text", "course topic");
    }

    @Test
    public void testGetId() {
        assertEquals(1, this.post.getId());
    }

    @Test
    public void testGetTitle() {
        assertEquals("post title", this.post.getTitle());
    }

    @Test
    public void testGetPostText() {
        assertEquals("post text", this.post.getPostText());
    }

    @Test
    public void testGetCourseTopic() {
        assertEquals("course topic", this.post.getCourseTopic());
    }

    @Test
    public void testSetTitle() {
        post.setTitle("new title");
        assertEquals("new title", post.getTitle());
    }

    @Test
    public void testSetPostText() {
        post.setPostText("new post text");
        assertEquals("new post text", post.getPostText());
    }

    @Test
    public void testSetCourseTopic() {
        post.setCourseTopic("new course");
        assertEquals("new course", post.getCourseTopic());
    }
}
