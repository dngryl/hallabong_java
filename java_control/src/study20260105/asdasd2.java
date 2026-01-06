package study20260105;

import java.util.Scanner;

public class asdasd2 {

    public static void main(String[] args) {
        // 1부터 50까지 내가 숫자를 제시하면 컴퓨터가 범위를 좁혀가며 맞출 수 있도록 만들기

        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 50까지 수 중 내가 기입한 숫자를 맞춰라.");
        System.out.print("1~50 중 입력: ");
        int user = sc.nextInt();


        while (true) {
            int com = (int)Math.floor(Math.random()*50)+1;

            if (user > com) {
                System.out.println("컴이 입력한 숫자: "+com+" (Down)");
            }
            if (user < com) {
                System.out.println("컴이 입력한 숫자: "+com+" (Up)");
            }
            if (user == com) {
                System.out.println("컴이 입력한 숫자: "+com+" 정답입니다.");
                break;
            }
            }

            }
        }
