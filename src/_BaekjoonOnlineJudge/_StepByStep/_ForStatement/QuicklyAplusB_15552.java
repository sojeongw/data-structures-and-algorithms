package _BaekjoonOnlineJudge._StepByStep._ForStatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class QuicklyAplusB_15552 {
public static void main(String[] args) throws Exception {
        
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        
        OutputStream out = System.out;
        OutputStreamWriter writer = new OutputStreamWriter(out);
        BufferedWriter bw = new BufferedWriter(writer);
                
        int n = Integer.parseInt(br.readLine());
        String[] result = new String[n];
        
        
        for(int i=0; i<n; i++){
            
           StringTokenizer st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            result[i] = String.valueOf(a+b);
        }
        
        for(int i=0; i<result.length; i++){
            bw.write(result[i] + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
        
    }
}
