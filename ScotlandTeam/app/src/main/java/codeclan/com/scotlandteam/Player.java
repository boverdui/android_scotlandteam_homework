package codeclan.com.scotlandteam;

import java.io.Serializable;

/**
 * Created by bert on 20/03/2018.
 */

public class Player implements Serializable {

    private Integer number;
    private String name;
    private String playingPosition;
    private Integer caps;
    private Integer image;

    public Player(Integer number, String name, String playingPosition, Integer caps, Integer image) {
        this.number = number;
        this.name = name;
        this.playingPosition = playingPosition;
        this.caps = caps;
        this.image = image;
    }

    public Integer getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getPlayingPosition() {
        return this.playingPosition;
    }

    public Integer getCaps() {
        return this.caps;
    }

    public Integer getImage() {
        return this.image;
    }

}
