package com.example.tsekk.quiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    String typ= new String();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final ArrayList<String> WCList = new ArrayList<String>();
        WCList.add("Brazil");
        WCList.add("Argentina");
        WCList.add("Italy");
        WCList.add("Germany");

        final ArrayList<String> CLList = new ArrayList<String>();
        CLList.add("Bayern Munich");
        CLList.add("AC Milan");
        CLList.add("FC Barcelona");
        CLList.add("Real Madrid");

        final ArrayList<String> LigaList = new ArrayList<String>();
        LigaList.add("Atletico Madrid");
        LigaList.add("FC Barcelona");
        LigaList.add("Real Madrid");
        LigaList.add("Valencia");

        final ArrayList<String> PLList = new ArrayList<String>();
        PLList.add("Manchester United");
        PLList.add("Liverpool");
        PLList.add("Arsenal");
        PLList.add("Chelsea");

        final ArrayList<String> SAList = new ArrayList<String>();
        SAList.add("Inter Milan");
        SAList.add("AC Milan");
        SAList.add("Juventus");
        SAList.add("AS Roma");

        Intent forwardintent = getIntent();
        String extra = forwardintent.getStringExtra("league");
        Toast.makeText(Main2Activity.this, extra, Toast.LENGTH_SHORT).show();

        if(extra.equals("World Cup")){
            final String[] WCList1 = {"Brazil","Argentina","Italy","Germany"};
            ListAdapter adapter = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, WCList1);
            ListView lv =(ListView)findViewById(R.id.lv);
            lv.setAdapter(adapter);

            lv.setOnItemClickListener(
                    new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View row, int index, long rowID) {
                            String word = parent.getItemAtPosition(index).toString();
                            String typ= new String();

                            if(index==0){
                                typ="Good Job, Correct Answer. You Scored 1 point";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                            if(word.equals(WCList1[1])){
                                typ="Wrong";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                            if(word.equals(WCList1[2])){
                                typ="Wrong";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                            if(word.equals(WCList1[3])){
                                typ="Wrong";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                           // myclick(typ);
                        }
                    });
        }

        if(extra.equals("Champions League")){
            ArrayAdapter<String> quiz_list = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, CLList);
            ListView list =(ListView)findViewById(R.id.lv);
            list.setAdapter(quiz_list);

            list.setOnItemClickListener(
                    new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View row, int index, long rowID) {
                            String word = parent.getItemAtPosition(index).toString();

                            if(word.equals(CLList.get(0))){
                                typ="Wrong";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                            if(word.equals(CLList.get(1))){
                                typ="Wrong";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                            if(word.equals(CLList.get(2))){
                                typ="Wrong";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                            if(word.equals(CLList.get(3))){
                                typ="Good Job, Correct Answer. You Scored 1 point";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                           // myclick(typ);
                        }
                    });
        }

        if(extra.equals("La Liga")){
            ArrayAdapter<String> quiz_list = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, LigaList);
            ListView lv =(ListView)findViewById(R.id.lv);
            lv.setAdapter(quiz_list);

            lv.setOnItemClickListener(
                    new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View row, int index, long rowID) {
                            String word = parent.getItemAtPosition(index).toString();

                            if(word.equals(LigaList.get(0))){
                                typ="Wrong";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                            if(word.equals(LigaList.get(1))){
                                typ="Wrong";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                            if(word.equals(LigaList.get(2))){
                                typ="Good Job, Correct Answer. You Scored 1 point";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                            if(word.equals(LigaList.get(3))){
                                typ="Wrong";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                           // myclick(typ);
                        }
                    });
        }

        if(extra.equals("English Premier League")){
            ArrayAdapter<String> quiz_list = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, PLList);
            ListView list =(ListView)findViewById(R.id.lv);
            list.setAdapter(quiz_list);

            list.setOnItemClickListener(
                    new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View row, int index, long rowID) {
                            String word = parent.getItemAtPosition(index).toString();

                            if(word.equals(PLList.get(0))){
                                typ="Good Job, Correct Answer. You Scored 1 point";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                            if(word.equals(PLList.get(1))){
                                typ="Wrong";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                            if(word.equals(PLList.get(2))){
                                typ="Wrong";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                            if(word.equals(PLList.get(3))){
                                typ="Wrong";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                           // myclick(typ);
                        }
                    });
        }

        if(extra.equals("Serie A")){
            ArrayAdapter<String> quiz_list = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, SAList);
            ListView list =(ListView)findViewById(R.id.lv);
            list.setAdapter(quiz_list);

            list.setOnItemClickListener(
                    new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View row, int index, long rowID) {
                            String word = parent.getItemAtPosition(index).toString();

                            if(word.equals(SAList.get(0))){
                                typ="Wrong";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                            if(word.equals(SAList.get(1))){
                                typ="Wrong";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                            if(word.equals(SAList.get(2))){
                                typ="Good Job, Correct Answer. You Scored 1 point";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                            if(word.equals(SAList.get(3))){
                                typ="Wrong";
                                Toast.makeText(Main2Activity.this, typ, Toast.LENGTH_SHORT).show();
                            }
                           // myclick(typ);

                        }
                    });
        }
//Returning the answer back to the calling activity
        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent();
                backIntent.putExtra("Answer", typ);
                setResult(Activity.RESULT_OK, backIntent);
                finish();
            }
        });
    }





}
