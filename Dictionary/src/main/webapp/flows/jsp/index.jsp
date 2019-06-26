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

</head>

<body>

<h1>Выбор словаря</h1>

<form action="ChoiseDict" method="post">

    <p>

      <select>

        <option value="" disabled="" selected="">Выберите словарь</option>
          <option value="france" data-class="flag-france">Франция</option>
          <option value="brazil" data-class="flag-brazil">Бразилия</option>
          <option value="argentina" data-class="flag-argentina">Аргентина</option>
          <option value="south-africa" data-class="flag-safrica">Южная Африка</option>
       </select>
    </p>
    <p><input type="submit" value="Отправить"></p>

  </form>



</body>

</html>
