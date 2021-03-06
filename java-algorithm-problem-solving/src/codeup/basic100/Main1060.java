package codeup.basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1060 : [기초-비트단위논리연산] 비트단위로 AND 하여 출력하기(설명) 
 *  
 * @references https://codeup.kr/problem.php?id=1060
 * @author iamdawoonjeong
 */
public class Main1060 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        System.out.println(a&b);

    }

}
