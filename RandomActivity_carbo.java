package com.example.fooddiary3.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fooddiary3.R;

import java.util.Random;

public class RandomActivity_carbo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randomfood);

        random_food();

        Button another = (Button) findViewById(R.id.another);
        another.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                random_food();
            }
        });
        //star_car
        Button choose = (Button) findViewById(R.id.choose);
        choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button previous = (Button) findViewById(R.id.btn_previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    public void random_food(){
        //랜덤 함수 생성
        final Random rand = new Random();
        // 앱 실행시 서버 아이콘 랜덤 생성
        final int[] server_ico = {R.drawable.car_apple, R.drawable.car_banana,
                R.drawable.car_beet , R.drawable.car_brownrice, R.drawable.car_blueberry,
                R.drawable.car_buckwheat, R.drawable.car_chickpea , R.drawable.car_grapefruit,
                R.drawable.car_kidneybean, R.drawable.car_mango, R.drawable.car_oats ,
                R.drawable.car_orange, R.drawable.car_quinoa, R.drawable.car_raisin,
                R.drawable.car_rice, R.drawable.car_sweetpotato};
        int server_num = rand.nextInt(server_ico.length);

        final ImageView server_img = (ImageView)findViewById(R.id.foodimage);

        server_img.setBackgroundResource(server_ico[server_num]);

        //서버아이콘과 서버 이름 매칭시키는 소스코드
        final TextView server_text1 = (TextView)findViewById(R.id.foodname);
        final TextView server_text2 = (TextView)findViewById(R.id.information);

        if(server_ico[server_num] == R.drawable.car_beet){
            server_text1.setText("비트");
            server_text2.setText("8~10% 탄수화물\n");}
        else if (server_ico[server_num] == R.drawable.car_buckwheat){
            server_text1.setText("메밀");
            server_text2.setText("조리된 메밀 20% 탄수화물, \n" + "심장건강, 혈당 조절에 도움");}
        else if (server_ico[server_num] == R.drawable.car_chickpea){
            server_text1.setText("병아리콩");
            server_text2.setText("한 컵당19.01g");}
        else if (server_ico[server_num] == R.drawable.car_banana){
            server_text1.setText("바나나");
            server_text2.setText("23% 탄수화물\n" + "혈압 저하, 소화건강 지원,\n" + " 장내 세균 제거\n");}
        else if (server_ico[server_num] == R.drawable.car_apple){
            server_text1.setText("사과");
            server_text2.setText("13~15%의 탄수화물, 심장병 예방\n");}
        else if (server_ico[server_num] == R.drawable.car_sweetpotato){
            server_text1.setText("고구마");
            server_text2.setText("18~21% 탄수화물\n");}
        else if (server_ico[server_num] == R.drawable.car_rice){
            server_text1.setText("쌀");
            server_text2.setText("");}
        else if (server_ico[server_num] == R.drawable.car_raisin){
            server_text1.setText("건포도");
            server_text2.setText("한 컵당 129.48g\n");}
        else if (server_ico[server_num] == R.drawable.car_quinoa){
            server_text1.setText("퀴노아");
            server_text2.setText("조리된 퀴노아는 21.3% 탄수화물\n");}
        else if (server_ico[server_num] == R.drawable.car_orange){
            server_text1.setText("오렌지");
            server_text2.setText("11.8% 탄수화물, 수분, 섬유질\n" + "심장건강, 신장결석 예방, 빈혈 위험 방지\n");}
        else if (server_ico[server_num] == R.drawable.car_oats){
            server_text1.setText("귀리");
            server_text2.setText("생 귀리는 66%의 탄수화물 함유,\n " +
                    "콜레스테롤 수치 저하,\n" + " 심장 질환 위험 감소, 체중 감량에 도움\n");}
        else if (server_ico[server_num] == R.drawable.car_mango){
            server_text1.setText("망고");
            server_text2.setText("잘게 썬 망고 한 컵에는 24.72g 탄수화물\n");}
        else if (server_ico[server_num] == R.drawable.car_kidneybean){
            server_text1.setText("강낭콩");
            server_text2.setText("한 컵당 21g\n");}
        else if (server_ico[server_num] == R.drawable.car_grapefruit){
            server_text1.setText("자몽");
            server_text2.setText("9%의 탄수화물, 체중 감량에 도움,\n" + "신장결석 예방, 콜레스테롤 수치 저하,\n" + "대장암예방\n");}
        else if (server_ico[server_num] == R.drawable.car_brownrice){
            server_text1.setText("현미");
            server_text2.setText("");}
        else if (server_ico[server_num] == R.drawable.car_blueberry){
            server_text1.setText("블루베리");
            server_text2.setText("14.5%의 탄수화물\n");}
    }
}