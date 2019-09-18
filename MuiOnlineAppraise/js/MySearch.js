			 // 语音识别完成事件
			document.getElementById("search").addEventListener('recognized', function(e) {
				
				
				console.log(e.detail.value);
			});
			
			var nativeWebview, imm, InputMethodManager;
			var initNativeObjects = function() {
				if (mui.os.android) {
					var main = plus.android.runtimeMainActivity();
					var Context = plus.android.importClass("android.content.Context");
					InputMethodManager = plus.android.importClass("android.view.inputmethod.InputMethodManager");
					imm = main.getSystemService(Context.INPUT_METHOD_SERVICE);
				} else {
					nativeWebview = plus.webview.currentWebview().nativeInstanceObject();
				}
			};
			var showSoftInput = function() {
				if (mui.os.android) {
					imm.toggleSoftInput(0, InputMethodManager.SHOW_FORCED);
				} else {
					nativeWebview.plusCallMethod({
						"setKeyboardDisplayRequiresUserAction": false
					});
				}
				setTimeout(function() {
					var inputElem = document.querySelector('input');
					inputElem.focus();
					inputElem.parentNode.classList.add('mui-active'); //第一个是search，加上激活样式
				}, 200);
			};
			mui.plusReady(function() {
				initNativeObjects();
				showSoftInput();
			});
			
