package imanurft.mopro.prak.utsima;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    ImageButton isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        isi = (ImageButton) findViewById(R.id.sportsImage); // Inisialisai ID pada Button
        isi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Digunakan untuk berpindah activity dari activity_main ke second_page
                startActivity(new Intent(Main2Activity.this, Main3Activity.class));
            }
        });
    }
}
