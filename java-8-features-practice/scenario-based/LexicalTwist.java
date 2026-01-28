import java.util.HashSet;
import java.util.Scanner;

public class LexicalTwist {
    public static void main(String[] args) {
        HashSet<Character> vowelSet = new HashSet<>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        vowelSet.add('A');
        vowelSet.add('E');
        vowelSet.add('I');
        vowelSet.add('O');
        vowelSet.add('U');
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First String : ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the Second String : ");
        String str2 = scanner.nextLine();

        // Checking if the second word is a reversed version of the first word :
        if(isReversedVersion(str1,str2)){
            str1 = reverse(str1);
            str1 = str1.toLowerCase();
            StringBuilder stringBuilder = new StringBuilder();
            for(char ch : str1.toCharArray()){
                if(vowelSet.contains(ch)){
                    stringBuilder.append("@");
                }
                else stringBuilder.append(ch);
            }
            str1 = stringBuilder.toString();
            System.out.println("The transformed first String is : "+str1);
        }
        else{
            String combine = str1+str2;
            combine = combine.toUpperCase();
            int vowels = 0;
            int consonant = 0;
            for(char ch : combine.toCharArray()){
                if(vowelSet.contains(ch)){
                    vowels++;
                }
                else{
                    consonant++;
                }
            }
            if(vowels > consonant){
                StringBuilder twoVowels = new StringBuilder();
                HashSet<Character> characters = new HashSet<>();
                int count = 0;
                for(int i = 0;i<combine.length();i++){
                    if(vowelSet.contains(combine.charAt(i))){
                        if(count == 2){
                            System.out.println(twoVowels);
                            return;
                        }
                        else if(!characters.contains(combine.charAt(i))){
                            twoVowels.append(combine.charAt(i));
                            characters.add(combine.charAt(i));
                            count++;
                        }
                    }
                }
            }
            else if(consonant > vowels){
                StringBuilder twoConsonants = new StringBuilder();
                HashSet<Character> characters = new HashSet<>();
                int count = 0;
                for(int i = 0;i<combine.length();i++){
                    if(!vowelSet.contains(combine.charAt(i))){
                        if(count == 2){
                            System.out.println(twoConsonants);
                            return;
                        }
                        else if(!characters.contains(combine.charAt(i))){
                            twoConsonants.append(combine.charAt(i));
                            characters.add(combine.charAt(i));
                            count++;
                        }
                    }
                }
            }
            else{
                System.out.println("Vowels And Consonant are Equal");
            }
        }
    }
    public static boolean isReversedVersion(String str1 , String str2){
        StringBuilder sb1 = new StringBuilder(str1.toLowerCase());
        StringBuilder sb2 = new StringBuilder(str2.toLowerCase());
        return sb2.reverse().toString().equals(sb1.toString());
    }

    public static String reverse(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}

