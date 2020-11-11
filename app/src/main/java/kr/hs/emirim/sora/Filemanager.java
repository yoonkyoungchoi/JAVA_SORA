package kr.hs.emirim.sora;

import android.content.Context;
import android.util.Log;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filemanager {
    private static final String FILE_NAME = "Diary.txt";
    private static final String TAG = "파일매니져";
    Context mContext = null;

    public Filemanager(Context context) {
        mContext = context;
    }

    public void save(String strData) {
        if (strData == null || strData.equals("")) {
            return;
        }

        FileOutputStream fosDiary = null;

        try {
            fosDiary = mContext.openFileOutput(FILE_NAME, Context.MODE_PRIVATE);
            fosDiary.write(strData.getBytes());
            fosDiary.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String load() {
        try {
            FileInputStream fisDiary = mContext.openFileInput(FILE_NAME);
            byte[] diaryData = new byte[fisDiary.available()];
            Log.d(TAG, "vk파일 크기" +  fisDiary.available());

            while (fisDiary.read(diaryData) != -1) {

            }
            Log.d(TAG, "읽어들인거 ㅉ끼음");
            return new String(diaryData);

        } catch (IOException e) { }
        return "";
    }
        public void delete() {
            mContext.deleteFile(FILE_NAME);
        }
    }

