package com.exam.myworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //다시 커밋 합니다.
        //Toast.makeText(this, "효비는 짱임!!" , Toast.LENGTH_LONG).show();

        //Button btn = (Button)
    }

    public void onClickButton(View v){

        Log.d("exam" , "onClickButton");
        Toast.makeText(this, "효비는 짱임!!" , Toast.LENGTH_LONG).show();
    }
}