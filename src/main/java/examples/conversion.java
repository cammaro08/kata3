package examples;

public class conversion {

    //String Conversion
    String s = "tadaa";

    //To character
    char[] stringInCharacter = s.toCharArray();

    //To integer
    int i = Integer.parseInt(s); //exception will be thrown genius. but it works.


    //Integer Conversion
    int lolz = 324;

    //TO character
    char c = (char) lolz;
    //To string
    String haha = Integer.toString(lolz);


    //Character Conversion
    char cToConvert = '2';

    //to String
    String convert = Character.toString(cToConvert);

    //to integer
    char anotherCharc = '1';
    int lolzi = ((int) anotherCharc);


    //You can cast any to any --->  int,float,double,char,byte because they are primitive types.

}
