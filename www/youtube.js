/**
 * 
 * Cordova / Phonegap YouTube Embed API Plugin
 * Author: Renouille
 * Original: Remco Beugels (RemcoB00) 2012
 *
 */

var Youtube = function() {};
            
Youtube.prototype.show = function(content, success, fail) {
    return cordova.exec( function(args) {
        success(args);
    }, function(args) {
        fail(args);
    }, 'Youtube', '', [content]);
};

if(!window.plugins) {
    window.plugins = {};
}
if (!window.plugins.youtube) {
    window.plugins.youtube = new Youtube();
}
