<%-- 
    Document   : ListarColmena
    Created on : 30/11/2017, 12:49:49 AM
    Author     : fernando stiven
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="VO.Colmena"%>
<%@page import="VO.Colmena"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="wrapper">
            <section>
                <div class="container">
                    <div class="dynamicContent">
                        <!--content-->
                        <h1>Registro de Colmenas</h1>
                        <table>
                            <tr>
                                <td>UBICACION</td>
                                <td>FABRICA</td>
                                <td>ID_COLMENA_HIJA</td>
                                <td>ID_COLMENA</td>


                            </tr>
                            <%
                                if (request.getAttribute("lis") != null) {
                                    ArrayList<Colmena> em = (ArrayList<Colmena>) request.getAttribute("lis");

                                    if (em != null) {
                                        for (Colmena es : em) {

                            %>
                            <h1></h1>
                            <tr>  
                                <td><%=es.getUbicacionEspa()%></td>
                                <td><%=es.getFabrica()%></td>
                                <td><%=es.getColmenaHija()%></td>
                                <td><%=es.getColmena()%></td>

                            </tr>

                            <%

                                        }
                                    }
                                }
                            %>

                        </table>
                    </div>
                </div>
            </section>
        </div>
        <script type="text/javascript" src="js/bootstrap.js"></script>
        <script>
            $(".fancybox").fancybox({});
        </script>
        <h2><a href="index.jsp"> volver al menu</a></h2>

    </body>
</html>
