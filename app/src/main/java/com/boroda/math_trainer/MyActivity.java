package com.boroda.math_trainer;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;


public class MyActivity extends Activity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button buttonClear;
    Button buttonCheck;
    Button buttonNextTask;
    TextView resultView;
    TextView taskView;
    TextView inputView;

    Task task;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        MathTrainer mathTrainer = new MathTrainer();

        initialyzeElements();


        task = generatSumTask();



    }

    private Task generatSumTask() {
        taskView.setText(task.first + " + " + task.second);
        return new Task(TaskType.SUM);
    }

    public Button.OnClickListener pressButton(final Button btn) {

        Button.OnClickListener oclBtn = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.append(btn.getText());
            }
        };
        return oclBtn;
    }


    private void initialyzeElements() {
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);
        buttonCheck = (Button) findViewById(R.id.buttonCheck);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonNextTask = (Button) findViewById(R.id.buttonNextTask);

        resultView = (TextView) findViewById(R.id.resultView);
        taskView = (TextView) findViewById(R.id.taskView);
        inputView = (TextView) findViewById(R.id.inputField);

        Button.OnClickListener oclBtnClear = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText("");
                resultView.setText("");
            }
        };
        Button.OnClickListener oclBtnCheck = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (inputView.getText().equals(task.result)) {
                    resultView.setText("Правильно, молодец!");
                } else {
                    resultView.setText("Неправильно");
                }

            }
        };
        Button.OnClickListener oclBtnNextTask = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                task=generatSumTask();
                inputView.setText("");
                resultView.setText("");
            }
        };

        button0.setOnClickListener(pressButton(button0));
        button1.setOnClickListener(pressButton(button1));
        button2.setOnClickListener(pressButton(button2));
        button3.setOnClickListener(pressButton(button3));
        button4.setOnClickListener(pressButton(button4));
        button5.setOnClickListener(pressButton(button5));
        button6.setOnClickListener(pressButton(button6));
        button7.setOnClickListener(pressButton(button7));
        button8.setOnClickListener(pressButton(button8));
        button9.setOnClickListener(pressButton(button9));
        buttonClear.setOnClickListener(oclBtnClear);
        buttonCheck.setOnClickListener(oclBtnCheck);
        buttonNextTask.setOnClickListener(oclBtnNextTask);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
