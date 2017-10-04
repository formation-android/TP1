package plus.competence.formation.premierapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView TextView1 ;
    Button Button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView1 = (TextView) findViewById(R.id.txt1);
        Button1 = (Button) findViewById(R.id.btn1);
        Button1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        TextView1.setText("Bonjour ESSARRAJ Fouad");
    }
}
