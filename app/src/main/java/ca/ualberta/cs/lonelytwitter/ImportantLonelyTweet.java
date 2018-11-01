package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text, Date date) {
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
		String string =  getTweetDate() + " | " + getTweetBody() ;
		Log.d("Important Tweet",string);
		return string;
	}

	public String getTweetBody() {
		return tweetBody;
	}
}