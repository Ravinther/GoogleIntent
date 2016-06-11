package com.example.ux.googleintent.GoogleIntent;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.ux.googleintent.R;

/**
 * Created by Ravi on 6/10/2016.
 */
public class googleintent extends Activity {
    private EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.text1);
    }

    public void search(View view) {
        try {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            String form = editText1.getText().toString();
            intent.putExtra(SearchManager.QUERY, form);
            startActivity(intent);
        } catch (Exception e) {

        }
    }
}

