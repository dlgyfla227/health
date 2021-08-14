package com.example.fooddiary3.random;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fooddiary3.R;

import java.util.Random;

public class RandomActivity_fat extends AppCompatActivity {

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
        //star_fat
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
        final int[] server_ico = {R.drawable.fat_almond, R.drawable.fat_avocado,
                R.drawable.fat_cabbage , R.drawable.fat_chiaseed, R.drawable.fat_coconut,
                R.drawable.fat_darkchoco, R.drawable.fat_egg , R.drawable.fat_herring,
                R.drawable.fat_kale, R.drawable.fat_mackerel, R.drawable.fat_olive ,
                R.drawable.fat_pekan, R.drawable.fat_salmon, R.drawable.fat_spanich,
                R.drawable.fat_walnut};
        int server_num = rand.nextInt(server_ico.length);

        final ImageView server_img = (ImageView)findViewById(R.id.foodimage);

        server_img.setBackgroundResource(server_ico[server_num]);

        //서버아이콘과 서버 이름 매칭시키는 소스코드
        final TextView server_text1 = (TextView)findViewById(R.id.foodname);
        final TextView server_text2 = (TextView)findViewById(R.id.information);

        if(server_ico[server_num] == R.drawable.fat_walnut){
            server_text1.setText("호두");
            server_text2.setText("");}
        else if (server_ico[server_num] == R.drawable.fat_spanich){
            server_text1.setText("시금치");
            server_text2.setText("오메가-3 지방산");}
        else if (server_ico[server_num] == R.drawable.fat_salmon){
            server_text1.setText("연어");
            server_text2.setText("오메가-3 지방산,\n" + "심장건강, 뇌기능 향상");}
        else if (server_ico[server_num] == R.drawable.fat_pekan){
            server_text1.setText("피칸");
            server_text2.setText("혈관건강, 심장병 예방, 뇌 기능 증진");}
        else if (server_ico[server_num] == R.drawable.fat_olive){
            server_text1.setText("올리브오일");
            server_text2.setText("혈압 저하, 소화기능");}
        else if (server_ico[server_num] == R.drawable.fat_mackerel){
            server_text1.setText("고등어");
            server_text2.setText("오메가-3 지방산,\n" + "심장건강, 뇌기능 향상");}
        else if (server_ico[server_num] == R.drawable.fat_kale){
            server_text1.setText("케일");
            server_text2.setText("오메가-3 지방산\n");}
        else if (server_ico[server_num] == R.drawable.fat_herring){
            server_text1.setText("청어");
            server_text2.setText("오메가-3 지방산,\n" + "심장건강, 뇌기능 향상");}
        else if (server_ico[server_num] == R.drawable.fat_egg){
            server_text1.setText("달걀");
            server_text2.setText("");}
        else if (server_ico[server_num] == R.drawable.fat_darkchoco){
            server_text1.setText("다크초콜릿");
            server_text2.setText("");}
        else if (server_ico[server_num] == R.drawable.fat_cabbage){
            server_text1.setText("양배추");
            server_text2.setText("오메가-3 지방산");}
        else if (server_ico[server_num] == R.drawable.fat_coconut){
            server_text1.setText("코코넛");
            server_text2.setText("심장병 예방");}
        else if (server_ico[server_num] == R.drawable.fat_chiaseed){
            server_text1.setText("치아시드");
            server_text2.setText("오메가3지방산, 혈압저하, 항염증제 효과");}
        else if (server_ico[server_num] == R.drawable.fat_avocado){
            server_text1.setText("아보카도");
            server_text2.setText("");}
        else if (server_ico[server_num] == R.drawable.fat_almond){
            server_text1.setText("아몬드");
            server_text2.setText("혈관건강, 심장병 예방, 뇌 기능 증진");}
    }
}