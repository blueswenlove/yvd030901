package com.example.yvtc.yvd030901;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    CheckBox chk[] = new CheckBox[3];
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk[0] = (CheckBox) findViewById(R.id.checkBox1);
        chk[1] = (CheckBox) findViewById(R.id.checkBox2);
        chk[2] = (CheckBox) findViewById(R.id.checkBox3);
        rg = (RadioGroup) findViewById(R.id.radiogroup);

        for (CheckBox c : chk) {
            c.setOnCheckedChangeListener(this);
        }
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId)
                {
                    case R.id.radioButton:
                        Log.d("RDO","111");
                        break;
                    case R.id.radioButton2:
                        Log.d("RDO2","2222");
                        break;
                    case R.id.radioButton3:
                        Log.d("RDO3","333333");
                        break;
                }
            }
        });
    }
    public void  click1(View v)
        {
            if (chk[0].isChecked())
            {
                Log.d("chk","chk1_checked") ;
            }
            else
            {
                Log.d("chk","chk1_checked_NO") ;
            }
        }
            @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                switch (buttonView.getId())
                {
                    case R.id.checkBox1 :
                        Log.d("chk","chk1_checked有打勾") ;
                        break;
                    case R.id.checkBox2 :
                        Log.d("chk","chk2_checked有打勾") ;
                        break;
                    case R.id.checkBox3 :
                        Log.d("chk","chk3_checked有打勾") ;
                        break;
                }
            }
}


