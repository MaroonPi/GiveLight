package light.give.givelightapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        String[] mobileArray = {getString(R.string.about1st),getString(R.string.about2nd),getString(R.string.about3rd),getString(R.string.about4th),
                getString(R.string.about5th),getString(R.string.about6th),getString(R.string.about7th),getString(R.string.about8th),getString(R.string.about9th),
                getString(R.string.about10th)};

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_item ,R.id.subcategory, mobileArray);

        ListView listView = (ListView) findViewById(R.id.activity_about);
        listView.setAdapter(adapter);

    }
}
