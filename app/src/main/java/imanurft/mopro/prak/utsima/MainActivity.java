package imanurft.mopro.prak.utsima;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = (EditText) findViewById(R.id.inuser);
        final EditText password = (EditText) findViewById(R.id.inpass);
        final Button login = (Button) findViewById(R.id.btnlgn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_name = username.getText().toString();
                String pass_ = password.getText().toString();
                if (user_name.equals("ima") && pass_.equals("ima")) {
                    Intent i =new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(i);
                } else {
                    counter --;
                    if (counter == 0) {
                        login.setEnabled(false);
                    }
                }
            }
        });
    }
}
