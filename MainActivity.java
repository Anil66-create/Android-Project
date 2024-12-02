package com.example.layouts;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFrameLayout = findViewById(R.id.btnFrameLayout);
        Button btnTableLayout = findViewById(R.id.btnTableLayout);
        Button btnRelativeLayout = findViewById(R.id.btnRelativeLayout);

        FrameLayout frameLayout = findViewById(R.id.frameLayout);
        TableLayout tableLayout = findViewById(R.id.tableLayout);
        RelativeLayout relativeLayout = findViewById(R.id.relativeLayout);

        btnFrameLayout.setOnClickListener(view -> {
            frameLayout.setVisibility(View.VISIBLE);
            tableLayout.setVisibility(View.GONE);
            relativeLayout.setVisibility(View.GONE);
        });

        btnTableLayout.setOnClickListener(view -> {
            frameLayout.setVisibility(View.GONE);
            tableLayout.setVisibility(View.VISIBLE);
            relativeLayout.setVisibility(View.GONE);
        });

        btnRelativeLayout.setOnClickListener(view -> {
            frameLayout.setVisibility(View.GONE);
            tableLayout.setVisibility(View.GONE);
            relativeLayout.setVisibility(View.VISIBLE);
        });
    }
}
