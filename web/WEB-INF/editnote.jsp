<%-- 
    Document   : editnote
    Created on : 8-Oct-2020, 6:29:17 PM
    Author     : Oadfa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note jsp</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <form method="post" action="note">
            
            <h2>Edit Note</h2>
            <label>Title: </label><Input type="text" name="title"value=${title}><br>
            <label>Contents: </label><textarea name="Contents">${contents}</textarea><br>
                
            <input type="submit" value="Save">
            
            
        </form>
    </body>
</html>

