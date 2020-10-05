package kr.hs.emirim.sora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

//    ArrayList<String> food = new ArrayList<String>(); // 음식에 대한 답변 배열`
//    ArrayList<String> Worry = new ArrayList<String>(); // 고민에 대한 답변 배열
//    ArrayList<String> Choice = new ArrayList<String>(); // 선택에 대한 답변 배열
    private EditText Questions;
    Random randomanswer = new Random();


    String[] food = {"그건 아닌것 같아", "다시 생각해 봐", "안 먹는걸 추천 해", "다른걸 먹어",
    "매운게 좋을 것 같아", "조금만 먹어", "간단한게 좋을 것 같아", "완전 좋은 생각이야", "부드러운 음식",
    "추억돋는 음식", "달달한 음식", "행복해지는 음식을 먹어"};

    String[] Worry = {"아마도", "다시 생각해", "그건 아니야", "아닌것 같아", "나라면 하지 않겠어", "왜 고민해?",
    "하지마", "좋아", "고민하지 마", "해버려", "하는게 좋을 것 같아", "미쳤어?", "도랐어?"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Questions = (EditText)findViewById(R.id.Questions);
    }
    public void OnButtonClick(View view){
        int answer = randomanswer.nextInt(12)+1;
        Toast.makeText(getApplicationContext(), "오늘의 답변은 " + food[answer], Toast.LENGTH_SHORT).show();
//
//        switch (Questions.getText().toString()){
//            case "먹":
//                Toast.makeText(getApplicationContext(), "오늘의 답변은 " + food[answer], Toast.LENGTH_SHORT).show();
//            case "배고파":
//                Toast.makeText(getApplicationContext(), "오늘의 답변은 " + Worry[answer], Toast.LENGTH_SHORT).show();
//        }

    }
}