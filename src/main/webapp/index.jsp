<%-- 
    Document   : index
    Created on : 29/11/2017, 11:01:30 AM
    Author     : fernando stiven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nueva Colmena</h1>
        <%
            if (request.getAttribute("resultado") != null) {
                Boolean resultado = (Boolean) request.getAttribute("resultado");
                if (resultado.booleanValue() == true) {
        %>
        <h2> se ha registrado de manera exitosa</h2>
        <%
        } else {
        %>     
        <h2> llene los campos correctamente </h2>
        <%
                }
            }
        %>


        <p>Ingrese la informacion solicitada</p>

        <form action="ControlMiel" method="post">
            <div class="form_settings">
                <p><span>fecha</span>
                    <input class="contact" type="text" name="fecha" value="" /></p>
                <p><span>recolector</span>
                    <input class="contact" type="text" name="recolector" value="" /></p>
                <p><span>idColmena</span>
                    <input class="contact" type="text" name="idColmena" value="" /></p>
                <p><span>KilosMiel</span>
                    <input class="contact" type="text" name="KilosMiel" value="" /></p>

                <p style="padding-top: 15px"><span>&nbsp;</span><input class="submit" type="submit" name="contact_submitted" value="submit" /></p>
            </div>

        </form>
        <h2><a href="ListarColmena"> Listar Procedencia de Colmenas </a></h2>
        <h2><a href="ColmenasGrandes"> Sumatoria de kilos de miel</a></h2>

    </body>
</html>
