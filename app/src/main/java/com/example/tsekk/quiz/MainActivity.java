package com.example.tsekk.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends Activity{

    private static final int REQ_CODE_ANS = 2468;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list =(ListView)findViewById(R.id.wordlist);

        final Intent forwardIntent = new Intent(this,Main2Activity.class);

        final ArrayList<String> MainList = new ArrayList<String>();
        MainList.add("World Cup");
        MainList.add("Champions League");
        MainList.add("La Liga");
        MainList.add("English Premier League");
        MainList.add("Serie A");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, MainList);
        list.setAdapter(adapter);

        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View row, int index, long rowID) {
                        forwardIntent.putExtra("league",MainList.get(index));
                        startActivityForResult(forwardIntent, REQ_CODE_ANS);
                    }
                });

    }

    //BackIntent returns control back here
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        switch(requestCode){
            case REQ_CODE_ANS:
                if(resultCode == Activity.RESULT_OK){
                    Toast.makeText(MainActivity.this, "We're back", Toast.LENGTH_SHORT).show();

                    String answer = intent.getStringExtra("Answer");
                    Toast.makeText(MainActivity.this, answer, Toast.LENGTH_SHORT).show();
                    if ( !answer.equals("wrong") ){
                        score = score + 1;
                    }
                    TextView tview = findViewById(R.id.textView4);
                    tview.setText(score);
                } else{
                    Log.i("MyApp","Activity Canceled");
                }
        }
    }
}
