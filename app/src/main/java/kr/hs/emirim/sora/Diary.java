package kr.hs.emirim.sora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Diary extends AppCompatActivity {

    private String Question;
    private String answer;

    public Diary(){}

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
