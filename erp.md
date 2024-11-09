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
### Prioridad 0
+ Como vendedor registrado en la plataforma, quiero vincular un medio de pago a un producto a la venta para brindar opciones a los usuarios en términos de financiación.
+ Como comprador,
quiero agregar productos al carrito de compras
para poder gestionar mis compras antes de realizar el pago.
+ Como comprador,
quiero poder filtrar productos por precio, categoría y disponibilidad,
para encontrar más fácilmente lo que estoy buscando.
+ Como comprador,
quiero poder recuperar mi contraseña si la olvido,
para poder acceder nuevamente a mi cuenta sin perder mi información.
+ Como vendedor,
quiero poder gestionar el inventario de mis productos,
para asegurarme de que la disponibilidad mostrada en la plataforma sea precisa.
+ Como administrador de la plataforma,
quiero poder realizar ABM los usuarios (compradores y vendedores),
para garantizar la seguridad y el buen uso de la plataforma.
+ Como comprador,
quiero poder ver la política de devoluciones claramente en la página de cada producto,
para estar informado antes de realizar una compra.
+ Como comprador,
quiero poder elegir entre diferentes opciones de envío (retiro en sucursal, puntos de retiro, a domicilio),
para ajustar el costo y el tiempo de entrega según mis necesidades.

### Prioridad 1
+ Como administrador de la plataforma,
quiero revisar y aprobar nuevos vendedores,
para garantizar que solo vendedores confiables puedan publicar productos.
+ Como comprador,
quiero poder dejar una reseña y calificación en los productos que he comprado,
para ayudar a otros compradores a tomar decisiones informadas.
+ Como comprador,
quiero poder solicitar una devolución de un producto dentro del plazo establecido,
para obtener un reembolso de mi dinero.
+ Como vendedor de la plataforma,
quiero poder crear promociones y descuentos,
para incentivar la compra de productos específicos o en momentos determinados.
+ Como vendedor,
quiero ver un resumen de mis ventas y productos más vendidos,
para entender el rendimiento de mi tienda y optimizar mi oferta de productos.
+ Como comprador,
quiero poder pagar con múltiples métodos de pago en una sola transacción,
para mayor flexibilidad al completar mis compras.
+ Como comprador,
quiero poder usar cupones de descuento en mis compras,
para obtener un precio reducido o beneficios especiales.
+Como comprador,
quiero poder guardar productos en una lista de deseos,
para poder comprarlos más adelante.
### Prioridad 2
+ Como comprador,
quiero recibir notificaciones con el codigo de seguimiento,
para estar al tanto de su progreso.
+ Como comprador,
quiero poder ver un historial de mis pedidos anteriores,
para revisar mis compras pasadas.

---
## Arquitectura de software

¿Será esta una aplicación web / de escritorio / móvil *(todas o algún otro tipo)*? ¿Se ajustaría a la arquitectura de software Cliente-Servidor? ¿Qué lenguajes de programación, frameworks, bases de datos,... se utilizarán para desarrollar e implementar el software?
 
El proyecto presentado se trata de una aplicación web, la cuál se ajusta a la arquitectura cliente-servidor. La aplicacion sera desarrollada con el lenguaje de programacion Java

Base de Datos: PostgreSQL
FrontEnd: HTML, CSS, Bootstrap, JavaScript/React.
BackEnd: Java/Spring.

---