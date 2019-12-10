package rck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class rck4 {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println();
        }
    }


//    public static String matchBenchmark(String input) {
//        //Vodafone,STOCK,10:Vodafone,STOCK,15
//
//        String portfolio = input.substring(0, (input.indexOf(":")));
//        String benchmark = input.substring(input.indexOf(":"), input.length());
//
//        int portfolioStockValue = Integer.parseInt(portfolio.substring(portfolio.lastIndexOf(','),portfolio.length()));
//        int benchmarkStockValue = Integer.parseInt(benchmark.substring(benchmark.lastIndexOf(','),benchmark.length()));
//
//        int diff = benchmarkStockValue - portfolioStockValue;
//        float addOrSubtract = Math.signum(diff);
//        switch ((int) addOrSubtract){
//            case 1: portfolioStockValue =+ diff;
//            case -1:
//        }
//
//    }




}
    