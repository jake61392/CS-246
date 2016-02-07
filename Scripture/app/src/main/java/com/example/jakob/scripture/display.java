package com.example.jakob.scripture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = getIntent();
        String scripture = i.getStringExtra(ScritpureActivity.EXTRA_MESSAGE);
        TextView text = new TextView(this);
        text.setText(scripture);
        text.setTextSize(40);
        setContentView(text);
    }
}
