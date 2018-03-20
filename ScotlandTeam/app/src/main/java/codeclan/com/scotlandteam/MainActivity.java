package codeclan.com.scotlandteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScotlandTeam scotlandTeam = new ScotlandTeam();
        ArrayList<Player> list = scotlandTeam.getList();

        ScotlandTeamAdapter playerAdapter = new ScotlandTeamAdapter(this, list);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(playerAdapter);

    }

    public void onListItemClick(View listItem){

        Player selectedPlayer = (Player) listItem.getTag();

        Intent intent = new Intent(this, PlayerActivity.class);
        intent.putExtra("player", selectedPlayer);

        Log.d("MainActivity", selectedPlayer.getName());

        startActivity(intent);

    }

}
