<%--
  Created by IntelliJ IDEA.
  User: Артем
  Date: 26.06.2019
  Time: 12:20
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
            margin: 5% 0 10 0;
        }
        h3{
            font-family: cursive; /* Семейство шрифта */
            color:#71d2d2; /* Цвет текста */
            text-align: left;
            margin: 1% 0 1% 10%;
        }
        form{
            display:inline-block;
            margin: 3% 1% 0 10%;}
        input{font-family: cursive;
            background-color:#157272;
            font-size:15px;
            height:30;
        }table{
             background:#c2f0f0;
             margin: 5% auto;
             font-family: cursive;
             width: 90%;
             height:60%;
             font-size:20px;
             color:#157272;
             text-align:center;
             font-
         }
        button{font-family: cursive;
            font-size:15px;
            height:30;
            background-color:#157272;
            margin: 0 0 0 10%;}
    </style>
</head>

<body>
<h1>Англо-русский словарь</h1>
<h3>Описание словаря</h3>
<form>
    <div class="search">
        <input type="search" name="q" value="Поиск по ключу">
        <input type="submit" value="Искать">
    </div>
</form>
<form>
    <div class="search">
        <input type="search" name="q" value="Поиск по значению">
        <input type="submit" value="Искать">
    </div>
</form>

<button type="button">+ Добавить</button>
<table>
    <tr>
        <td> Ключ </td>
        <td> Значение</td>
        <td> Изменения</td>
    </tr>
    <tr>
        <td> gthdfz </td>
        <td> cnjhfz</td>
        <td> nhtnmz</td>
    </tr>
</table>



</body>

</html>