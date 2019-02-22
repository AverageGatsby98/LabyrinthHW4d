package cs301.up.edu.labyrinthhw4d;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * @author Spencer Nelson, Philip Robinson, Spencer Rose, Erik Torkelson
 */
public class MainActivity extends AppCompatActivity implements View.OnTouchListener {


    Button runButton;
    EditText outputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        runButton = findViewById(R.id.runButton);
        outputText = findViewById(R.id.outputText);

        runButton.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        outputText.setText(" test ");
        return false;
    }
}
