package com.example.user.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int rnum,mnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText  et=findViewById(R.id.et);
        final RadioButton  rb1=findViewById(R.id.rb1);
        final RadioButton rb2=findViewById(R.id.rb2);
        final RadioButton rb3=findViewById(R.id.rb3);
        final Button btn=findViewById(R.id.btn);
        final TextView name = findViewById(R.id.name);
        final TextView win = findViewById(R.id.win);
        final TextView me=findViewById(R.id.me);
        final TextView ai=findViewById(R.id.ai);
        final RadioGroup rg=findViewById(R.id.rg);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name.setText(et.getText());

                rnum=(int)(Math.random()*3)+1;

                switch (rnum){
                    case 1:
                        ai.setText("剪刀");
                        break;
                    case 2:
                        ai.setText("石頭");
                        break;
                    case 3:
                        ai.setText("布");
                        break;
                }


                switch(rg.getCheckedRadioButtonId()){
                    case R.id.rb1:
                        me.setText("剪刀");
                        mnum=1;
                        break;
                    case R.id.rb2:
                        me.setText("石頭");
                        mnum=2;
                        break;
                    case R.id.rb3:
                        me.setText("布");
                        mnum=3;
                        break;
                }
                if(rnum==1){
                    if(mnum==1)
                        win.setText("平手");

                    else if(mnum==2)
                        win.setText("玩家");

                    else
                         win.setText("電腦");
                    }
                if(rnum==2){
                    if(mnum==2)
                        win.setText("平手");

                    else if(mnum==3)
                        win.setText("玩家");

                    else
                        win.setText("電腦");
                }
                if(rnum==3){
                    if(mnum==3)
                        win.setText("平手");

                    else if(mnum==1)
                        win.setText("玩家");

                    else
                        win.setText("電腦");
                }



            }
        });


    }
}
