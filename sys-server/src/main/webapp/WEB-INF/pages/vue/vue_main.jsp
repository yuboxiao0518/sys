<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div id="app">
  {{ message }}
</div>
<script type="text/javascript">
	var app = new Vue({
	  el: '#app',
	  data: {
	    message: 'Hello Vue!'
	  }
	})
</script>