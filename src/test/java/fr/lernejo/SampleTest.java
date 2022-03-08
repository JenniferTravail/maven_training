package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest {
    @Test
    public void result_part_five(){
        Assertions.assertEquals(Sample.fact(5),120);
    }

    @Test
    public void throw_illegal_exception(){
        IllegalArgumentException exception_t = Assertions.assertThrows(IllegalArgumentException.class,
            () ->
                Sample.fact(-1)
        );
    }

    @Test
    public void operation_add(){
        Assertions.assertEquals(Sample.op(Sample.Operation.ADD, 1,2), 3);
    }

    @Test
    public void operation_mult(){
        Assertions.assertEquals(Sample.op(Sample.Operation.MULT, 5, 5), 25);
    }
}
