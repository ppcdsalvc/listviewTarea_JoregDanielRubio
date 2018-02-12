package com.example.jorge.listviewtarea_joregdanielrubio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btncalcular;
    SeekBar numeracion;
    ListView listresul;
    //ArrayList<String> listado;
    TextView textnumero;
    String [] list= new String[11];
    int num;
    int res;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncalcular=findViewById(R.id.button);
        numeracion=findViewById(R.id.seekBar);
        listresul=findViewById(R.id.lista);
        textnumero=findViewById(R.id.textView);




        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);

        numeracion.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                textnumero.setText(""+numeracion.getProgress());
                num=i;




            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    for(int i=0;i<=10;i++){

                     //  int n = Integer.valueOf(textnumero.getText().toString());
                        //listado.set(i, "" + numeracion + "X" + i + "=" + (n * i));
                      // listado.set(i, "\n");
                        res = num*i;
                        list[i]=""+num+"X"+i+"="+res;


                    }
                    listresul.setAdapter(adapter);
            }
        });




    }
}
