<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css"/>
    <title></title>
</head>
<body>
<h1>Enter notebook specification</h1>
<form:form action="processForm" modelAttribute="notebook">
    Brand:
    <form:select path="brand">
        <form:option value="ACER" label="ACER"/>
        <form:option value="LENOVO" label="LENOVO"/>
        <form:option value="MSI" label="MSI"/>
        <form:option value="MACBOOK" label="MACBOOK"/>
        <form:option value="ASUS" label="ASUS"/>
    </form:select>
    <br>
    Ram:
    <form:select path="ram">
        <form:option value="4" label="4"/>
        <form:option value="8" label="8"/>
        <form:option value="12" label="12"/>
        <form:option value="16" label="16"/>
        <form:option value="20" label="20"/>
    </form:select>
    <br>
    Price: <form:input path="price"/>
    <br>

    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>