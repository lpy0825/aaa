!function(a,u){var e=a[a._xmObjName||"xmLog"];if(!e||!e.defined){var t,o,r,n,i,s,c,m,f,p,d={},l={},g={},h=0,v=!0,w={sessionStorage:{set:function(e,t){if(window.sessionStorage)try{window.sessionStorage.setItem(e,t)}catch(e){}},get:function(e){return window.sessionStorage?window.sessionStorage.getItem(e):null},remove:function(e){window.sessionStorage&&window.sessionStorage.removeItem(e)}},localStorage:{set:function(e,t){if(window.localStorage)try{window.localStorage.setItem(e,t)}catch(e){}},get:function(e){return window.localStorage?window.localStorage.getItem(e):null},remove:function(e){window.localStorage&&window.localStorage.removeItem(e)}},cookie:{set:function(e,t,o){var r,n=o&&o.domain,i=o&&o.path||"/";return/ximalaya\.com$/.test(window.location.hostname)&&(n=".ximalaya.com"),o&&o.expires&&(r=new Date).setTime(r.getTime()+1e3*o.expires),document.cookie=e+"="+t+(n?"; domain="+n:"")+(i?"; path="+i:"")+(r?"; expires="+r.toGMTString():"")+(o&&o.secure?"; secure":""),document.cookie},get:function(e){return(e=RegExp("(^| )"+e+"=([^;]*)(;|$)").exec(document.cookie))?e[2]:null}},getData:function(e,t){try{return"string"==typeof t?this[t].get(e):this.cookie.get(e)||this.localStorage.get(e)||this.sessionStorage.get(e)}catch(e){}},setData:function(e,t,o){try{var r="string"==typeof o&&o||arguments[3];if(r)return void this[r].set(e,t,o);this.cookie.set(e,t,o)?this.localStorage.set(e,t):this.sessionStorage.set(e,t)}catch(e){}},clear:function(e,t){try{if(t)return void("cookie"==t?this.cookie.set(e,"",{expires:-1}):this[t].remove(e));this.cookie.set(e,"",{expires:-1}),this.sessionStorage.remove(e),this.localStorage.remove(e)}catch(e){}}},_={_getCache:function(){var e={};try{e=JSON.parse(decodeURIComponent(w.getData("_xmlog_cache","localStorage")))||{}}catch(e){}return e},_setCache:function(e){try{w.setData("_xmlog_cache",encodeURIComponent(JSON.stringify(e)),"localStorage")}catch(e){}},setItems:function(e){var t=[],o=this._getCache();for(var r in e){var n=e[r];o[n._key]=n,t.push(n._key)}return this._setCache(o),t},removeItems:function(e){var t=this._getCache();for(var o in e){delete t[e[o]]}this._setCache(t)},getItems:function(){var e=[],t=this._getCache();for(var o in t)e.push(t[o]);return e}},y=a.onerror;if(a.onerror=function(e,t,o,r,n){var i=e;n&&n.stack&&(i=N(n)),P(i,"Event")&&(i+=i.type?"--"+i.type+"--"+(i.target?i.target.tagName+"::"+i.target.src:""):""),y&&y.apply(a,arguments)},T.prototype.create=function(e){var t;if(!this.created)for("object"==typeof e&&this.set(e),this.created=new Date,this.trigger("create",this);t=this.argsList.shift();)j.apply(this,t)},T.prototype._assembleData=function(e){var t={events:[]};return t.events.push({_key:k("ca_"),props:e,ts:I()}),t},T.prototype.send=function(e,t){var o,r,n,i,a=this,s=this.props,c=E({uuid:a._xmLog.sid},s);switch(c=E(c,(r={br_userAgent:(o=A.env).ua,br_type:o.browser,br_viewSize:o.resolution,page_url:location.href,page_title:document.title,os:o.os,trackType:o.trackType},n=E(function(){var e,t,o,r,n,i,a=/(baidu|so|sogou|google|bing|sm)/,s={refr_source:"other",refr_medium:"",refr_term:"",refr_from:"",referer_url:""},c=document.referrer;((e=document.createElement("a")).href=c)&&(s.referer_url=e.href,o=e.hostname,t=e.search.slice(1),r=a.test(o),n=o.match(a),r&&(s.refr_source="search",s.refr_medium=n[1],t&&((i=t.match(/(?:^|&)(wd|q|query|keyword|word)=([^&]*)(?:&|$)/))&&(s.refr_term=decodeURIComponent(i[2])),(i=t.match(/(?:^|&)(from)=([^&]*)(?:&|$)/))&&(s.refr_from=decodeURIComponent(i[2])))));var u=A.env,m=u.os;if("android"==m||"ios"===m)switch(u.browser){case"iting":s.refr_source="internal",s.refr_medium="iting";break;case"weixin":s.refr_source="social",s.refr_medium="weixin";break;case"qq":s.refr_source="social",s.refr_medium="qq";break;case"sinaBlog":s.refr_source="social",s.refr_medium="sinaBlog";break;case"qqBlog":s.refr_source="social",s.refr_medium="qqBlog"}return s}(),r),E({x_xmly_traffic:L()},n))),"object"==typeof t&&("event"==e&&(t.srcPage=t.srcPage||s.item,t.srcPageId=t.srcPageId||s.itemId,g.module=t.srcModule||"",g.postion=t.srcPosition||""),c=E(c,t)),e){case"pageview":(c=E((i=w.sessionStorage,info={srcPage:i.get("srcPage")||"",srcPageId:i.get("srcPageId")||"",srcModule:i.get("srcModule")||"",srcPosition:i.get("srcPosition")||""},info),c)).serviceId="pageview",c.appName=c.appName||window.XMLOG_APPNAME||"event";break;case"event":c.appName=c.appName||window.XMLOG_APPNAME||"event";break;case"exception":break;case"timing":return void console.log(function(){var e=window.performance;if(e){var t=e.timing,o={};return o.loadPage=t.loadEventEnd-t.navigationStart,o.domReady=t.domComplete-t.responseEnd,o.redirect=t.redirectEnd-t.redirectStart,o.lookupDomain=t.domainLookupEnd-t.domainLookupStart,o.ttfb=t.responseStart-t.navigationStart,o.request=t.responseEnd-t.requestStart,o.loadEvent=t.loadEventEnd-t.loadEventStart,o.appcache=t.domainLookupStart-t.fetchStart,o.unloadEvent=t.unloadEventEnd-t.unloadEventStart,o.connect=t.connectEnd-t.connectStart,o}console.log("你的浏览器不支持 performance 接口")}());default:return}c=a._assembleData(c),!1!==a.trigger("send",c)&&function(e,t,o){if(e&&t)if(o)D(e,t);else{var r=u.createElement("img"),n=[];for(var i in t)t[i]&&n.push(i+"="+encodeURIComponent(t[i]));var a="img_"+ +new Date;(A[a]=r).onload=r.onerror=function(){A[a]=r=r.onload=r.onerror=null,delete A[a]},r.src=e+(e.indexOf("?")<0?"?":"&")+n.join("&")}}(a._xmLog.url,function(e,t){if(!e)return t;var o={};for(var r in t)null!==e[r]&&(o[e[r]||r]=t[r]);return o}(a.props.parameterMapping,c),!0)},T.prototype.set=function(e,t){if("string"==typeof e)this.props[e]=t,"item"==e&&(g.page=t),"itemId"==e&&(g.pageId=t);else if("object"==typeof e)for(var o in e)e.hasOwnProperty(o)&&this.set(o,e[o])},T.prototype.get=function(e,t){var o=this.props[e];return"function"==typeof t&&t(o),o},T.prototype.trigger=function(e){var t=C(arguments);return t[0]=this.name+"."+e,R.apply(this,t)},T.prototype.on=function(e,t){A.on(this.name+"."+e,t)},T.prototype.off=function(e,t){A.off(this.name+"."+e,t)},A.name="xmLog",A.sid=((t=w.cookie.get("_xmLog"))||(t=k(),w.cookie.set("_xmLog",t,{expires:864e5})),t),A.defined=!0,A.timestamp=I(),A.off=function(e,t,o){if(e){"string"==typeof e&&(o=t,t=e,e=A);try{if(e===A){var r=d[t];if(!r)return;for(var n=r.length;n--;)r[n]===o&&r.splice(n,1);return}e.removeEventListener?e.removeEventListener(t,o,!1):e.detachEvent&&e.detachEvent("on"+t,o)}catch(e){}}},A.on=W,A.trigger=R,A.getTracker=function(e){if("*"===(e=e||"default")){var t=[];for(var o in l)l.hasOwnProperty(o)&&t.push(l[o]);return t}return l[e]=l[e]||new T(e)},A.url=location.protocol+"//xdcs-collector."+(o=window.location.hostname,"dev"==window.XMLOG_ENV||"production"!=window.XMLOG_ENV&&(/test\.ximalaya\.com$/.test(o)||/^\d{0,4}\.\d{0,4}\.\d{0,4}\.\d{0,4}$/.test(o))?"test.":"")+"ximalaya.com/api/v1/statistics",A.env=(r=navigator.userAgent,n=a.screen,i={os:"",browser:"",ua:r,resolution:(n.width||0)+"x"+(n.height||0),trackType:"ontouchstart"in window?"H5":"web"},(c={isAndroid:(s=function(e){return function(){return e.test(r)}})(/android/i),isIOS:s(/(ipad|iphone|ipod)/i),isWindows:s(/window/i),isMac:s(/mac os x/i),isChrome:s(/webkit\W.*(chrome|chromium)\W/i),isFirefox:s(/mozilla.*\Wfirefox\W/i),isGecko:s(/mozilla(?!.*webkit).*\Wgecko\W/i),is360se:s(/360/i),isIE:function(){return"Microsoft Internet Explorer"===navigator.appName||!!s(/\bTrident\b/)()},isOpera:s(/opera.*\Wpresto\W|OPR/i),isSafari:s(/webkit\W(?!.*chrome).*safari\W/i),isMobile:s(/(iphone|ipod|((?:android)?.*?mobile)|blackberry|nokia)/i),isWebKit:s(/webkit\W/i),isIting:s(/iting/i),isWeixin:s(/micromessenger/i),isSinaWeibo:s(/weibo/i),isQQ:s(/qq/i),isQQWeibo:s(/tencentmicroblog/i)}).isMobile()?(i.device="mobile",c.isAndroid()&&(i.os="android"),c.isIOS()&&(i.os="Ios"),c.isIting()&&(i.browser="iting"),c.isWeixin()&&(i.browser="weixin"),c.isSinaWeibo()&&(i.browser="sinaBlog"),c.isQQ()&&(i.browser="qq"),c.isQQWeibo()&&(i.browser="qqBlog")):(i.device="pc",c.isWindows()&&(i.os="windows"),c.isMac()&&(i.os="mac"),c.isChrome()&&(i.browser="chrome"),c.isFirefox()&&(i.browser="firefox"),c.isIE()&&(i.browser="ie"),c.isOpera()&&(i.browser="opera"),c.isSafari()&&(i.browser="safari"),c.is360se()&&(i.browser="360")),i),A.on(document,"click",function(e){for(var t=(e=e||window.event).target||e.srcElement;t&&"xm"!=M(t,"xmlog-spy");)t=t.parentNode;"xm"==M(t,"xmlog-spy")&&(g.module=M(t,"xmlog-mod")||"",g.postion=M(t,"xmlog-pos")||"")}),w.cookie.set("trackType",A.env.trackType,{path:"/"}),m=A.url,f=_.getItems(),p={events:f},0<f.length&&D(m,p),function(){var e,t=document.referrer,o=O("utm_source").replace(/(^\s*)|(\s*$)/g,""),r={utm_source:"",utm_medium:"",utm_campaign:"",utm_content:"",utm_term:"",utm_from:""};if(t&&q(r,t),""!=o&&q(r),r.utm_source)for(var n in r)e=r[n]||"",r.hasOwnProperty(n)&&w.cookie.set(n,encodeURIComponent(e||""));w.cookie.set("x_xmly_traffic",encodeURIComponent(L()))}(),e){var b=e.q||[];for(var S in e.q=null,A)A.hasOwnProperty(S)&&(e[S]=A[S]);e.q={push:function(e){A.apply(A,e)}};for(var x=0;x<b.length;x++)A.apply(A,b[x])}a[a._xmObjName||"xmLog"]=A,W(a,"unload",function(e){var t=0,o=w.sessionStorage;for(var r in v=!1,g.page&&(o.set("srcPage",g.page||""),o.set("srcPageId",g.pageId||""),o.set("srcModule",g.module||""),o.set("srcPosition",g.postion||"")),l)if(l.hasOwnProperty(r)){var n=l[r];n.created&&(t+=n.trigger("unload"))}if(t||0<h)for(var i=new Date;new Date-i<300;);})}function k(e){return(e||"xm_")+ +new Date+"_"+(+new Date).toString(36)+Math.random().toString(36).substr(2,6)}function I(){return+new Date}function E(e,t,o){var r={};for(var n in e)e.hasOwnProperty(n)&&(r[n]=e[n]);for(var i in t)t.hasOwnProperty(i)&&("_"!=i[0]||o)&&(r[i]=t[i]);return r}function P(e,t){return Object.prototype.toString.call(e)==="[object "+(t||"Object")+"]"}function O(e,t){var o=t||window.location.search,r=new RegExp("(^|&)"+e+"=([^&]*)(&|$)","i"),n=o.substr(1).match(r);return null!=n?decodeURI(n[2]):""}function q(e,t){var o,r;for(var n in t&&((r=document.createElement("a")).href=t,o=r.search),e)e[n]=decodeURIComponent(O(n,o));e.utm_from=decodeURIComponent(O("from",o))}function L(){var e,t=["utm_source","utm_medium","utm_campaign","utm_content","utm_term","utm_from"];for(var o in t){if(e=t[o],val=decodeURIComponent(w.cookie.get(e)||""),0==o&&null==val)return"";t[o]=e+":"+(null==val?"":val)}return t[0]?t.join("&"):""}function C(e,t){var o=t||0;return Array.prototype.slice.call(e,o)}function M(e,t){try{return e.getAttribute(t)}catch(e){return""}}function W(e,t,o){if(e){"string"==typeof e&&(o=t,t=e,e=A);try{if(e===A)return d[t]=d[t]||[],void d[t].unshift(o);e.addEventListener?e.addEventListener(t,o,!1):e.attachEvent&&e.attachEvent("on"+t,o)}catch(e){}}}function R(e){var t=d[e];if(t){for(var o=C(arguments,1),r=0,n=t.length;n--;)t[n].apply(this,o)&&r++;return r}}function D(e,t,o){var r,n=!1,i=_.setItems(t.events);v&&(window.ActiveXObject?(r=new XDomainRequest,n=!0):r=new XMLHttpRequest,r.onreadystatechange=function(){2==r.readyState&&(h--,_.removeItems(i)),4==r.readyState&&200==r.status&&o&&o(responseText)},r.open("POST",e),r.withCredentials=!0,n?r.contentType="application/json":r.setRequestHeader("Content-Type","application/json"),r.send(JSON.stringify(t)),h++)}function N(e){var t=e.stack.replace(/\n/gi,"").split(/\bat\b/).slice(0,9).join("@").replace(/\?[^:]+/gi,""),o=e.toString();return t.indexOf(o)<0&&(t=o+"@"+t),t}function T(e){this.name=e,this.props={_parameterMapping:null,_url:A.url},this.argsList=[],this._xmLog=A}function j(e){if(this.created||/^(on|off|set|get|create)$/.test(e)){var t=T.prototype[e],o=C(arguments,1);"function"==typeof t&&t.apply(this,o)}else this.argsList.push(arguments)}function A(){var r=C(arguments);String(r[0]).replace(/^(?:([\w$_]+)\.)?(\w+)$/,function(e,t,o){r[0]=o,j.apply(A.getTracker(t),r)})}}(window,document);