package ahn.sungsin;

import ahn.sungsin.service.KakaoApi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("주소를 입력하세요:");
            String address = reader.readLine();

            double[] coordinates = KakaoApi.getAddressCoordinate(address);

            if (coordinates != null) {
                System.out.println("주소: " + address);
                System.out.println("위도: " + coordinates[0]);
                System.out.println("경도: " + coordinates[1]);
            } else {
                System.out.println("주소를 찾을 수 없습니다.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}