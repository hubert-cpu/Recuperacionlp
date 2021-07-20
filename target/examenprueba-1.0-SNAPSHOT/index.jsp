<%-- 
    Document   : index
    Created on : 19 jul. 2021, 16:58:37
    Author     : TOSHIBA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="recurso/css/bootstrap.min.css" />
    </head>
    <body>
         <div class="container">
        <section class="row">
          <section class="col-12">
            <section class="d-flex justify-content-center flex-column">
              <div class="bg-dark">
                <h1 class="text-white mx-2">Ventas</h1>
              </div>
              <form class=" d-flex flex-column border border-dark">
                <div class="m-2 p-1" id="sucursal"></div>
                <div class="m-2 p-1" id="cliente"></div>
                <input class="m-2 p-1" id="fecha" type="date" />
                <select class="m-2 p-1" name="documento" id="tipo">
                  <option value="0" disabled>Seleccion tipo de documento</option>
                  <option value="Boleta">Boleta</option>
                  <option value="Factura">Factura</option>
                </select>
                <button class="btn btn-primary w-25 mx-3 my-1" id="agregar">Agregar</button>
              </form>
            </section>
          </section>
        </section>
        <section class="row mt-4">
          <table class="table">
            <thead class="table-info">
              <tr>
                <th scope="col">#</th>
                <th scope="col">Sucursal</th>
                <th scope="col">Cliente</th>
                <th scope="col">Fecha</th>
                <th scope="col">Documento</th>
                <th scope="col">Accion</th>
              </tr>
            </thead>
            <tbody id="tbd">
              <tr></tr>
            </tbody>
          </table>
        </section>
      </div>
        <script src="recurso/Js/jquery.js"></script>
        <script src="recurso/Js/bootstrap.min.js"></script>
    </body>
</html>
