# QNSRadioGroup
自定义的一个RadioGroup,可以实现任意嵌套的RadioButton
#Screenshots 截图
<img src="/capture/screenshot0.png" />
#Usage 使用
*java代码中使用方式与`android.widget.RadioGroup`完全一致
`QNSRadioGroup radioGroup = (QNSRadioGroup) findViewById(R.id.qnsRadioGroup);
        radioGroup.setOnCheckedChangeListener(new QNSRadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(QNSRadioGroup group, @IdRes int checkedId) {
                Log.i("tag", checkedId + "is checked");
            }
        });
`
*在xml中你可以里面嵌套使用
`<top.qingningshe.qnsradiogroup.library.QNSRadioGroup
        android:id="@+id/qnsRadioGroup"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_centerHorizontal="true"
            android:layout_centerVertical="true">

            <RadioButton
                android:id="@+id/radioButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_alignParentLeft="true"
                android:layout_alignParentStart="true"
                android:layout_alignParentTop="true"
                android:checked="true"
                android:text="New RadioButton"/>

            <RadioButton
                android:id="@+id/radioButton2"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_alignParentEnd="true"
                android:layout_alignParentRight="true"
                android:layout_alignParentTop="true"
                android:layout_gravity="center_horizontal"
                android:text="New RadioButton"/>

            <RadioButton
                android:id="@+id/radioButton3"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_alignParentLeft="true"
                android:layout_alignParentStart="true"
                android:layout_below="@+id/radioButton"
                android:layout_gravity="center_horizontal"
                android:text="New RadioButton"/>

            <RadioButton
                android:id="@+id/radioButton4"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_alignParentEnd="true"
                android:layout_alignParentRight="true"
                android:layout_alignTop="@+id/radioButton3"
                android:text="New RadioButton"/>

            <RadioButton
                android:id="@+id/radioButton5"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_below="@+id/radioButton3"
                android:layout_centerHorizontal="true"
                android:text="New RadioButton"/>

            <RadioButton
                android:id="@+id/radioButton6"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_alignLeft="@+id/radioButton5"
                android:layout_alignStart="@+id/radioButton5"
                android:layout_below="@+id/radioButton5"
                android:text="New RadioButton"/>
        </RelativeLayout>
    </top.qingningshe.qnsradiogroup.library.QNSRadioGroup>
`
