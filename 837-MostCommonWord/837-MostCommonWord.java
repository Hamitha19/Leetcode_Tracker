// Last updated: 7/14/2026, 2:06:20 PM
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]", " ");

        Set<String> ban = new HashSet<>();
        for (String word : banned) {
            ban.add(word);
        }

        Map<String, Integer> map = new HashMap<>();
        String ans = "";
        int max = 0;

        String[] words = paragraph.split("\\s+");

        for (String word : words) {
            if (word.isEmpty() || ban.contains(word)) {
                continue;
            }

            map.put(word, map.getOrDefault(word, 0) + 1);

            if (map.get(word) > max) {
                max = map.get(word);
                ans = word;
            }
        }

        return ans;
    }
}