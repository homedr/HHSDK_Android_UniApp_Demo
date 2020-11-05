! function(root, factory) {
	if (typeof exports == 'object' && typeof module != 'undefined') {
		module.exports = factory()
	} else if (typeof define == 'function' && define.amd) {
		define(factory)
	} else {
		// 5+ 兼容
		document.addEventListener('plusready', function(){
		// 修改此处为插件命名
		var moduleName = 'plugintest';
		// 挂载在plus下
		root.plus[moduleName] = factory()
		},false);
	}
}(this, function() {
	
	var _BARCODE = 'plugintest';
	var plugintest = {
		
		PluginTestFunction: function(MethodName,UserToken) {
			
			var success = null,
				fail = null;
				
			var callbackID = plus.bridge.callbackId(success, fail);

			return plus.bridge.exec(_BARCODE, "PluginTestFunction", [callbackID, MethodName,UserToken]);
		},
		
		
	};
	return plugintest;
});
