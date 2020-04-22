package id.ac.ui.cs.advprog.MyAc.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "matkul")
public class Matkul {
    @Id
    @Column(name = "kode")
    private String kode ;

    @Column(name = "nama")
    private String nama;

    @Column(name = "semester")
    private int semester;

    @Column(name = "sks")
    private int sks;

    // TODO: Lengkapi atribut yang sudah anda rencanakan. Ingat bahwa atribut yang dibuat bersifat privat.
    public Matkul(){}

    public Matkul(String kode,String nama, int semester, int sks){
        this.nama = nama;
        this.kode = kode;
        this.semester = semester;
        this.sks = sks;
    }

    public String getNama(){
        return this.nama;
    }

    public int getSemester(){
        return this.semester;
    }

    public String getKode(){
        return this.kode;
    }

    public int getSks(){
        return this.sks;
    }


}

