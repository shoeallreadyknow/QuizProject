package andriod.landaverdej.quiz_project;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class QuizProject extends Activity {
    private String answers;
    private String answers2;
    @Override

        protected void onCreate(Bundle icicle) {
            super.onCreate(icicle);

            setContentView(R.layout.activity_quiz_project);
            answers="true";
            answers2="false";
            Button button = (Button) findViewById(R.id.true_button);
            Button button2 = (Button) findViewById(R.id.false_button);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(answers == "true" ){
                        Toast toast = Toast.makeText(getApplicationContext(), "correct.", Toast.LENGTH_SHORT);
                    toast.show();
                    }

                }
            });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(answers2 == "false"){
                    Toast toast = Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.quiz_project, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
