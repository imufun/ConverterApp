package com.imufun.imran.converterapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends ActionBarActivity {

    private Spinner unittypeSpinner;
    private EditText amountofEdittext;

    TextView teaspoonTextView, tablespoonTextView, cupTextView, ounceTextView,
            pintTextView, quartTextView, gallonTextView, poundTextView,
            milliliterTextView, literTextView, milligramTextView, kilogramTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountofEdittext=(EditText)findViewById(R.id.conver_editText);


        //Fills the spinner with the unit options
        addItemsToUnitTypeSpinner();

         // Add listener to the Spinner
         addListenerToUnitTypeSpinner();


    }

    private void addItemsToUnitTypeSpinner() {

        unittypeSpinner=(Spinner)findViewById(R.id.Unit_type_spinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence>  unitypeAdapter=ArrayAdapter.createFromResource(this,R.array.conversion_types,android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        unitypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        // Apply the adapter to the spinner
        unittypeSpinner.setAdapter(unitypeAdapter);
    }

    private void addListenerToUnitTypeSpinner(){

    }


    public void initializeTextViews() {

        teaspoonTextView = (TextView) findViewById(R.id.tsp_text_view);
        tablespoonTextView = (TextView) findViewById(R.id.tbs_text_view);
        cupTextView = (TextView) findViewById(R.id.cup_text_view);
        ounceTextView = (TextView) findViewById(R.id.oz_text_view);
        pintTextView = (TextView) findViewById(R.id.pint_text_view);
        quartTextView = (TextView) findViewById(R.id.quart_text_view);
        gallonTextView = (TextView) findViewById(R.id.gallon_text_view);
        poundTextView = (TextView) findViewById(R.id.pound_text_view);
        milliliterTextView = (TextView) findViewById(R.id.ml_text_view);
        literTextView = (TextView) findViewById(R.id.liter_text_view);
        milligramTextView = (TextView) findViewById(R.id.mg_text_view);
        kilogramTextView = (TextView) findViewById(R.id.kg_text_view);

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
}
