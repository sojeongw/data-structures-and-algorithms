package programmers.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class N42579 {

    public static void main(String[] args) {
        int[] solution = Solution.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
        System.out.println("solution = " + Arrays.toString(solution));
    }

    static class Solution {
        public static int[] solution(String[] genres, int[] plays) {
            Map<String, List<int[]>> genreMap = new HashMap<>();
            Map<String, Integer> genreCountMap = new HashMap<>();

            for (int i = 0; i < genres.length; i++) {
                List<int[]> value = genreMap.computeIfAbsent(genres[i], v -> new ArrayList<>());
                genreMap.put(genres[i], value);
                value.add(new int[]{plays[i], i});

                genreCountMap.put(genres[i], genreCountMap.getOrDefault(genres[i], 0) + plays[i]);
            }

            Set<String> keys = genreCountMap.keySet();
            List<String> orderedGenres = keys.stream().sorted(Comparator.comparingInt(genreCountMap::get).reversed()).collect(Collectors.toList());

            List<Integer> answer = new ArrayList<>();
            for (String orderedGenre : orderedGenres) {
                List<int[]> info = genreMap.get(orderedGenre);

                info.sort(Comparator.comparingInt((int[] arr) -> -arr[0])
                        .thenComparingInt(arr -> arr[1]));

                answer.add(info.get(0)[1]);
                if (info.size() > 1) {
                    answer.add(info.get(1)[1]);
                }
            }

            return answer.stream().mapToInt(value -> value).toArray();
        }
    }
}
