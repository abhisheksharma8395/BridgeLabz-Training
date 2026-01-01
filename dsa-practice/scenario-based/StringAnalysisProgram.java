public class StringAnalysisProgram {
    public static void main(String[] args) {
        String string = """
                     Technology has become an important part of everyday life and helps people in many ways. 
                     It makes communication faster through       mobile phones, emails, and the internet. In education, 
                     technology supports online         learning and easy access to information. Doctors use advanced machines 
                     and software to treat patients and save lives. Businesses use technology to improve productivity 
                     and manage data efficiently. Transportation        has become faster and safer because of modern technology. 
                     However, overuse of                      technology can cause health and social problems. Therefore, technology should 
                     be used         wisely to make life easier, better, and more productive for everyone.            """;
        ParagraphEnhance paragraph1 = new ParagraphEnhance(string);                            // creating the object of ParagraphEnhance class

        // To Display the paragraph
        paragraph1.display();


        // To Display the longest word in paragraph
        paragraph1.longestWord();

        // To print the total words in the paragraph
        paragraph1.totalWords();
        // to replace the word
        paragraph1.replaceWords("to","for");

        // Printing the paragraph after replacing the word
        paragraph1.display();
    }

}

class ParagraphEnhance{
    String paragraph;                                    // Stores the paragraph
    String[] words;

    // Constructor of ParagraphEnhance class
    ParagraphEnhance(String paragraph){
        try {
            paragraph = paragraph.trim();                                             // To remove the leading and trailing space from paragraph
            paragraph = paragraph.replaceAll("\\s+", " ");            // To remove multiple consecutive space to only single space.
            this.words = paragraph.split(" ");                              // This stores every word of paragraph on its indexes
            this.paragraph = paragraph;
        }
        catch(Exception e){
            System.err.println("Something went wrong");
        }
    }

    // This method counts the total number of words from the paragraph
    public void totalWords(){
        System.out.println("Total words in the Paragraph is : " + this.words.length);
        System.out.println("____________________________________________________________________________________________________________________________________________");
    }

    // This method finds the longest word in the paragraph.
    public void longestWord(){
        String longestWord = "";                             // Stores longest word during iteration
        for(String word : this.words){                       // Chacking every word to find the longest word
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        if(longestWord.equals("")){
            System.out.println("No longest word found perhaps there is no word in the Paragraph .");
            return;
        }
        System.out.println("Longest word in the paragraph is : " + longestWord);
        System.out.println("___________________________________________________________________________________________________________________________________________");
    }

    // This method replace all occurrences of a specific word with another word
    public void replaceWords(String word , String replacement){
        word = word.toLowerCase();

        // Creating the object of StringBuilder class
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<words.length;i++){

            if(words[i].toLowerCase().equals(word)){
                words[i] = replacement;
            }

            if(i!=words.length-1){
                sb.append(words[i]);
                sb.append(" ");
            }
            else if(i==words.length-1){
                sb.append(words[i]);
            }

        }

        this.paragraph = sb.toString();
        this.words = paragraph.split(" ");
    }

    public void display(){
        System.out.print("Your Enhanced Paragraph is : ");
        for(int i = 0;i<words.length;i++){
            if((i%20) == 0) System.out.println(" ");
            System.out.print(words[i]+" ");
        }
        System.out.println("");
        System.out.println("___________________________________________________________________________________________________________________________________________");
    }
}