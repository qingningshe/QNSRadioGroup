package top.qingningshe.qnsradiogroup;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import top.qingningshe.qnsradiogroup.library.QNSRadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        QNSRadioGroup radioGroup = (QNSRadioGroup) findViewById(R.id.qnsRadioGroup);
        radioGroup.setOnCheckedChangeListener(new QNSRadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(QNSRadioGroup group, @IdRes int checkedId) {
                Log.i("tag", checkedId + " is checked");
            }
        });
    }
}
