package com.example.android.udacityportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Portfolio extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void buttonClickHandler(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch ";
        CharSequence appName = "";
        int duration = Toast.LENGTH_SHORT;

        switch (view.getId()) {
            case R.id.spotify_button:
                appName = context.getText(R.string.streamer_name);
                break;
            case R.id.scores_button:
                appName = context.getText(R.string.scores_name);
                break;
            case R.id.library_button:
                appName = context.getText(R.string.library_name);
                break;
            case R.id.bigger_button:
                appName = context.getText(R.string.bigger_name);
                break;
            case R.id.xyz_button:
                appName = context.getText(R.string.xyz_name);
                break;
            case R.id.capstone_button:
                appName = context.getText(R.string.capstone_name);
                break;
        }

        text = TextUtils.concat(text,appName);

        Toast.makeText(context, text, duration).show();
    }

}
