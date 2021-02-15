package api;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.FacebookClient.AccessToken;
import com.restfb.Parameter;
import com.restfb.types.User;
import com.restfb.Version;

public class FBApi {

	public static void main(String[] args) {
		
		String acessToken = "EAAoZAyRkEms0BALy156RZBQpuM0U6DDwBghLN0ZCak7ZBvH4ECadTdyZBEmLh5wIT7kDBZBZCyus7vfJZCeOpbUQyoFE1VrnF3y8gznfuNRehFecOfg7mmjF1nlRIVVNpBU7I03Ax9Mw23f0pwrZAoaVHby737dltVbHSQd3iTbbKtZB0RKTGZCgZANhO3MumzZAj9mDZBZBoq7hgko2svmMuZCamkWU";
		
		FacebookClient client = new DefaultFacebookClient(acessToken,Version.LATEST);
		
		User me = client.fetchObject("me", User.class, Parameter.with("fields", "birthday,name,email"));
		
		System.out.println(me.getName());
		System.out.println(me.getBirthday());
		System.out.println(me.getEmail());
		
		String MY_APP_ID = "";
		String MY_APP_SECRET = "";
		AccessToken accessToken = new DefaultFacebookClient(Version.LATEST).obtainAppAccessToken(MY_APP_ID,MY_APP_SECRET);
		
		
	}

}
