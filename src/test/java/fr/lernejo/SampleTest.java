package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest {
    @Test
    public void result_part_five(){
        Sample s_instance = new Sample();
        Assertions.assertEquals(s_instance.fact(5),120);
    }

    @Test
    public void throw_illegal_exception(){
        Sample s_instance = new Sample();
        IllegalArgumentException exception_t = Assertions.assertThrows(IllegalArgumentException.class,
            () ->
                s_instance.fact(-1)
        );
    }

    @Test
    public void operation_add(){
        Sample s_instance = new Sample();
        Assertions.assertEquals(s_instance.op(Sample.Operation.ADD, 1,2), 3);
    }

    @Test
    public void operation_mult(){
        Sample s_instance = new Sample();
        Assertions.assertEquals(s_instance.op(Sample.Operation.MULT, 5, 5), 25);
    }
}
