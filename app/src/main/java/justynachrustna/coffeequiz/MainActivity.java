package justynachrustna.coffeequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioButton q1= (RadioButton) findViewById(R.id.q1);
        final RadioButton q2= (RadioButton) findViewById(R.id.q2);
        final RadioButton q3= (RadioButton) findViewById(R.id.q3);
        final RadioButton q4= (RadioButton) findViewById(R.id.q4);
        final RadioButton q5= (RadioButton) findViewById(R.id.q5);
        final RadioButton q6= (RadioButton) findViewById(R.id.q6);
        final RadioButton q7= (RadioButton) findViewById(R.id.q7);
        final RadioButton q8= (RadioButton) findViewById(R.id.q8);
        final RadioButton q9= (RadioButton) findViewById(R.id.q9);
        final RadioButton q10= (RadioButton) findViewById(R.id.q10);
        final CheckBox cb1= (CheckBox) findViewById(R.id.q11a);
        final CheckBox cb2= (CheckBox) findViewById(R.id.q11c);
        final CheckBox cb3= (CheckBox) findViewById(R.id.q11d);
        final EditText name= (EditText) findViewById(R.id.name);




        final Button end= (Button) findViewById(R.id.button);
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton[] rb={q1, q2, q3, q4, q5, q6, q7, q8, q9, q10};
                for (int i = 0; i < rb.length; i++) {
                    score=calculateScore(rb[i]);
                }
                if(cb1.isChecked()&cb2.isChecked()&cb3.isChecked()){
                    score=score+1;
                }

                String totalScore=String.valueOf(score);
                Toast.makeText(MainActivity.this, "Gratulacje " +name.getText()+ "! Twój wynik to: "+totalScore+ "/11", Toast.LENGTH_LONG).show();
                score=0;
                }
        });
    }

    public int calculateScore(RadioButton rb){
        if(rb.isChecked()){
            score=score+1;
        }
        return score;
    }

}
