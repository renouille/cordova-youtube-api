/**
 * 
 * Cordova / Phonegap YouTube Embed API Plugin
 * Remco Beugels (RemcoB00) 2012
 * Modified by renouille 2014
 *
 */

package ch.renouille.youtube;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class Youtube extends CordovaPlugin {

	@Override
	public PluginResult execute(String action, JSONArray args, String callbackId) {
		try {
			JSONObject jo = args.getJSONObject(0);
			doSendIntent(jo.getString("videoid")); 
			return new PluginResult(PluginResult.Status.OK);
		} catch (JSONException e) {
			return new PluginResult(PluginResult.Status.JSON_EXCEPTION);
		}
	}
	
	private void doSendIntent(String videoid) {
		// API key instructions https://developers.google.com/youtube/android/player/register
		Intent youtubeIntent = YouTubeStandalonePlayer.createVideoIntent((Activity) this.cordova, "YOUR_API_KEY", videoid);
		this.cordova.startActivityForResult(this, youtubeIntent, 0);
	}

}
