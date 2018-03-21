package codeclan.com.scotlandteam;

import java.util.ArrayList;

/**
 * Created by bert on 20/03/2018.
 */

public class ScotlandTeam {

    private ArrayList<Player> list;

    public ScotlandTeam() {

        list = new ArrayList<Player>();

        list.add(new Player(1,"Gordon Reid", "Prop", 31, R.drawable.gordonreid));
        list.add(new Player(2,"Fraser Brown", "Hooker", 30, R.drawable.fraserbrown));
        list.add(new Player(3,"Willem Nel", "Prop", 21, R.drawable.willemnel));
        list.add(new Player(4,"Tim Swinson", "Lock", 35, R.drawable.timswinson));
        list.add(new Player(5,"Jonny Gray", "Lock", 42, R.drawable.jonnygray));
        list.add(new Player(6,"John Barclay", "Back row", 69, R.drawable.johnbarclay));
        list.add(new Player(7,"Hamish Watson", "Back row", 19, R.drawable.hamishwatson));
        list.add(new Player(8,"Ryan Wilson", "Back row", 36, R.drawable.ryanwilson));
        list.add(new Player(9, "Greig Laidlaw", "Scrum half", 62, R.drawable.greiglaidlaw));
        list.add(new Player(10,"Finn Russell", "Fly half", 36, R.drawable.finnrussel));
        list.add(new Player(11,"Sean Maitland", "Wing", 33, R.drawable.seanmaitland));
        list.add(new Player(12,"Nick Grigg", "Centre", 3, R.drawable.nickgrigg));
        list.add(new Player(13,"Huw Jones", "Centre", 15, R.drawable.huwjones));
        list.add(new Player(14,"Tommy Seymour", "Wing", 42, R.drawable.tommyseymour));
        list.add(new Player(15,"Stuart Hogg", "Full back", 59, R.drawable.stuarthogg));
        list.add(new Player(16,"Stuart McInally", "Hooker", 16, R.drawable.stuartmcinally));
        list.add(new Player(17,"Jamie Bhatti", "Prop", 7, R.drawable.jamiebhatti));
        list.add(new Player(18,"Zander Fagerson", "Prop", 15, R.drawable.zanderfagerson));
        list.add(new Player(19,"Richie Gray", "Lock", 64, R.drawable.richiegray));
        list.add(new Player(20,"David Denton", "Back row", 38, R.drawable.daviddenton));
        list.add(new Player(21,"Ali Price", "Scrum half", 15, R.drawable.aliprice));
        list.add(new Player(22,"Pete Horne", "Centre", 32, R.drawable.petehorne));
        list.add(new Player(23,"Blair Kinghorn", "Full back", 2, R.drawable.blairkinghorn));

    }

    public ArrayList<Player> getList() {
        return list;
    }

}

