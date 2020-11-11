package kr.hs.emirim.sora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.LinkAddress;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Diary extends AppCompatActivity {

    EditText mDiaryEdit = null;
    Filemanager filemanager = new Filemanager(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);

        mDiaryEdit = (EditText) findViewById(R.id.diary_edit);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.load_btn:{
                String diaryData = filemanager.load();
                mDiaryEdit.setText(diaryData);
                Toast.makeText(this, "불러오기 완료", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.save_btn:{
                String diaryData = mDiaryEdit.getText().toString();
                filemanager.save(diaryData);
                mDiaryEdit.setText("");

                Toast.makeText(this, "저장 완료", Toast.LENGTH_LONG).show();
                break;
            }

            case R.id.delete_btn:{
                filemanager.delete();
                mDiaryEdit.setText("");

                Toast.makeText(this, "삭제 완료", Toast.LENGTH_LONG).show();
            }
        }
    }
}