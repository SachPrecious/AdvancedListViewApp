package com.example.advancedlistview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {



    String title[]={"Donald Trump","Joe Biden","Lionel Messi","John Rawls","Neymar","Ronaldo","Ozil","Vladimir Putin","Queen Elizabeth","Rihanna","Selena Gomez","Messi","Salah","Sophia Loren","Kane","Taylor Swift"};
    String description[]={"0778855963","0718899665","0778855963","0718899665","0778855963","0718899665","0778855963","0718899665","0778855963","0718899665"};
    int images[]={R.drawable.kane,R.drawable.neymar,R.drawable.putin};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    class CustomeAdapter extends ArrayAdapter<String>{
        Context context;
        String[] title;

        CustomeAdapter(@NonNull Context context, String title[]) {
            super(context, R.layout.single_row_content,R.id.txtTitle,title);
        }
    }




}