<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 22/08/2019
  Time: 2:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="http://localhost:8080/Product_Discount_Calculator_war_exploded/display-discount" method = "post">
    Product Description: <input type="text" name = "description" placeholder="Product Description"/>
    </br>
    List Price: <input type="text" name = "price" placeholder="List Price:"/>
    <br/>
    Discount Percent: <input type="text" name = "discountPercent" placeholder="Discount Percent:"/>
    <br/>
    <input type="submit" value="Calculate Discount"/>
  </form>
  </body>
</html>
