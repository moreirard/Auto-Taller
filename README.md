# 🔧 AutoTaller — Sistema de Órdenes de Servicio

Un taller mecánico nos pide modelar el núcleo de su sistema de órdenes de servicio: el cálculo de la facturación según el cliente, y el proceso de finalización de una orden según el tipo de servicio realizado.

## 1. Órdenes de servicio

Cada orden de servicio tiene:

- la patente del vehículo;
- una política de facturación, asociada al cliente.

## 2. Tipos de servicio

El costo de mano de obra depende del tipo de servicio:

- **Cambio de Aceite:** cuesta $3000 de mano de obra. El número de orden tiene el formato «OS-ACE-\<n\>».
- **Revisión Técnica:** cuesta $5000 de mano de obra. El número de orden tiene el formato «OS-REV-\<n\>».
- **Service Completo:** cuesta $12000 de mano de obra. El número de orden tiene el formato «OS-COM-\<n\>». Además, al finalizar la orden se registra una garantía extendida de 6 meses, que ningún otro tipo de servicio ofrece.

ℹ️ El taller planea incorporar nuevos tipos de servicio en el futuro (por ejemplo, Alineación y Balanceo). El diseño debe permitir agregarlos sin modificar los tipos existentes.

## 3. Finalización de una orden

Toda orden, sin importar su tipo, se finaliza siguiendo siempre la misma secuencia de pasos:

1. Calcular el costo de mano de obra, según el tipo de servicio.
2. Aplicar la política de facturación del cliente sobre ese costo.
3. Generar el número de orden, según el tipo de servicio.
4. Confirmar la orden (y, si el tipo de servicio lo contempla, registrar algún beneficio adicional).

💡 El diseño debe reflejar que esta secuencia es siempre la misma para cualquier orden, aunque el costo de mano de obra y el formato del número de orden cambien según el tipo de servicio, y aunque algunos tipos de servicio agreguen un paso adicional que otros no tienen.

## 4. Políticas de facturación

- **Particular:** paga el costo de mano de obra sin modificaciones.
- **Flota** (empresa con varios vehículos a su nombre): obtiene un descuento del 15% sobre el costo de mano de obra.
- **Socio del club** (socio de un club de automovilistas asociado al taller): obtiene un descuento fijo de $1000 sobre el costo de mano de obra.

La política de facturación de un cliente puede cambiarse en cualquier momento — por ejemplo, si se asocia al club de automovilistas a mitad de año.

ℹ️ El taller planea incorporar nuevas políticas de facturación en el futuro (por ejemplo, para empleados del taller). El diseño debe permitir agregarlas sin modificar las políticas existentes.

## 5. Restricciones de diseño

- No se permite usar estructuras condicionales (if/switch) para decidir el costo final según la política de facturación del cliente.
- El proceso de finalización de una orden tiene una secuencia fija de pasos, en ese orden. El diseño debe impedir que un tipo de servicio la altere.
- El sistema debe quedar preparado para incorporar nuevos tipos de servicio y nuevas políticas de facturación sin modificar los existentes.
- Las responsabilidades deben estar correctamente distribuidas entre los objetos del sistema.

## 6. Tests

Crear tests, en formato Given-When-Then, que verifiquen:

- cada política de facturación aplica el descuento (o la ausencia de descuento) correcto sobre un costo de mano de obra dado;
- cada tipo de servicio, al finalizar una orden, calcula el costo de mano de obra correcto, genera un número de orden con el formato esperado, y deja la orden confirmada;
- Service Completo registra la garantía extendida al finalizar, y los demás tipos de servicio no la registran;
- la misma orden, facturada con distintas políticas, obtiene distintos costos finales.
