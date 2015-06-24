public class wordDic{
    public class TrieNode{
       Trie [] children = new Trie [26];
       String item;
    }
    TrieNode root = new TrieNode();
    public void addWord(String word){
         TrieNode node = root;
         for(char c : word.charArray()){
             if(!children[c-'a'] == null){
                children[c-'a'] = new TrieNode();
             }
             node = node.children[c-'a'];
         }
           node.item = word;
    }
}