package programmers.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N42579 {

    public static void main(String[] args) {
        int[] solution = Solution.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
        System.out.println("solution = " + Arrays.toString(solution));
    }

    static class Solution {
        public static int[] solution(String[] genres, int[] plays) {
            Map<String, Integer> genrePlayCount = new HashMap<>(); // 장르별 총 재생 횟수 저장
            Map<String, List<int[]>> genreSongs = new HashMap<>(); // 장르별 노래 리스트 저장

            // 1. 데이터 저장
            for (int i = 0; i < genres.length; i++) {
                genrePlayCount.put(genres[i], genrePlayCount.getOrDefault(genres[i], 0) + plays[i]);
                genreSongs.computeIfAbsent(genres[i], k -> new ArrayList<>())
                        .add(new int[]{plays[i], i}); // [재생 횟수, 고유 번호]
            }

            // 2. 장르별 총 재생 횟수를 기준으로 내림차순 정렬
            List<String> sortedGenres = new ArrayList<>(genrePlayCount.keySet());
            sortedGenres.sort((a, b) -> Integer.compare(genrePlayCount.get(b), genrePlayCount.get(a)));

            // 3. 장르 내에서 재생 횟수 내림차순, 같으면 고유 번호 오름차순 정렬 후 최대 2개 선택
            List<Integer> bestAlbum = new ArrayList<>();
            for (String genre : sortedGenres) {
                List<int[]> songs = genreSongs.get(genre);

                songs.sort((a, b) -> {
                    if (b[0] != a[0]) return Integer.compare(b[0], a[0]); // 재생 횟수 내림차순
                    return Integer.compare(a[1], b[1]); // 고유 번호 오름차순
                });

                // 최대 2곡만 추가
                bestAlbum.add(songs.get(0)[1]);
                if (songs.size() > 1) {
                    bestAlbum.add(songs.get(1)[1]);
                }
            }

            // 4. 결과를 배열로 변환
            return bestAlbum.stream().mapToInt(i -> i).toArray();
        }
    }
}
