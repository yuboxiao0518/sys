<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div id="app">
  {{ message }}
</div>
<div id="app-2">
  <span v-bind:title="message">
    	鼠标悬停几秒钟查看此处动态绑定的提示信息！
  </span>
</div>
<div id="app-4">
  <ol>
    <li v-for="todo in todos">
      {{ todo.text }}
    </li>
  </ol>
</div>
<script type="text/javascript">
	var app3=new Vue({
		el:'#app-4',
		data:{
			todos:[
			  { text: '学习 JavaScript' },
		      { text: '学习 Vue' },
		      { text: '整个牛项目' }
			]
		}
	})
	var app = new Vue({
	  el: '#app',
	  data: {
	    message: 'Hello Vue!'
	  }
	})
	var app2 = new Vue({
		  el: '#app-2',
		  data: {
		    message: '页面加载于 ' + new Date().toLocaleString()
		  }
		})
</script>