<%-- 
    Document   : newjsp
    Created on : 2020/08/29, 23:29:00
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
        <hl>Test is Success</hl>
        <br>
        <br>
            Name : 
            ${testbeans.name}
            <br>
            <br>
            Message :
            ${testbeans.message}
            <br>
            <br>
            <a href="/Test/index.html"><font size="3">BACK</font></a>
    </body>
</html>
