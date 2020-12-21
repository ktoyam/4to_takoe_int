package pract31;

import org.junit.Test;

import static org.junit.Assert.fail;

public class IpTests {

    @Test
    public void test(){
        if(!Ip.isValid("127.0.0.1")){
            fail();
        }
    }
}
