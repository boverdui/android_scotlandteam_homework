package codeclan.com.scotlandteam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bert on 20/03/2018.
 */

public class ScotlandTeamAdapter extends ArrayAdapter<Player> {

    public ScotlandTeamAdapter(Context context, ArrayList<Player> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        Player currentPlayer = getItem(position);

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.player_item, parent, false);
        }

        TextView number = listItemView.findViewById(R.id.number);
        number.setText(currentPlayer.getNumber().toString());

        ImageView image = listItemView.findViewById(R.id.image);
        image.setImageResource(currentPlayer.getImage());

        TextView name = listItemView.findViewById(R.id.name);
        name.setText(currentPlayer.getName());

        TextView playingPosition = listItemView.findViewById(R.id.playingPosition);
        playingPosition.setText(currentPlayer.getPlayingPosition());

        TextView caps = listItemView.findViewById(R.id.caps);
        caps.setText(currentPlayer.getCaps().toString() + " caps");

        listItemView.setTag(currentPlayer);

        return listItemView;

    }

}
