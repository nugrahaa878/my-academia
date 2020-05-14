package id.ac.ui.cs.advprog.MyAc.service;

import id.ac.ui.cs.advprog.MyAc.model.SemesterPlan;
import id.ac.ui.cs.advprog.MyAc.repository.SemesterPlanRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class SemesterPlanServiceImplTest {
    @Mock
    private SemesterPlanRepository semesterPlanRepository;

    @InjectMocks
    private SemesterPlanServiceImpl semesterPlanServiceImpl;

    private SemesterPlan semesterPlan;

    @BeforeEach
    public void setUp() throws Exception {
        this.semesterPlan = new SemesterPlan(1L,2L, 3);
    }

    @Test
    public void whenFindAllIsCalledItShouldCallSemesterPlanRepositoryFindAll() {
        semesterPlanServiceImpl.findAll();
        verify(semesterPlanRepository, times(1)).findAll();
    }

    @Test
    public void whenGetIsCalledItShouldCallSemesterPlanRepositoryFindById() {
        semesterPlanServiceImpl.findSemesterPlan(1L);
        verify(semesterPlanRepository, times(1)).findById(1L);
    }
}
