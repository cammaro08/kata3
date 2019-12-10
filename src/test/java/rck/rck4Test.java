package rck;

import org.junit.Test;

public class rck4Test {
}
    @Test
    public void matchOneBenchmarkWithOneStock(){
        assertEquals("BUY,Vodafone,STOCK 5", rck4.matchBenchmark("Vodafone,STOCK,10:Vodafone,STOCK,15"));
    }

}