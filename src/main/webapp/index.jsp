<%-- 
    Document   : newjsp
    Created on : 2020/011/28, 17:42:00
    Author     : syumpei
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test</title>
    </head>
    <body>
            <br>
            <br>
        <h3>Hello World!</h3>
        <br>
        
        <form method = "GET" action="/mvn-webapp-firstweb/TestServlet">
        <hl>名前を入力してください</hl>
            <br>
            <input type="text" name="Name"/>
            <br>
            <input　type="submit" value="送信"/>
        </form>
            
</html>
