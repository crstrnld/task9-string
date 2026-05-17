

class SentenceAnalyzer {
    private String sentence;

    public SentenceAnalyzer(String sentence) {
        this.sentence = sentence;
    }

    public int getTotalCharacters() {
        return sentence.length();
    }

    public int getTotalWords() {
        return sentence.trim().split("\\s+").length;
    }

    public String toUpperCase() {
        return sentence.toUpperCase();
    }

    public String toLowerCase() {
        return sentence.toLowerCase();
    }

    public String getReverse() {
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countVowels() {
        int vowels = 0;
        for (char c : sentence.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            }
        }
        return vowels;
    }

    public int countConsonants() {
        int consonants = 0;
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(c) && "aeiou".indexOf(c) == -1) {
                consonants++;
            }
        }
        return consonants;
    }

    public boolean isPalindrome() {
        String cleaned = sentence.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}