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
					<h3 class="box-title">Modify Project</h3>
				</div>
				<form action="modify" method="post">
				<div class="box-body">
					
					<div class="box-body">
					<div class="form-group">
						<label>프로젝트 이름</label>
						<input type="text" name="name" class="form-control" placeholder="Enter Title" value="${ProjectManagementVO.name }">
					</div>
					<div class="form-group">
						<label>프로젝트 내용</label>
						<textarea rows="5" class="form-control" name="content" placeholder="Enter Content">${ProjectManagementVO.content }</textarea>
					</div>
					<div class="form-group">
						<label>시작날짜</label>
						<input type="text" name="start_date" id="datepickerStart" class="form-control" value="<fmt:formatDate value="${ProjectManagementVO.start_date}" pattern="yyyy-MM-dd"/>">
					</div>
					<div class="form-group">
						<label>종료날짜</label>
						<input type="text" name="end_date" id="datepickerEnd" class="form-control" placeholder="${ProjectManagementVO.end_date }" value="<fmt:formatDate value="${ProjectManagementVO.end_date}" pattern="yyyy-MM-dd"/>" >
					</div>
					<div class="form-group">
						<label>상태</label>
						 <select name="progress">
							<option value="준비" ${ProjectManagementVO.progress == '준비' ? 'selected' : ''}>준비</option>
							<option value="진행중" ${ProjectManagementVO.progress == '진행중' ? 'selected' : ''}>진행중</option>
							<option value="종료" ${ProjectManagementVO.progress == '종료' ? 'selected' : ''}>종료</option>
							<option value="보류" ${ProjectManagementVO.progress == '보류' ? 'selected' : ''}>보류</option>
						</select> 
						
					</div>
					</div>
					<div class="box-footer">
							<button type="submit" class="btn btn-warning" id="btnModify">Modify</button>
					</div>
					
				<input type="hidden" name="no" value="${ProjectManagementVO.no }">
					
				</div>
				</form>
			</div>
		</div>
	</div>
</section>

 <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepickerStart" ).datepicker();
    $( "#datepickerStart" ).datepicker("option", "dateFormat", "yy-mm-dd");
    $( "#datepickerStart" ).val('<fmt:formatDate value="${ProjectManagementVO.start_date}" pattern="yyyy-MM-dd"/>');
    $( "#datepickerEnd" ).datepicker();
    $( "#datepickerEnd" ).datepicker("option", "dateFormat", "yy-mm-dd");
    $( "#datepickerEnd" ).val('<fmt:formatDate value="${ProjectManagementVO.end_date}" pattern="yyyy-MM-dd"/>');
  } );
  </script>

<%@ include file="../include/footer.jsp"%>