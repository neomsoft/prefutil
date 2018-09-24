package io.github.neomsoft.application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.github.neomsoft.prefutil.PrefUtil;

public class MainActivity extends AppCompatActivity {

    private static final String PREF_ID = "prefId";
    private static final String PREF_SELECTED_LIST = "simple";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PrefUtil prefUtil = new PrefUtil(this, PREF_ID);
        prefUtil.setBoolean(PREF_SELECTED_LIST, false);
    }
}
