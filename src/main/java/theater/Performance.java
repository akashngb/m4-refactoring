package theater;

/**
 * Class representing a performance of a play..
 */
public class Performance {

    private String playID;
    private int audience;

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    public String getPlayID() {
        return playID;
    }

    public int getAudience() {
        return audience;
    }

    public void setPlayID(String playID) {
        this.playID = playID;
    }

    public void setAudience(int audience) {
        this.audience = audience;
    }
}
