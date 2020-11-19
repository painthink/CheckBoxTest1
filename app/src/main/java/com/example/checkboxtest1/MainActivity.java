package com.example.checkboxtest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        TextView textView_meat = findViewById(R.id.textView_meat);
        TextView textView_cheese = findViewById(R.id.textView_cheese);

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox_meat:
                if (checked)
                    // Put some meat on the sandwich
                    textView_meat.setText("meat checked");

                else
                    textView_meat.setText("No meat");// Remove the meat
                    break;
            case R.id.checkBox_cheese:
                if (checked)
                    // Cheese me
                    textView_cheese.setText("cheese checked");
                else
                    textView_cheese.setText("No cheese");// I'm lactose intolerant
                    break;
                // TODO: Veggie sandwich
        }
    }

}