package blackrock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class blkRock {


    public static void main(String[] args) throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);

        try {
            double purchasePrice = Double.parseDouble(in.readLine());
            double cash = Double.parseDouble(in.readLine());
            System.out.println(blkRock.calculateChange(purchasePrice, cash));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    protected static String calculateChange(double purchasePrice, double cash) {
        StringBuilder bldr = new StringBuilder();
        int counter = 0;

        double amountToReturn = cash - purchasePrice;
        double changeLeft;

        changeLeft = giveFiftyNoteChange(bldr, counter, amountToReturn);
        changeLeft = giveTwentyNoteChange(bldr, counter, changeLeft);
        changeLeft = giveTenNoteChange(bldr, counter, changeLeft);
        changeLeft = giveFiveNoteChange(bldr, counter, changeLeft);
        changeLeft = giveTwoNoteChange(bldr, counter, changeLeft);
        changeLeft = giveOneNoteChange(bldr, counter, changeLeft);
        changeLeft = giveFiftyPenceChange(bldr, counter, changeLeft);
        changeLeft = giveTwentyPenceChange(bldr, counter, changeLeft);
        changeLeft = giveTenPenceChange(bldr, counter, changeLeft);
        changeLeft = giveFivePenceChange(bldr, counter, changeLeft);
        changeLeft = giveTwoPenceChange(bldr, counter, changeLeft);
        changeLeft = giveOnePenceChange(bldr, counter, changeLeft);






        return bldr.substring(0, bldr.lastIndexOf(","));
    }

    protected static double giveFiftyNoteChange(StringBuilder bldr, int counter, double amountToReturn) {
        int notesToPrint = (int) amountToReturn / 50;
        double changeLeft = amountToReturn;
        while (counter < notesToPrint) {
            bldr.append("Fifty Pounds, ");
            changeLeft -= 50;
            counter++;
        }
        return changeLeft;
    }

    protected static double giveTwentyNoteChange(StringBuilder bldr, int counter, double amountToReturn) {
        if (amountToReturn != 0) {
            int notesToPrint = (int) amountToReturn / 20;
            double changeLeft = amountToReturn;
            while (counter < notesToPrint) {
                bldr.append("Twenty Pounds, ");
                changeLeft -= 20;
                counter++;
            }
            return changeLeft;

        } else return amountToReturn;

    }

    protected static double giveTenNoteChange(StringBuilder bldr, int counter, double amountToReturn) {
        if (amountToReturn != 0) {
            int notesToPrint = (int) amountToReturn / 10;
            double changeLeft = amountToReturn;
            while (counter < notesToPrint) {
                bldr.append("Ten Pounds, ");
                changeLeft -= 10;
                counter++;
            }
            return changeLeft;
        } else return amountToReturn;
    }


    protected static double giveFiveNoteChange(StringBuilder bldr, int counter, double amountToReturn) {
        if (amountToReturn != 0) {
            int notesToPrint = (int) amountToReturn / 5;
            double changeLeft = amountToReturn;
            while (counter < notesToPrint) {
                bldr.append("Five Pounds, ");
                changeLeft -= 5;
                counter++;
            }
            return changeLeft;
        } else return amountToReturn;

    }

    protected static double giveTwoNoteChange(StringBuilder bldr, int counter, double amountToReturn) {
        if (amountToReturn != 0) {
            int notesToPrint = (int) amountToReturn / 2;
            double changeLeft = amountToReturn;
            while (counter < notesToPrint) {
                bldr.append("Two Pounds, ");
                changeLeft -= 2;
                counter++;
            }
            return changeLeft;

        } else return amountToReturn;

    }

    protected static double giveOneNoteChange(StringBuilder bldr, int counter, double amountToReturn) {
        if (amountToReturn != 0) {
            int notesToPrint = (int) amountToReturn;
            double changeLeft = amountToReturn;
            while (counter < notesToPrint) {
                bldr.append("One Pound, ");
                changeLeft -= 1;
                counter++;
            }
            return changeLeft;
        } else return amountToReturn;
    }

    protected static double giveFiftyPenceChange(StringBuilder bldr, int counter, double amountToReturn) {
        if (amountToReturn >= 0.50) {
            bldr.append("Fifty Pence, ");
            return amountToReturn - 0.50;
        } else return amountToReturn;
    }

    protected static double giveTwentyPenceChange(StringBuilder bldr, int counter, double amountToReturn) {
        if (amountToReturn >=0.20) {
            bldr.append("Twenty Pence, ");
            return amountToReturn - 0.20;
        } else return amountToReturn;
    }

    protected static double giveTenPenceChange(StringBuilder bldr, int counter, double amountToReturn) {
        if (amountToReturn >= 0.10) {
            bldr.append("Ten Pence, ");
            return amountToReturn - 0.10;
        } else return amountToReturn;
    }

    protected static double giveFivePenceChange(StringBuilder bldr, int counter, double amountToReturn) {
        if (amountToReturn >= 0.05) {
            bldr.append("Five Pence, ");
            return amountToReturn - 0.05;
        } else return amountToReturn;
    }


    protected static double giveTwoPenceChange(StringBuilder bldr, int counter, double amountToReturn) {
        if (amountToReturn > 0.019) {
            bldr.append("Two Pence, ");
            return amountToReturn - 0.02;
        } else return amountToReturn;
    }

    protected static double giveOnePenceChange(StringBuilder bldr, int counter, double amountToReturn) {
        if (amountToReturn > 0) {
            bldr.append("One Pence, ");
            return amountToReturn - 0.01;
        } else return amountToReturn;
    }


}