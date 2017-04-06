package emirim0223.kr.hs.emirim.gridcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    EditText text1, text2;
    Button zero, one, two, three, four, five, six, seven, eight, nine, plus, minus, multiply, division;
    Button[] butNums = new Button[10];
    Button[] butOps = new Button[4];
   /* int[] ids = { R.id.zero, R.id.one, R.id.two, R.id.three, R.id.four, R.id.five, R.id.six, R.id.seven, R.id.eight, R.id.nine};*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*text1 = (EditText)findViewById(R.id.text1);
        text2 = (EditText)findViewById(R.id.text2);
        zero = (Button)findViewById(R.id.zero);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        multiply = (Button)findViewById(R.id.multiply);
        division = (Button)findViewById(R.id.division);*/

        for(int i = 0; i < butNums.length; i++){
           // butNums[i] = (Button)findViewById(ids[i]);
            butNums[i] = (Button)findViewById(R.id.one + i);
            butNums[i].setOnClickListener(butNumHandler);
        }

        for(int i = 0; i < butOps.length; i++){
            // butNums[i] = (Button)findViewById(ids[i]);
            butOps[i] = (Button)findViewById(R.id.one + i);
            butOps[i].setOnClickListener(butOpHandler);
        }

        View.OnClickListener butNumHandler = new View.OnClickListener(){

            @Override
            public void onClick(View view) {

            }
        };
        View.OnClickListener butOpHandler = new View.OnClickListener(){

            @Override
            public void onClick(View view) {

            }
        };
    }
}
