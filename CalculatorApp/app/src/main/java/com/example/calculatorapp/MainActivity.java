package com.example.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String str = "";
    Character op = 'q';
    float num,numtemp;
    TextView showresult;

    Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,Multiply,div,equal,clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero=(Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);

        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.sub);
        div = (Button) findViewById(R.id.div);
        Multiply = (Button) findViewById(R.id.multiply);

        equal = (Button) findViewById(R.id.equal);
        clear = (Button) findViewById(R.id.Clear);

        showresult = (TextView) findViewById(R.id.result_id);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                insert(1);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                insert(2);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                insert(3);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                insert(4);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                insert(5);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                insert(6);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                insert(7);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                insert(8);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                insert(9);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                insert(0);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perform();
                op='/';
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perform();
                op='-';
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perform();
                op='+';
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perform();
                op='*';
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });


        }

    private void reset(){

        str = "";
        op = 'q';
        num=0;
        numtemp = 0;
        showresult.setText("");
    }
    private void insert(int i){
        str =str+Integer.toString(i);
        num=Integer.valueOf(str).intValue();
        showresult.setText(str);
    }

    private void perform(){
        str = "";
        numtemp = num;
    }

    private void  calculate(){
        if (op == '+'){
            num=numtemp+num;
          }
        else if (op == '-'){
            num = numtemp - num;
        }
        else if (op == '*'){

            num = numtemp * num;
        }
        else if (op == '/'){
            num=numtemp/num;
        }

        showresult.setText(""+num);






    }
}