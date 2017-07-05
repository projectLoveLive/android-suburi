package pink.nico.project.lovelive.suburi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class MasterDataUpdateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_data_update);

        Spinner spinner = (Spinner) findViewById(R.id.master_Update_Spinner);
    }
}
