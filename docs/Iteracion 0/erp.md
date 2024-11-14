# Especificación de requisitos de software

## Enunciado del problema
La creciente demanda de productos ecológicos ha llevado a muchas empresas a buscar alternativas de venta en línea para satisfacer a un público cada vez más consciente del impacto ambiental. Sin embargo, gestionar esto de forma eficiente representa un desafío para negocios en expansión.
A medida que estas empresas intentan adaptarse a las plataformas digitales, se encuentran con varias complicaciones técnicas y operativas. Por ejemplo, la gestión de inventario en tiempo real puede volverse compleja, la sincronización constante es fundamental para evitar problemas como el desabastecimiento o las ventas duplicadas.
Además, el sistema debe considerar la variabilidad en los métodos de pago. La integración con múltiples pasarelas de pago es esencial para facilitar las transacciones y atraer a un público diverso. Por otro lado, uando se ofrecen promociones o descuentos, el sistema debe ser capaz de aplicar reglas específicas de manera consistente. La aplicación incorrecta de descuentos podría generar pérdidas o confusión entre los clientes, afectando la reputación de la tienda.

---

## Clientes potenciales

Los clientes que se beneficiaran con esta propuesta son:

- Usuarios de produtos ecologicos
- Empresas/emprendedores en el sector de productos ecologicos

---
## Solución propuesta 

La solución de software propuesta gestionará el inventario en tiempo real, sincronizando el stock de productos para reducir el riesgo de desabastecimiento y de ventas duplicadas. Además, se integrarán múltiples métodos de pago de forma segura, protegiendo los datos de los usuarios y garantizando transacciones sin inconvenientes. El sistema también aplicará descuentos y promociones de manera automatizada y precisa, respetando las reglas comerciales definidas y evitando errores que afecten los ingresos. Finalmente, la interfaz estará diseñada para ser intuitiva y rapida.

## Requisitos

### Administrador
+ Como Administrador del sistema, quiero crear las cuentas de usuarios Vendedores para mantener la seguridad de los Clientes evitando posibles estafas

+ Como Administrador, quiero crear las categorías de los productos ecológicos para mantener la organización de los productos.

+ Como Administrador, quiero registrar los medios de pagos para organizar las formas de pago de las ventas concretadas.

### Vendedor
+ Como Vendedor quiero publicar mis productos para ponerlos a la venta.

+ Como Vendedor, quiero gestionar el inventario de mis productos para tener un control de stock y precios.

### Comprador
+ Como Comprador, quiero registrarme en el sistema para poder comprar los productos en ventas.

+ Como Comprador, quiero consultar los productos en venta para comprarlo.

+ Como Comprador, quiero seleccionar productos para comprarlos.


---
## Arquitectura de software

¿Será esta una aplicación web / de escritorio / móvil (todas o algún otro tipo)? ¿Se ajustaría a la arquitectura de software Cliente-Servidor? ¿Qué lenguajes de programación, frameworks, bases de datos,... se utilizarán para desarrollar e implementar el software?
 
El proyecto presentado se trata de una aplicación web, la cuál se ajusta a la arquitectura cliente-servidor. La aplicacion sera desarrollada con el lenguaje de programacion Java

Base de Datos: PostgreSQL
FrontEnd: HTML, CSS, Bootstrap, JavaScript/React.
BackEnd: Java/Spring.

---