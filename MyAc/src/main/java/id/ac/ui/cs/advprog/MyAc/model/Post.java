package id.ac.ui.cs.advprog.MyAc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "judul")
    private String judul;

    @Column(name = "isiPost")
    private String isiPost;

    @Column(name = "topikMataKuliah")
    private String topikMataKuliah;


    public Post(long id, String judul, String isiPost, String topikMataKuliah) {
        this.id = id;
        this.judul = judul;
        this.isiPost = isiPost;
        this.topikMataKuliah = topikMataKuliah;

    }
    public  Post(){
    }

    public long getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsiPost() {
        return isiPost;
    }

    public void setIsiPost(String isiPost) {
        this.isiPost = isiPost;
    }

    public String getTopikMataKuliah() {
        return topikMataKuliah;
    }

    public void setTopikMataKuliah(String topikMataKuliah) {
        this.topikMataKuliah = topikMataKuliah;
    }
}
