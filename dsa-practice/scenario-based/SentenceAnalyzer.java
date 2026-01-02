public class SentenceAnalyzer {
    public static void main(String[] args) {
        String string = """
                Technology has become an important part of everyday life and helps people in many ways. 
                It makes communication faster through       mobile phones,emails,and the internet.in education, 
                technology supports online         learning and easy access to information. Doctors use advanced machines 
                and software to treat patients and save lives.businesses use technology to improve productivity 
                and manage data efficiently. Transportation        has become faster and safer because of modern technology. 
                However, overuse of                      technology can cause health and social problems. Therefore, technology should 
                be used         wisely to make life easier, better,and.more productive for everyone.            """;
        SentenceEnhance sentence1 = new SentenceEnhance(string);                            // creating the object of ParagraphEnhance class

        System.out.println("The Unformatted Sentence is : ");
        System.out.println(string);

        System.out.println("___________________________________________________________________________________________________________________________________________");


        // To Display the enhanced sentence
        sentence1.display();

    }

}

class SentenceEnhance {
    String paragraph;                                    // Stores the paragraph
    String[] words;

    // Constructor of SentenceEnhance class
    SentenceEnhance(String paragraph) {
        try {
            paragraph = paragraph.trim();                                             // To remove the leading and trailing space from paragraph
            paragraph = paragraph.replaceAll("\\s+", " ");            // To remove multiple consecutive space to only single space.
            this.words = paragraph.split(" ");                              // This stores every word of paragraph on its indexes
            this.paragraph = paragraph;
            this.capitalize();
        } catch (Exception e) {
            System.err.println("Something went wrong");
        }
    }

    // This method adds the space after the every punctuation
    private void enhance() {
        StringBuilder ans = new StringBuilder();
        for (String word : this.words) {
            StringBuilder wordStore = new StringBuilder();
            for (char c : word.toCharArray()) {                                                // Checking the punctuation
                if (c == '.' || c == ',' || c == '?' || c == '!' || c == ':' || c == ';') {
                    wordStore.append(c);
                    wordStore.append(" ");
                }
                else{
                    wordStore.append(c);
                }
            }
            if (wordStore.charAt(wordStore.length() - 1) == ' ') {
                ans.append(wordStore);
            } else {
                ans.append(wordStore);
                ans.append(" ");
            }
        }
        this.paragraph = ans.toString();
        this.words = paragraph.split(" ");
    }

    private void capitalize() {
        this.enhance();
        for (int i = 0; i < this.words.length - 1; i++) {
            char c = this.words[i].charAt(words[i].length() - 1);
            if (c == '.' || c == ',' || c == '?' || c == '!' || c == ':' || c == ';') {
                this.words[i + 1] = this.words[i+1].substring(0,1).toUpperCase() + this.words[i+1].substring(1);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < this.words.length; i++) {
            ans.append(this.words[i]);
            if (i != this.words.length - 1) {
                ans.append(" ");
            }
        }
        this.paragraph = ans.toString();
    }


    // This method Displays the paragraph
    public void display() {
        System.out.print("Your Enhanced Sentence is : ");
        for (int i = 0; i < this.words.length; i++) {
            if ((i % 20) == 0) System.out.println(" ");
            System.out.print(this.words[i] + " ");
        }
        System.out.println("");
        System.out.println("___________________________________________________________________________________________________________________________________________");
    }
}