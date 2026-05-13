class Solution {
    public boolean isAnagram(String s, String t) {
      int[] fre = new int[26];
    s = s.trim().replaceAll("[^A-Za-z]", "").toLowerCase();
        t = t.trim().replaceAll("[^A-Za-z]", "").toLowerCase();
      if(s.length() != t.length()) return false;

      for(int i = 0; i < s.length(); i++){
        fre[s.charAt(i) - 'a']++;
        fre[t.charAt(i) - 'a']--;
      }

    for(int n : fre){
        if(n != 0){
            return false;
        }
    }

    return true;
    }
}
