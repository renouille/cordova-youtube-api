# Cordova / Phonegap YouTube Android Player API #
Modified by [Renouille] - Original by remcob00

-- ALL CREDITS GOES TO remcob00 -- This version is modified to work with the Cordova CLI


## Installation ##
* Install through CLI:
```
cordova plugin install https://github.com/renouille/cordova-youtube-api
``` 
* Register your app and get a api key ([here the instructions from Google](https://developers.google.com/youtube/android/player/register))
* Place your api key in the YouTube.java file in com.remcob00.plugins.youtube at line 38

## How to use ##
* Add the following line to the head of your html file
```
<script type="text/javascript" charset="utf-8" src="youtube.js"></script>
```
* To view the video player use this code and add the YouTube video id:
```
window.plugins.youtube.show({
  videoid: "THE_VIDEO"},
  function() {},
  function() {}
);
```

## Coming soon ##
* Playlist support
* Auto playlist suppoty

## Release notes ##
### 29-12-12 ###
* First release by Remco Beugels (RemcoB00)

## License ##
Copyright (C) 2012 Remco Beugels

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
