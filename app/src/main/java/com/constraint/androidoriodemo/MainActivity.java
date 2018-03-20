package com.constraint.androidoriodemo;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Button btnOk;
    ArrayList<ModelClass> arrayList = new ArrayList<>();
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ModelClass model1 = new ModelClass();
        model1.setAge(10);
        model1.setName("Bhavik");
        arrayList.add(model1);

        ModelClass model2 = new ModelClass();
        model2.setAge(20);
        model2.setName("Ashish");
        arrayList.add(model2);

        ModelClass model3 = new ModelClass();
        model3.setAge(30);
        model3.setName("Nilesh");
        arrayList.add(model3);

        ModelClass model4 = new ModelClass();
        model4.setAge(40);
        model4.setName("Darshan");
        arrayList.add(model4);


        Integer[] numbers = {10, 2, 20, 44, 67, 1, 104, 54, 87, 64, 99, 13, 8};
        btnOk= (Button)findViewById(R.id.btnOk);
        btnOk.setOnClickListener(view -> {
                Toast.makeText(MainActivity.this,"Clicked on me : ",Toast.LENGTH_SHORT).show();
                Arrays.sort( numbers, (first, second) -> first.compareTo(second) );
                arrayList.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
                Log.e(" after soring "," soring array"+Arrays.toString(numbers) + " : "+arrayList.get(0).getName()+arrayList.get(0).getAge());});
    }

}
