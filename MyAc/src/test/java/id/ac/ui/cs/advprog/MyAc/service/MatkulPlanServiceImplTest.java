package id.ac.ui.cs.advprog.MyAc.service;

import id.ac.ui.cs.advprog.MyAc.model.MatkulPlan;
import id.ac.ui.cs.advprog.MyAc.repository.MatkulPlanRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class MatkulPlanServiceImplTest {
    @Mock
    private MatkulPlanRepository matkulPlanRepository;

    @InjectMocks
    private MatkulPlanServiceImpl matkulPlanServiceImpl;

    private MatkulPlan matkulPlan;

    @BeforeEach
    public void setUp() throws Exception {
        this.matkulPlan = new MatkulPlan(1L,2L, "CS1234");
    }

    @Test
    public void whenFindAllIsCalledItShouldCallMatkulPlanRepositoryFindAll() {
        matkulPlanServiceImpl.findAll();
        verify(matkulPlanRepository, times(1)).findAll();
    }

    @Test
    public void whenGetIsCalledItShouldCallMatkulPlanRepositoryFindById() {
        matkulPlanServiceImpl.findMatkulPlan(1L);
        verify(matkulPlanRepository, times(1)).findById(1L);
    }
}
