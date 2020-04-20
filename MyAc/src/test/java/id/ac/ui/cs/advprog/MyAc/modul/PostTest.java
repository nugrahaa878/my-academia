package id.ac.ui.cs.advprog.MyAc.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import id.ac.ui.cs.advprog.MyAc.model.*;

public class PostTest {

    private Post post;

    @BeforeEach
    public void setUp() throws Exception {
        this.post = new Post(1, "judul post", "isi post", "topik matkul");
    }

    @Test
    public void testGetId() {
        assertEquals(1, this.post.getId());
    }

    @Test
    public void testGetJudul() {
        assertEquals("judul post", this.post.getJudul());
    }

    @Test
    public void testGetIsiPost() {
        assertEquals("isi post", this.post.getIsiPost());
    }

    @Test
    public void testGetTopikMataKuliah() {
        assertEquals("topik matkul", this.post.getTopikMataKuliah());
    }

    @Test
    public void testSetJudul() {
        post.setJudul("judul baru");
        assertEquals("judul baru", post.getJudul());
    }

    @Test
    public void testSetIsiPost() {
        post.setIsiPost("isi post baru");
        assertEquals("isi post baru", post.getIsiPost());
    }

    @Test
    public void testSetTopikMataKuliah() {
        post.setTopikMataKuliah("matkul baru");
        assertEquals("matkul baru", post.getTopikMataKuliah());
    }
}