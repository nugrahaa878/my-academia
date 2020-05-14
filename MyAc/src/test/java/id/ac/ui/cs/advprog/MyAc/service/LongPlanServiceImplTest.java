package id.ac.ui.cs.advprog.MyAc.service;

import id.ac.ui.cs.advprog.MyAc.model.LongPlan;
import id.ac.ui.cs.advprog.MyAc.repository.LongPlanRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class LongPlanServiceImplTest {
    @Mock
    private LongPlanRepository longPlanRepository;

    @InjectMocks
    private LongPlanServiceImpl longPlanServiceImpl;

    private LongPlan longPlan;

    @BeforeEach
    public void setUp() throws Exception {
        this.longPlan = new LongPlan(1L,2L, "To be Great Spring Developer");
    }

    @Test
    public void whenFindAllIsCalledItShouldCallLongPlanRepositoryFindAll() {
        longPlanServiceImpl.findAll();
        verify(longPlanRepository, times(1)).findAll();
    }

    @Test
    public void whenGetIsCalledItShouldCallLongPlanRepositoryFindById() {
        longPlanServiceImpl.findLongPlan(1L);
        verify(longPlanRepository, times(1)).findById(1L);
    }


}
