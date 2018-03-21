package codeclan.com.scotlandteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayerActivity extends AppCompatActivity {

   TextView numberTextView;
   ImageView mugshotImageView;
   TextView nameTextView;
   TextView playingPositionTextView;
   TextView capsTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        Intent intent = getIntent();
        Player selectedPlayer = (Player) intent.getSerializableExtra("player");

        numberTextView = (TextView) findViewById(R.id.number_text_view);
        numberTextView.setText(selectedPlayer.getNumber().toString());

        mugshotImageView = (ImageView) findViewById(R.id.image_image_view);
        mugshotImageView.setImageResource(selectedPlayer.getImage());

        nameTextView = (TextView) findViewById(R.id.name_text_view);
        nameTextView.setText(selectedPlayer.getName());

        playingPositionTextView = (TextView) findViewById(R.id.playingPosition_text_view);
        playingPositionTextView.setText(selectedPlayer.getPlayingPosition());

        capsTextView = (TextView) findViewById(R.id.caps_text_view);
        capsTextView.setText(selectedPlayer.getCaps().toString() + " caps");

    }

}
