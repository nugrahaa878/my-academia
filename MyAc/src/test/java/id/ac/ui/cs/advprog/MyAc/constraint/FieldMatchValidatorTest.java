package id.ac.ui.cs.advprog.MyAc.constraint;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


public class FieldMatchValidatorTest {

    @MockBean
    private FieldMatch fieldMatch;

    private FieldMatchValidator fieldMatchValidator;
    private String firstName;
    private String lastName;

    @Test
    public void testInitialize() {

    }

}
