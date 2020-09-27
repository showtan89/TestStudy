<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- path : 자바스크립트와 CSS 위치 -->
<!-- 기본패키지명 spring.mvc.member_mybatis의 3번째명(member_mybatis)이 context name이 된다. 
     value = "/컨텍스트명/resources/ 
     src/main/webapp가 JSP의 루트가 된다.
-->
<c:set var="path" value="/a/resources/" />   
<script src="${path}script.js"></script>
<link type="text/css" rel="stylesheet" href="${path}style.css">
   