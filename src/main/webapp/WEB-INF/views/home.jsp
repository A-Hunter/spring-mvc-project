<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>HOME</title>
    <link rel="stylesheet" href="<spring:url value="/resources/css/app.css"/>" type="text/css"/>
</head>

<body>
    <h1>Hello world !</h1>
    <p>The time on the server is ${serverTime}.</p>
</body>
</html>