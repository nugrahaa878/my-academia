package id.ac.ui.cs.advprog.MyAc.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "semesterPlan")
public class SemesterPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "idLong")
    private Long idLong;

    @Column(name = "semester")
    private int semester ;

    public SemesterPlan(){}

    public SemesterPlan(Long idLong, int semester){
        this.idLong = idLong;
        this.semester = semester;
    }

    public Long getId(){
        return this.id;
    }

    public Long getIdLong(){
        return this.idLong;
    }

    public int getSemester(){
        return this.semester;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdLong(Long idLong) {
        this.idLong = idLong;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
