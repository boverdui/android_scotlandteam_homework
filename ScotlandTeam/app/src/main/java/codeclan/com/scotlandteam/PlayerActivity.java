package codeclan.com.scotlandteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        Intent intent = getIntent();
        Player selectedPlayer = (Player) intent.getSerializableExtra("player");
        Log.d("PlayerActivity", selectedPlayer.getName());
    }

}