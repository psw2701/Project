<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="../include/header.jsp"%>

<section class="content">
	<div class="row">
		<div class="col-sm-12">
			<div class="box">
				<div class="box-header with-border">
					<h3 class="box-title">Read Project</h3>
				</div>
				<div class="box-body">
					
					<div class="box-body">
					<div class="form-group">
						<label>프로젝트 이름</label>
						<input type="text" name="name" class="form-control" placeholder="Enter Title" value="${ProjectManagementVO.name }" readonly="readonly">
					</div>
					<div class="form-group">
						<label>프로젝트 내용</label>
						<textarea rows="5" class="form-control" name="content" placeholder="Enter Content"  readonly="readonly">${ProjectManagementVO.content }</textarea>
					</div>
					<div class="form-group">
						<label>시작날짜</label>
						<input type="text" name="start_date" class="form-control" placeholder="Enter Writer" value="<fmt:formatDate value="${ProjectManagementVO.start_date}" pattern="yyyy-MM-dd"/>" readonly="readonly">
					</div>
					<div class="form-group">
						<label>종료날짜</label>
						<%-- <fmt:parseDate value="${ProjectManagementVO.end_date}" var="end" pattern="yyyy-MM-dd"/>
					<fmt:formatDate var="viewEndDate" value="${end}" pattern="yyyy-MM-dd"/> --%>
					<input type="text" name="end_date" class="form-control" placeholder="Enter Title" value="<fmt:formatDate value="${ProjectManagementVO.end_date}" pattern="yyyy-MM-dd"/>" readonly="readonly">
					</div>
					<div class="form-group">
						<label>상태</label>
						<!-- <select>
							<option>준비</option>
							<option>진행중</option>
							<option>종료</option>
							<option>보류</option>
						</select> -->
						<input type="text" name="progress" class="form-control" placeholder="Enter Title" value="${ProjectManagementVO.progress }" readonly="readonly">
					</div>
					</div>
					<div class="box-footer">
						<button type="submit" class="btn btn-primary" id="btnList">GO List</button>
						<button type="submit" class="btn btn-warning" id="btnModify">Modify</button>
						<button type="submit" class="btn btn-danger" id="btnRemove">Remove</button>
					</div>
					
					<form id="f1" action="" method="post">
						<input type="hidden" name="no" value="${ProjectManagementVO.no }">
					</form>
					
				</div>
			</div>
		</div>
	</div>
</section>
<script>   
	
	$(function() {
		$("#btnList").click(function() {
			location.href = "${pageContext.request.contextPath}/project/list";

		})
		$("#btnRemove").click(function() {
			//#f1(form)를 submit 보냄
			if(confirm("정말로 삭제하시겠습니까?")){
				$("#f1").attr("action", "remove");
				$("#f1").submit();
			}
			

		})
		$("#btnModify").click(function() {
			$("#f1").attr("action", "modify");
			$("#f1").attr("method", "get");
			$("#f1").submit();
			location.href = "${pageContext.request.contextPath}/project/modify?no=${ProjectManagementVO.no}";
		})
	})
</script>
<%@ include file="../include/footer.jsp"%>