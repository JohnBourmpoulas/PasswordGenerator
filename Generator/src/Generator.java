import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Generator {

    private int setOfPasswords;
    private int numOfCharacters;

    private ArrayList<String> passwords = new ArrayList<String>();

    public Generator(int numOfCharacters, int setOfPasswords){
        if(numOfCharacters >=4){
            this.numOfCharacters = numOfCharacters;
            this.setOfPasswords = setOfPasswords;
            setOfPasswords();
        } else {
            System.out.println("You can't get lower than 4 characters.");
        }
    }

    public void createPasswords(){
        String LOWER = "abcdefghijklmnopqrstuvwxyz";
        String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String DIGITS = "0123456789";
        String PUNCTUATION = "!#$@%";
        String ALLCHARACTERS = "abcdefghijklmnopqrstuvwxyz!#$@%ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char letters[] = new char[numOfCharacters];

        for(int i=0; i<letters.length; i++){
            letters[i] = ' ';
        }
        //Append UowerCase
        int randIdx;
        char randChar;
        if(letters[0] == ' '){
            randIdx = new Random().nextInt(LOWER.length());
            randChar = LOWER.charAt(randIdx);
            letters[0] = randChar;
        }

        if(letters[1] == ' '){
            randIdx = new Random().nextInt(UPPER.length());
            randChar = UPPER.charAt(randIdx);
            letters[1] = randChar;
        }
            
        if(letters[2] == ' '){
            randIdx = new Random().nextInt(DIGITS.length());
            randChar = DIGITS.charAt(randIdx);
            letters[2] = randChar;
        }

        if(letters[3] == ' '){
            randIdx = new Random().nextInt(PUNCTUATION.length());
            randChar = PUNCTUATION.charAt(randIdx);
            letters[3] = randChar;
        }
    

        for(int i=0; i<letters.length; i++){
            if(letters[i] == ' '){
                randIdx = new Random().nextInt(ALLCHARACTERS.length());
                randChar = ALLCHARACTERS.charAt(randIdx);
                letters[i] = randChar;
            }
        }
        List<Character> listC = new ArrayList<>();
        
        for(char c: letters){
            listC.add(c);
        }
        Collections.shuffle(listC);

        String password = new String();
        for(char c: listC){
            password += c;
        }

        passwords.add(password);
    }

    public void setOfPasswords(){
        for(int i=0; i<setOfPasswords; i++){
            createPasswords();
        }
    }

    public void display(){
        int count = 0;
        for(String str: passwords){
            System.out.print(str + " ");
            count++;
            if(count == 8){
                System.out.println();
                count = 0;
            }
        }
    }
}