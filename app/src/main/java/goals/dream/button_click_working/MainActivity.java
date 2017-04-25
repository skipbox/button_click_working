package goals.dream.button_click_working;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static goals.dream.button_click_working.R.id.b1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //button clicks------------------------------------------------------------------
    public void buttonOnClick(View view) {
        int the_id = view.getId();
        if (the_id == b1) {
            Toast.makeText(this, "but_1", Toast.LENGTH_SHORT).show();


        }
        if (the_id == R.id.b2) {
            Toast.makeText(this, "but_2_works", Toast.LENGTH_SHORT).show();
        }
        if (the_id == R.id.b3) {
            Toast.makeText(this, String.valueOf(the_id), Toast.LENGTH_SHORT).show();
        }
    }



}
