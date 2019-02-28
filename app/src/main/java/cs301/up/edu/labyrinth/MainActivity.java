package cs301.up.edu.labyrinth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



/**
 * @author Spencer Nelson, Philip Robinson, Spencer Rose, Erik Torkelson
 * 2/21/19
 * This is the MainActivity class we will be using to test our game state "cloning" functionality
 */
public class MainActivity extends AppCompatActivity implements View.OnTouchListener {


    //instance variables for the button and edit text view
    Button runButton;
    EditText outputText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the button and edit text view
        runButton = findViewById(R.id.runButton);
        outputText = findViewById(R.id.outputText);

        //make this the listener for button presses
        runButton.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        //clear the edit text view each time you run
        outputText.setText(" ");
        //create an instance of our class that runs tests of all our actions and calls
        //the toString of our gamestates
        LabyrinthGameStateTest test = new LabyrinthGameStateTest();
        String output = test.getInfo();
        //print the output string of our test to the edit text view
        outputText.setText(""+output);
        return false;
    }
}
