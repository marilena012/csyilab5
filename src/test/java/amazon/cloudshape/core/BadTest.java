package amazon.cloudshape.core;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BadTest {

    @Test
    public void meant_to_fail(){
	assertEquals(1, 1);
    }
}
