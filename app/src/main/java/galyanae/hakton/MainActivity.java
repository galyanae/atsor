package galyanae.hakton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button gasB;
    private Button breaks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        gasB=(Button)findViewById(R.id.gas_button);
        breaks=(Button)findViewById(R.id.breaks_buutton);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gasB.setOnClickListener(new onclick_gas());
    }


}
