<%-- 
    Document   : viewnote
    Created on : 8-Oct-2020, 6:28:42 PM
    Author     : Oadfa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note jsp</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1><br>
        <h2>View Note</h2>
        <label>Title: </label><p>${title}</p><br>
        <label>Contents: </label><p>${contents}</p><br>
        
        <a href="note?edit"Edit</a>
    </body>
</html>