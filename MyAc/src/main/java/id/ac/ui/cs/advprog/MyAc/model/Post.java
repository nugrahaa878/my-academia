package id.ac.ui.cs.advprog.MyAc.model;

import org.hibernate.annotations.CreationTimestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "post_id")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "postText")
    private String postText;

    @Column(name = "courseTopic")
    private String courseTopic;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "create_date")
    private Date createDate;


    public Post(long id, String title, String postText, String courseTopic, Date createDate) {
        this.id = id;
        this.title = title;
        this.postText = postText;
        this.courseTopic = courseTopic;
        this.createDate = createDate;
    }
    public  Post(){
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getCourseTopic() {
        return courseTopic;
    }

    public void setCourseTopic(String courseTopic) {
        this.courseTopic = courseTopic;
    }

    public Date getCreateDate() {
        return createDate;
    }

}
