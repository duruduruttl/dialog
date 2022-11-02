package com.example.dialog;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Typeface.BOLD;


public class MainActivity extends AppCompatActivity {
final int SERVICE_ACTIVITY=300;
    static final int TIME_OUT = 5000;
    final static String TAG="DEBAG_MO";
    Button btn;
    static final int MSG_DISMISS_DIALOG = 0;

    private AlertDialog mAlertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=new Intent(this, EcranPornire.class);
        startActivityForResult(intent, SERVICE_ACTIVITY);



        btn=findViewById(R.id.button);





        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == SERVICE_ACTIVITY) {

            if (resultCode == RESULT_OK) {
                Log.e(TAG, "sunt in return");
                finish();
            }
        }


    }


    @Override
    protected void onStop() {
        Log.d(TAG, "onStop started");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy started");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume started");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause started");
        super.onPause();
    }
}





