/**
 * 
 * Cordova / Phonegap YouTube Embed API Plugin
 * Remco Beugels (RemcoB00) 2012
 * Modified by renouille 2014
 *
 */

package ch.renouille.youtube;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.content.Intent;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class Youtube extends CordovaPlugin {

	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
		PluginResult.Status status = PluginResult.Status.OK;
		JSONArray result = new JSONArray();
		
		try {
			JSONObject jo = args.getJSONObject(0);
			doSendIntent(jo.getString("videoid")); 
			callbackContext.sendPluginResult(new PluginResult(status, result));
		} catch (JSONException e) {
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.JSON_EXCEPTION));
        }
        return true;
	}
	
	private void doSendIntent(String videoid) {
		// API key instructions https://developers.google.com/youtube/android/player/register
		Intent youtubeIntent = YouTubeStandalonePlayer.createVideoIntent((Activity) this.cordova, "YOUR_API_KEY", videoid);
		this.cordova.startActivityForResult(this, youtubeIntent, 0);
	}

}
