/*
<7576번 토마토>
시간 제한 1초
메모리 제한 256MB

M*N 격자 모양 상자에 토마토를 넣어 창고에 보관
토마토는 익은 것과 익지 않은 것이 있음
보관 후 하루가 지나면 익은 토마토에 인접한 토마토는 익음
인접한 곳은 왼, 오, 앞, 뒤 4방향을 의미
토마토가 모두 익게 되는 최소 일수를 알고자 함

<자료구조>
M, N 상자의 가로와 세로 정보 Integer
토마토 정보를 저장할 이차원 인접 행렬 M*N

<알고리즘>
토마토가 모두 익게되는 최소 값을 구하기 위해서 ans = MAX 초기화 후 갱신



* */

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static void input(){

    }

    static void pro(){

    }

    public static void main(String[] args) {
        input();
        pro();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}