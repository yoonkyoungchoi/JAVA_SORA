package kr.hs.emirim.sora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Question extends AppCompatActivity {

    //    ArrayList<String> food = new ArrayList<String>(); // 음식에 대한 답변 배열`
//    ArrayList<String> Worry = new ArrayList<String>(); // 고민에 대한 답변 배열
//    ArrayList<String> Choice = new ArrayList<String>(); // 선택에 대한 답변 배열
    private EditText Questions;
    private TextView answerText;
    Button Questionbtn;
    Random randomanswer = new Random();
    private EditText editText;
    private String question;


    String[] answer1 = {"그건 아닌것 같아", "다시 생각해 봐", "나는 추천 해", "다른걸 먹어",
            "매운게 좋을 것 같아", "조금만 먹어", "간단한게 좋을 것 같아", "완전 좋은 생각이야", "부드러운 음식",
            "추억돋는 음식", "달달한 음식", "행복해지는 음식을 먹어", "아마도", "다시 생각해", "그건 아니야", "아닌것 같아", "나라면 하지 않겠어", "왜 고민해?",
            "하지마", "좋아", "고민하지 마", "해버려", "하는게 좋을 것 같아", "미쳤어?", "도랐어?", "나라면 하지 않을 것 같아",
            "음...꼭  해야할까?", "나는 아니라고 생각해", "해야될 것 같은데?", "하는게 좋을 듯", "완전 강추", "어쩌면", "....노답",
            "안돼", "아니", "응", "좋아요", "다시 한 번 물어봐", "그걸 질문이라고 해?", "그것도 안돼", "곧", "우웩", "새콤한 음식",
            "새로운 도전을 추천 해", "새로운 거", "부정적인 생각은 버리도록", "고민하지 말고 질러라", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

//        editText = findViewById(R.id.Questions);
//        question = editText.getText().toString();

        answerText = (TextView) findViewById(R.id.Questions);
        Questionbtn = (Button) findViewById(R.id.Questionsbtn);

        final int answer = randomanswer.nextInt(answer1.length) + 1;

        Questionbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (question.length() == 0) {
                    Toast.makeText(getApplicationContext(), "질문을 입력해주세요.", Toast.LENGTH_SHORT).show();
                } else {
                    answerText.setText("답 : " + answer1[answer]);
                }
            }
        });
    }
}