package com.blacklist.start.blacklist;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.activeandroid.query.Select;

import java.util.List;

import model.NumberList;
import model.User;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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



    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, StopListActivity.class);

        startActivity(intent);

    }

    public void onClick2(View view) {

        Intent intent = new Intent(MainActivity.this, AddNumberActivity.class);

        startActivity(intent);
    }

    public void saveToDb(View view) {
        NumberList Number = new NumberList();
        Number.number = "8888889900";
        Number.blockTimeType = 2;
        Number.save();
        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void selectFromDb(View view) {
        List Numbers = new Select().from(NumberList.class).execute();

        if (Numbers.size()!=0) {
            Toast.makeText(this, "name: " + Numbers.get(0) + " age: "
                    + Numbers.get(0), Toast.LENGTH_LONG).show();
        }
    }

}
