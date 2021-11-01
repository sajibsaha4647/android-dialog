package com.example.androidalog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private Button button;
    private AlertDialog alertDialog;
    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.clickdialog);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        alertDialogBuilder = new AlertDialog.Builder(this);

        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setTitle(R.string.app_title);

        alertDialogBuilder.setMessage(R.string.app_message);

        alertDialogBuilder.setIcon(R.drawable.ic_launcher_background);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
            }
        });


        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"you click no button",Toast.LENGTH_LONG).show();
            }
        });

        alertDialogBuilder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"you click cancel button",Toast.LENGTH_LONG).show();
            }
        });

        alertDialog  =  alertDialogBuilder.create();

        alertDialog.show();

    }
}