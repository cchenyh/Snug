package com.example.snugalpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button renwuliebiao;
    private Button quanbulvcheng;
    private Button shujufensxi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        renwuliebiao = findViewById(R.id.renwuliebiao);
        renwuliebiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TaskListActivity.class);
                startActivity(intent);
            }
        });

        quanbulvcheng = findViewById(R.id.quanbulvcheng);
        quanbulvcheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AllTripActivity.class);
                startActivity(intent);
            }
        });

        shujufensxi= findViewById(R.id.shujufenxi);
        shujufensxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ConclusionActivity.class);
                startActivity(intent);
            }
        });

    }
}
