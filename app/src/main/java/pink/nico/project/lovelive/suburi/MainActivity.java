package pink.nico.project.lovelive.suburi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button masterDataUpdateButton = (Button) findViewById(R.id.masterDataUpdate);
        Button introduceButton = (Button) findViewById(R.id.introduce);
        masterDataUpdateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MasterDataUpdateActivity.class);
                startActivity(intent);
            }
        });
        introduceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, IntroduceActivity.class);
                startActivity(intent);
            }
        });
    }
}
