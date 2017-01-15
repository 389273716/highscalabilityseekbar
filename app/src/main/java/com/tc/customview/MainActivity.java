package com.tc.customview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.tc.library.NumTipSeekBar;


public class MainActivity extends AppCompatActivity {

    private Toast mToast;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seekbar);
        NumTipSeekBar seekbar1 = (NumTipSeekBar) findViewById(R.id.ntsb_seekbar1);
        NumTipSeekBar seekbar2 = (NumTipSeekBar) findViewById(R.id.ntsb_seekbar2);
        NumTipSeekBar seekbar3 = (NumTipSeekBar) findViewById(R.id.ntsb_seekbar3);
        if (seekbar1 != null) {
            seekbar1.setOnProgressChangeListener(new NumTipSeekBar.OnProgressChangeListener() {
                @Override
                public void onChange(int selectProgress) {
                    showToast(String.valueOf(selectProgress), 1000);
                }
            });
        }
        if (seekbar2 != null) {
            seekbar2.setOnProgressChangeListener(new NumTipSeekBar.OnProgressChangeListener() {
                @Override
                public void onChange(int selectProgress) {
                    showToast(String.valueOf(selectProgress), 1000);
                }
            });
        }
        if (seekbar3 != null) {
            seekbar3.setOnProgressChangeListener(new NumTipSeekBar.OnProgressChangeListener() {
                @Override
                public void onChange(int selectProgress) {
                    showToast(String.valueOf(selectProgress), 1000);
                }
            });
        }
    }

    /**
     * 显示Toast,页面中重复Toast不会重复实例化Toast对象
     *
     * @param str      String
     * @param duration 显示时间
     */
    public void showToast(String str, int duration) {
        if (mToast == null) {
            mToast = Toast.makeText(getApplicationContext(), str, duration);
        } else {
            mToast.setText(str);
            mToast.setDuration(duration);
        }
        mToast.show();
    }

}
