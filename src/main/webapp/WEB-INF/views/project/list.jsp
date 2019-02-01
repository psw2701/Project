<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ include file="../include/header.jsp"%>

	<section class="content">
		<div class="row">
			<div class="col-sm-12">
			<div class="box">
				<div class="box-header with-border">
					<h3 class="box-title">Project List All</h3>	
				</div>
				
				<div class="box-body">
  <h2>Project Management</h2> 
    <div class="box-header with-border" >
					<a href="${pageContext.request.contextPath}/project/register">새프로젝트 등록</a>
			</div>         
  <table class="table">
    <thead>
      <tr>
        <th>프로젝트 이름</th>
        <th>시작날짜</th>
        <th>종료날짜</th>
        <th>프로젝트 진행 상태</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${list }" var="ProjectManagementVO">
      	<tr>		
      		<td><a href="${pageContext.request.contextPath}/project/read?no=${ProjectManagementVO.no}">${ProjectManagementVO.name }</a></td>
      		<td><fmt:formatDate value="${ProjectManagementVO.start_date}" pattern="yyyy-MM-dd"/></td>
      		<td><fmt:formatDate value="${ProjectManagementVO.end_date}" pattern="yyyy-MM-dd"/></td>
      		<td>${ProjectManagementVO.progress }</td>
      	             
      	</tr>
      
      </c:forEach>
    </tbody>
  </table>
  			</div>
			</div>
			</div>
		</div>
</section>
<%@ include file="../include/footer.jsp"%>
</body>
</html>