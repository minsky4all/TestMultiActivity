package lecture.mobile.minsky.testmultiactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import lecture.mobile.minsky.testmultiactivity.R;

/**
 * Created by minsky on 2016-04-27.
 */
public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        Button b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                finish();
                Intent intent = new Intent(Activity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
