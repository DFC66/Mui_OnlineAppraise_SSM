document.write("<script type='text/javascript' src='../js/configurl.js'></script>");

mui.init();
mui.plusReady(function () {
window.addEventListener('show', function(event) {
	//此处初始化数据
     console.log(event.detail.userid);
     
	 
       plus.storage.setItem("userid",event.detail.userid);
     
	 
	getwholedata();
    






}, false);








var getwholedata = function() {
	//要访问的地址
	getm1();
	getm2();

}




window.onload = getwholedata();

function getm1(){
	var url = getport() + '/OnlineAppraise_war_exploded/message/m1';
		mui.ajax(url, {
			dataType: 'json', //服务器返回json格式数据
			type: 'post', //HTTP请求类型
			timeout: 10000, //超时时间设置为10秒；
			// headers:{'Content-Type':'application/json'},
			success: function(data) {
				// console.log(JSON.stringify(data));
				if (data != null) {
	
					var t1html = [];
	               
					for (let i = 0; i < data.length; i++) {
						t1html.push('<li id="'+data[i].id+'" class="mui-table-view-cell"><img id="imgurl" class="mui-media-object2 mui-pull-left" src="'+data[i].imageurl+'"><div class="mui-media-body2"><div  class="wenzi"><p id="major" class="mui-ellipsis">专业：' +data[i].mname + '</p><span id="course"> 课程名：' + data[i].cname +'</span><h4 id="cteacher" style="margin-top: 10px;">老师:' + data[i].tname + '</h4></div><div class="mypoint"><span>'+ data[i].wholeAppraise+'分</span></div></div></li>');
					
					
					}
					document.getElementById("table1").innerHTML = t1html;
	
	
	
				} else {
					alert("空值！");
				}
	
			},
			error: function(xhr, type, errorThrown) {
				alert(xhr.toString());
				console.log(type);
				console.log(errorThrown);
			}
		});
}


function getm2(){
	var url2 = getport() + '/OnlineAppraise_war_exploded/message/m2';
		mui.ajax(url2, {
			dataType: 'json', //服务器返回json格式数据
			type: 'post', //HTTP请求类型
			timeout: 10000, //超时时间设置为10秒；
			// headers:{'Content-Type':'application/json'},
			success: function(data) {
				// console.log(data[0].wholeAppraise);
				if (data != null) {
	
					// alert(data[1].mname);
					var t2html = [];
	              
					for (let i = 0; i < data.length; i++) {
						t2html.push('<li id="'+data[i].id+'" class="mui-table-view-cell"><img id="imgurl" class="mui-media-object2 mui-pull-left" src="'+data[i].Imageurl+'"><div class="mui-media-body2"><div  class="wenzi"><p id="major" class="mui-ellipsis">专业：' +data[i].mname + '</p><span id="course"> 课程名：' + data[i].cname +'</span><h4 id="cteacher" style="margin-top: 10px;">老师:' + data[i].tname + '</h4></div><div class="mypoint"><span>'+ data[i].wholeAppraise+'分</span></div></div></li>');
					}
					document.getElementById("table2").innerHTML = t2html;
	
	
	
				} else {
					alert("空值！");
				}
	
			},
			error: function(xhr, type, errorThrown) {
				alert(xhr.toString());
				console.log(type);
				console.log(errorThrown);
			}
		});
}


})
