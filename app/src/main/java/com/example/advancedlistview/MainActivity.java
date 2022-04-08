package com.example.advancedlistview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String title[]={"Trump","Biden","Messi","Rawls","Neymar","Ronaldo","Ozil","Putin","Queen","Rihanna","Selena","Salah","Sophia","Kane","Swift"};

    String description[]={"0778855963","0718899665","0778855963","0718899665","0778855963","0778855963","0778855963","0718899665","0778855963","0778855963","0718899665","0778855963","0718899665","0778855963","0718899665"};
    int images[]={ R.drawable.trump,R.drawable.biden,R.drawable.messi,R.drawable.johnrawls,R.drawable.neymar,R.drawable.ronaldo,R.drawable.ozil,R.drawable.putin,R.drawable.queen, R.drawable.rihanna,R.drawable.selenagomez,R.drawable.salah, R.drawable.sophialoren,R.drawable.kane,R.drawable.taylorswift};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView=findViewById(R.id.listView);
        CustomeAdapter adapter =new CustomeAdapter(this,title,images,description);
        listView.setAdapter(adapter);
    }


    class CustomeAdapter extends ArrayAdapter<String>{
        Context context;
        String[] title;
        int[] images;
        String[] des;

        CustomeAdapter(@NonNull Context context, String[] title,int[] images ,String[] des) {
            super(context, R.layout.single_row_content,R.id.txtTitle,title);
            this.context=context;
            this.images=images;
            this.title=title;
            this.des=des;
        }


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.single_row_content,parent,false);

            ImageView imageView=row.findViewById(R.id.imageView);
            TextView titleView=row.findViewById(R.id.txtTitle);
            TextView descriptionView=row.findViewById(R.id.txtDescription);

            imageView.setImageResource(images[position]);
            titleView.setText(title[position]);
            descriptionView.setText(des[position]);



            return super.getView(position, convertView, parent);


        }
    }




}