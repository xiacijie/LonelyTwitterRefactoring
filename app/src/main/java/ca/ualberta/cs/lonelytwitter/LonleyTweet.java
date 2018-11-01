package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class LonleyTweet extends LonelyTweet {

	public LonleyTweet() {
	}

	public LonleyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody() ;
	}

	public String getTweetBody() {
		return tweetBody.toUpperCase();
	}
}