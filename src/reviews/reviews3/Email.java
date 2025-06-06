package reviews.reviews3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Email {
        public void send(String to, String body) {
            System.out.println(to + "に以下のメールを送信しました。");
            System.out.println("件名: 【件名なし】");
            System.out.println("本文: " + body);
        }
        public void send(String to, String subject, String body) {
            System.out.println(to + "に以下のメールを送信しました。");
            System.out.println("件名: " + subject );
            System.out.println("本文: " + body);
        }
    }




