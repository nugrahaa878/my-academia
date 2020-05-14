package id.ac.ui.cs.advprog.MyAc.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

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

    @Column(name = "penjelasan", length = 1000)
    @Size(max = 1000)
    private String penjelasan;

    public Matkul() {
    }


    public Matkul(String kode, String nama, String penjelasan, int semester, int sks){
        this.nama = nama;
        this.kode = kode;
        this.semester = semester;
        this.sks = sks;
        this.penjelasan = penjelasan;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;

    }

    public int getSemester() {
        return semester;
    }

    public int getSks() {
        return sks;
    }

    public String getPenjelasan() {
        return penjelasan;
    }

    @Override
    public String toString() {
        return String.format("Kode: %s, Nama: %s, Semester: %d, Sks: %d", this.kode, this.nama, this.semester, this.sks);
    }
}

