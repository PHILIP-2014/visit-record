
require.config({
	paths: {
		jquery:'jquery.min',
		bootstrap:'bootstrap/bootstrap.min'
	}
});

require(['jquery', 'bootstrap', 'valid'], function($, bootstrap, valid){
	$('body').css('background-color', 'grey');
	console.log(valid.isEqual(1,1));
});


/*========================参考例子==========================*/
/*require.config({
	urlArgs: "v=20151016.1",
	baseUrl:CONTEXT_PATH,
	paths:{
		//基础JS库
//		jquery:"//cdn.bootcss.com/jquery/2.1.1/jquery.min",
		jquery:"js/jquery.min",
//		Bootstrap:"//cdn.bootcss.com/bootstrap/3.1.1/js/bootstrap.min",
		Bootstrap:"bootstrap/js/bootstrap.min",
		
		//各种插件
		
		//项目模块
		
		//项目自定义模块
		"Global":"js/app/globalConfig"
	},
	shim:{
		"bs3validator":{deps:["jquery"]},
		"bsvalidator":{deps:["jquery"]},
		"bsvalidator-locale":{deps:["bsvalidator"]},
		"Bootstrap":{deps:["jquery"]},
		"jqValidation":{
			deps:["jquery"]
		},
		"validator":{
			deps:["jquery"]
		},
		"datetimepicker":{
//			exports:"datetimepicker",
			deps:['jquery']
		},
		"dplocale":{
			deps:["jquery","datetimepicker"]
		},
		"typeahead":{deps:['jquery']},
		"tagsinput":{
//			exports:"tagsinput",
			deps:['jquery',"typeahead"]
		},
		"switch":{
//			exports:"switch",
			deps:['jquery']
		},
		"hogan": {exports: "Hogan"},
		"messenger":{
			exports:"messenger",
			deps:["jquery"]
		}
	}
});

require(["jquery", "Bootstrap", "messenger"],
	function(jQuery,  bootstrap,   messenger){
		
		Messenger.options = {
			extraClasses : 'messenger-fixed messenger-on-top',
			theme : 'block'
		};
		
		Date.prototype.format = function(format){
			
			var o = { 
			"M+" : this.getMonth()+1, //month 
			"d+" : this.getDate(), //day 
			"h+" : this.getHours(), //hour 
			"m+" : this.getMinutes(), //minute 
			"s+" : this.getSeconds(), //second 
			"q+" : Math.floor((this.getMonth()+3)/3), //quarter 
			"S" : this.getMilliseconds() //millisecond 
			} 

			if(/(y+)/.test(format)) { 
				format = format.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length)); 
			} 

			for(var k in o) { 
				if(new RegExp("("+ k +")").test(format)) { 
					format = format.replace(RegExp.$1, RegExp.$1.length==1 ? o[k] : ("00"+ o[k]).substr((""+ o[k]).length));
				} 
			}
			
			return format; 
			}
		
	}	
);*/
