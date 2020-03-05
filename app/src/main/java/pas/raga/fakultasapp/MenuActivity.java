package pas.raga.fakultasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MenuActivity extends AppCompatActivity {
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = findViewById(R.id.toolbarr);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("FAKULTAS");
        toolbar.setSubtitle("Dibawah Merupakan List Fakultas Yang Tersedia");

        cardView = findViewById(R.id.teknik);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, TeknikActivity.class));
                finish();
            }
        });
    }
}
