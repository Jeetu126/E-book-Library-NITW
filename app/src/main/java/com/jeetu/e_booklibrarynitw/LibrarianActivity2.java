package com.jeetu.e_booklibrarynitw;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LibrarianActivity2 extends AppCompatActivity {

    String[] courses,branch,sem,sub;
    Button cBtn,bBtn,semBtn,subBtn;
    TextView cTextView,bTextView,semTextView,subTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_librarian2);

        cBtn = findViewById(R.id.course1);
        cTextView = findViewById(R.id.course);

        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create list of course
                courses = new String[]{"B.TECH","M.TECH","MCA","MSC"};
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(LibrarianActivity2.this);
                mBuilder.setTitle("Choose an course");
                mBuilder.setIcon(R.drawable.icon_foreground);
                mBuilder.setSingleChoiceItems(courses, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        cTextView.setText(courses[which]);
                        dialog.dismiss();
                    }
                });
                mBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                // show alert dialog
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        bBtn = findViewById(R.id.branch1);
        bTextView = findViewById(R.id.branch);

        bBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create list of course
                branch = new String[]{"CSE","ECE","EEE","Civil","Meta","BioTech","mathematics","chemical"};
                AlertDialog.Builder bBuilder = new AlertDialog.Builder(LibrarianActivity2.this);
                bBuilder.setTitle("Choose an Branch");
                bBuilder.setIcon(R.drawable.icon_foreground);
                bBuilder.setSingleChoiceItems(branch, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        bTextView.setText(branch[which]);
                        dialog.dismiss();
                    }
                });
                bBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                // show alert dialog
                AlertDialog bDialog = bBuilder.create();
                bDialog.show();
            }
        });

        semBtn = findViewById(R.id.semester1);
        semTextView = findViewById(R.id.semester);

        semBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create list of course
                sem = new String[]{"1","2","3","4","5","6","7","8"};
                AlertDialog.Builder semBuilder = new AlertDialog.Builder(LibrarianActivity2.this);
                semBuilder.setTitle("Choose an Semester");
                semBuilder.setIcon(R.drawable.icon_foreground);
                semBuilder.setSingleChoiceItems(sem, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        semTextView.setText(sem[which]);
                        dialog.dismiss();
                    }
                });
                semBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                // show alert dialog
                AlertDialog semDialog = semBuilder.create();
                semDialog.show();
            }
        });

        subBtn = findViewById(R.id.subject1);
        subTextView = findViewById(R.id.subject);

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create list of course
                sub = new String[]{"LICA","AP","MC","CMOS","CA","ADC"};
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(LibrarianActivity2.this);
                mBuilder.setTitle("Choose an Subject");
                mBuilder.setIcon(R.drawable.icon_foreground);
                mBuilder.setSingleChoiceItems(sub, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        subTextView.setText(sub[which]);
                        dialog.dismiss();
                    }
                });
                mBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                // show alert dialog
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
    }
}