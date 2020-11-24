package kr.hs.emirim.sora;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import kr.hs.emirim.sora.R;

public class Test extends AppCompatActivity {

    private Button s;
    String TAG = "리얼타임디비 확인";

    private EditText test;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        s = (Button) findViewById(R.id.btn1);
        test = (EditText) findViewById(R.id.Qst);

        s.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                databaseReference.child("message").push().setValue(test);
                Log.d(TAG, "파일 들어감");
            }
        });
    }
}
