public class WordDictionary {
static class TrieNode {
    final TrieNode[] children = new TrieNode[26];
    boolean end = false;

    public void addWord(String word, int idx) {
        if (idx == word.length()) {
            end = true;
            return;
        }
        char c = word.charAt(idx);
        if(children[c - 'a'] == null) {
            children[c - 'a'] = new TrieNode();
        }
        children[c - 'a'].addWord(word, idx + 1);
    }

    public boolean search(String word, int idx) {
        if (idx == word.length()) {
            return end;
        }

        char c = word.charAt(idx);
        if (c != '.') {
            return children[c - 'a'] != null && children[c - 'a'].search(word, idx + 1);
        } else {
            for (int i = 0; i < 26; i++) {
                if (children[i] != null && children[i].search(word, idx + 1)) {
                    return true;
                }
            }
            return false;
        }
    }
}

   final TrieNode root = new TrieNode();

// Adds a word into the data structure.
   public void addWord(String word) {
      root.addWord(word, 0);
   }
   // Returns if the word is in the data structure. A word could
// contain the dot character '.' to represent any one letter.
   public boolean search(String word) {
    return root.search(word, 0);
   }
}
// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");