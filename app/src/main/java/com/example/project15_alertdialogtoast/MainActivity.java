package com.example.project15_alertdialogtoast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button2(View view) {
        setNormalAlertDialog();
    }

    public void button(View view) {
        Toast.makeText(getApplicationContext(), "Hello world", Toast.LENGTH_SHORT).show();
    }
    private void setNormalAlertDialog(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("對話框測試");
        alertDialog.setMessage("這是一個對話視窗");
        /*一樣，不熟的用這個打就OK了*/
        alertDialog.setPositiveButton("關閉視窗", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getBaseContext(),"關閉視窗", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialog.setNeutralButton("取消",(dialog, which) -> {
            setToast("取消");
        });
        alertDialog.setCancelable(false);
        alertDialog.show();
    }
    private void setToast(String input){
        Toast.makeText(getBaseContext(),input,Toast.LENGTH_SHORT).show();
    }
}