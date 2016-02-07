package com.example.jakob.scripture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScritpureActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "Your scripture was: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scritpure);
    }

    public void share(View v){
        Intent i = new Intent(this, display.class);
        TextView book    = (TextView)findViewById(R.id.bookValue);
        TextView chapter = (TextView)findViewById(R.id.chapterValue);
        TextView verse   = (TextView)findViewById(R.id.verseValue);
        String scripture = book.getText() + " " + chapter.getText() + ":"
                + verse.getText();
        i.putExtra(EXTRA_MESSAGE, scripture);
        startActivity(i);
    }
}
