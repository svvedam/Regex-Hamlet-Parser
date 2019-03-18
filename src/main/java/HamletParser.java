import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;

    public HamletParser(){
        this.hamletData = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData(){
        return hamletData;
    }

    public String changeHamletToLeon(String myString){
        myString = myString.replaceAll("Hamlet","Leon");
        return myString;
    }

    public String changeHoratioToHamlet(String myString){
         myString = myString.replaceAll("Horatio","Tariq");
        return myString;
    }
    public Boolean findHoratio(String sentence){
        Pattern myPattern = Pattern.compile("Horatio");
        Matcher m = myPattern.matcher(sentence);
        if(m.find())
            return true;
        else
            return false;

    }
    public Boolean findHamlet(String sentence){
        Pattern myPattern = Pattern.compile("Hamlet");
        Matcher m = myPattern.matcher(sentence);
        if(m.find())
            return true;
        else
            return false;

    }
}
