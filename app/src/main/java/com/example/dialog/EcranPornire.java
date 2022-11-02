package com.example.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

public class EcranPornire extends AppCompatActivity {


     int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
    //    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
     //   getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
      //          WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_ecran_pornire);

        i=1;


        final AlertDialog dialog=new AlertDialog.Builder(this)
                .setTitle("Alerta !!!")
                .setMessage(R.string.mesaje)
                .setIcon(R.drawable.ic_baseline_announcement_24)
                .setPositiveButton("yes", null )
                .setNegativeButton("no", null).create();




        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialogInterface) {
                final Button noBtton=dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
                new CountDownTimer(5000, 1000){
                    @Override
                    public void onTick(long l) {
                        noBtton.setText("Close ("+((l/1000+1)+")"));

                    }

                    @Override
                    public void onFinish() {
                        if(dialog.isShowing()) {
                            dialog.dismiss();
                        Intent retur=new Intent();
                        setResult(EcranPornire.RESULT_OK, retur);

                            finish();
                        }
                    }
                }.start();

            }

        });

dialog.show();

        Button byn=findViewById(R.id.button2);

        byn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.setIcon(R.drawable.ic_baseline_assignment_late_24);
                dialog.setMessage("acum am repetat avertismentul de "+i+" ori.");
                dialog.show();
                        i++;
                if(i>=6){
                dialog.dismiss();




                }


            }
        });









    }









}