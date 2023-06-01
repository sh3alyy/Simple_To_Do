package sg.edu.rp.c346.id22025520.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etElement;
    Button btnAdd;
    Button btnClear;
    ListView lvTasks;


    ArrayList<String> alTasks = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etElement = findViewById(R.id.editText);
        btnAdd = findViewById(R.id.Button);
        btnClear = findViewById(R.id.Button1);
        lvTasks = findViewById(R.id.ListViewTasks);


        ArrayAdapter aaTasks = new ArrayAdapter(this, android.R.layout.simple_list_item_1, alTasks);
        lvTasks.setAdapter(aaTasks);

        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String colour = etElement.getText().toString();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String Tasks = etElement.getText().toString();
                alTasks.add(Tasks);
                aaTasks.notifyDataSetChanged();
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String colour = etElement.getText().toString();
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String Tasks = etElement.getText().toString();
                alTasks.remove(Tasks);
                aaTasks.notifyDataSetChanged();
            }
        });
    }
}
