package stream;

public class Cricket {
	private int jerseyNo;
	private String playerName;
	private int playerScore;
	private String playerRoll;

	public Cricket(int jerseyNo, String playerName, int playerScore, String playerRoll) {

		this.jerseyNo = jerseyNo;
		this.playerName = playerName;
		this.playerScore = playerScore;
		this.playerRoll = playerRoll;
	}

	public String toString() {
		return "Cricket [jerseyNo=" + jerseyNo + ", playerName=" + playerName + ", playerScore=" + playerScore
				+ ", playerRoll=" + playerRoll + "]";
	}

	public int getJerseyNo() {
		return jerseyNo;
	}

	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	public String getPlayerRoll() {
		return playerRoll;
	}

	public void setPlayerRoll(String playerRoll) {
		this.playerRoll = playerRoll;
	}

}
