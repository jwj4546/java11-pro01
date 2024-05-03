<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<c:set var="fpath" value="<%=request.getContextPath() %>" />
<hr>    
<footer>
	<div class="ft_wrap">
		<nav id="fnb">
			<ul>
				<li><a href="${hpath }/member/terms.jsp">회원약관</a></li>
				<li><a href="${hpath }/member/policy.jsp">개인정보처리방침</a></li>
			</ul>
		</nav>
		<div id="loc">
			<select name="sel" id="sel" onchange="locate()">
				<option value="">해당 관공서</option>
				<option value="https://www.haeundae.go.kr/index.do">해운대구청</option>
				<option value="https://www.bspolice.go.kr/haeundae/main.do">해운대경찰서</option>
				<option value="https://www.koreapost.go.kr/612/index.do">해운대우체국</option>
			</select>
		</div>
		<script>
		function locate(){
			var sel = document.getElementById("sel");
			if(sel.value!=""){
				window.open(sel.value);
			}
		}
		</script>
		<br><br>
		<div id="copyright">
			<p class="addr">(우)48095 부산광역시 해운대구 중동2로 7 해운대구 소개, 대표전화 : 051-743-4855</p>
			<p class="copy">COPYRIGHT(C) BUSAN HAEUNDAE INTRO. ALL RIGHTS RESERVED.</p>
		</div>
	</div> 
</footer>