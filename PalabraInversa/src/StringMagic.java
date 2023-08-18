public class StringMagic {

    public String reverseWordsInSentence(String sentence) {
        // TODO: Check if the sentence is null.
        // If the sentence is null, return "INVALID"
        if (sentence == null){
            return "INVALID";
        }
        // TODO: Check if the sentence is empty.
        // If the sentence is empty, return an empty string
        if (sentence.length()==0){
            return "";
        }
        // TODO: Split the sentence into words using the split method. 
        // Use " " as the delimiter to match space.
        String [] arr = sentence.split(" ");
        // TODO: Create a StringBuilder to hold the reversed sentence.
        StringBuilder sb =  new StringBuilder();
        // TODO: Loop through each word in the words array.
        for (String word : arr){
            StringBuilder sba = new StringBuilder(word).reverse();
            sb.append(sba).append(" ");
        }
            // TODO: For each word, create a StringBuilder and reverse the word.
            // Append the reversed word, followed by a space, to the reversed sentence.

        // TODO: After reversing all the words, trim the trailing space and return the reversed sentence.
        
             return sb.toString().trim();
    }
}