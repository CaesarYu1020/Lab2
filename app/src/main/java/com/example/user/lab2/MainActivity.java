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
        mnum=-1;
        final EditText  et=findViewById(R.id.et);
        final Button btn=findViewById(R.id.btn);
        final TextView name = findViewById(R.id.name);
        final TextView win = findViewById(R.id.win);
        final TextView me=findViewById(R.id.me);
        final TextView ai=findViewById(R.id.ai);
        final RadioGroup rg=findViewById(R.id.rg);
        final TextView show=findViewById(R.id.show);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (rg.getCheckedRadioButtonId()) {

                    case R.id.rb1:
                        me.setText("剪刀");
                        mnum = 1;
                        break;
                    case R.id.rb2:
                        me.setText("石頭");
                        mnum = 2;
                        break;
                    case R.id.rb3:
                        me.setText("布");
                        mnum = 3;
                        break;
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {


                if (et.getText().toString().equals("")) {
                    show.setText("請選擇玩家名稱");
                }else if(mnum==-1){
                    show.setText("請選擇出拳的種類");
                }

                else{
                    rnum = (int) (Math.random() * 3) + 1;
                    name.setText(et.getText());
                    switch (rnum) {
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


                    if (rnum == 1) {

                        if (mnum == 1)
                        {
                            win.setText("平手");
                            show.setText("平局，再試一場吧");
                        }

                        else if (mnum == 2) {
                            win.setText(name.getText().toString());
                            show.setText("恭喜你獲勝了!!");
                        } else {
                            win.setText("電腦");
                            show.setText("可惜，電腦獲勝了");
                        }
                    }
                    if (rnum == 2) {

                        if (mnum == 2)
                        {
                            win.setText("平手");
                            show.setText("平局，再試一場吧");
                        }

                        else if (mnum == 3) {
                            win.setText(name.getText().toString());
                            show.setText("恭喜你獲勝了!!");
                        } else {
                            win.setText("電腦");
                            show.setText("可惜，電腦獲勝了");
                        }
                    }
                    if (rnum == 3) {
                        if (mnum == 3) {
                            win.setText("平手");
                            show.setText("平局，再試一場吧");
                        }
                        else if (mnum == 1) {
                            win.setText(name.getText().toString());
                            show.setText("恭喜你獲勝了!!");
                        } else {
                            win.setText("電腦");
                            show.setText("可惜，電腦獲勝了");
                        }
                    }
                }



            }
        });


    }
}
