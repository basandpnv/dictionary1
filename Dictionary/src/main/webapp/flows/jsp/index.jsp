<%--
  Created by IntelliJ IDEA.
  User: Артем
  Date: 25.06.2019
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Словарь</title>
    <style type="text/css">

    body{
        background-color:#363030; }
    h1 {
        font-family: cursive; /* Семейство шрифта */
        color:#71d2d2; /* Цвет текста */
        text-align:center;
        margin: 7% 0 0 0;
    }
    form{
        display:inline-block;
        padding:30px;}
    select{
        text-align:center;
        background:#c2f0f0;
        width: 120%;
        padding: 7px;
        font-family: cursive;
        font-size:20px;
        color:#157272;}
    form{margin: 10% 39%;}
    input{
        margin:5% 40%;
        background-color:#157272;
    }
</style>

</head>
<h1>Выбор словаря</h1>
<body>
<form  action="dict.jsp"  method="post">
    <select class="select">
        <option value="" disabled="" selected="">Выберите словарь</option>
        <option value="english-russian" data-class="flag-france">Англо-русский</option>
        <option value="russian-germany" data-class="flag-brazil">Русско-немецкий</option>
        <option value="russian-grech" data-class="flag-argentina">Русско-чешский</option>
    </select>
    <p><input type="submit" value="Отправить"></p>

</form>



</body>

</html>

