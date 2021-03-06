package id.ac.ui.cs.advprog.MyAc.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatkulTest {

    private Matkul matkul;

    @BeforeEach
    public void setUp() throws Exception {
        this.matkul = new Matkul("CS1234", "Matkul Test", "Deskripsi Test", 2, 5);
    }

    @Test
    public void testGetKode() {
        assertEquals("CS1234", this.matkul.getKode());
    }

    @Test
    public void testGetNama() {
        assertEquals("Matkul Test", this.matkul.getNama());
    }

    @Test
    public void testGetPenjelasan() {
        assertEquals("Deskripsi Test", this.matkul.getPenjelasan());
    }

    @Test
    public void testGetSemester() {
        assertEquals(2, this.matkul.getSemester());
    }

    @Test
    public void testGetSks() {
        assertEquals(5, this.matkul.getSks());
    }
}

