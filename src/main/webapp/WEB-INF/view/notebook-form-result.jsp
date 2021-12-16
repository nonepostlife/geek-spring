<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css"/>
    <title></title>
</head>
<body>
<h1>Notebook added successfully</h1>
<p>Brand: ${notebook.brand}</p>
<p>Ram: ${notebook.ram}</p>
<p>Price: ${notebook.price}</p>
</body>
</html>