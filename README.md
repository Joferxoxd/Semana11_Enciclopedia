Enciclopedia de Enemigos – Semana 11

Objetivo academico
Se implementa un sistema de enciclopedia que registra cada enemigo vencido por el jugador utiliza listas dinamicas para almacenar objetos personalizados (RegistroEnemigo) y procesar estadisticas. Esto permite activar logros y mostrar progreso del jugador.

Descripcion del aplicativo
Este proyecto simula un sistema de seguimiento de enemigos derrotados cada vez que el jugador vence a un enemigo se registra su tipo y variante en una lista si el enemigo ya ha sido registrado se actualiza el contador cuando se alcanza una meta de derrotas se activa un logro.

Archivos incluidos
src/app/RegistroEnemigo.java
src/app/Enciclopedia.java
src/app/Main.java
README.md
Semana11_Enciclopedia.jar

Modo de uso
Escribir "atacar" para vencer un enemigo aleatorio.
Escribir "enciclopedia" para ver el registro de enemigos vencidos.
Escribir "salir" para cerrar el programa.

Justificacion
Se utilizan listas dinamicas (ArrayList) para manejar enemigos vencidos y procesar estadisticas esto permite agregar, recorrer y actualizar objetos personalizados (RegistroEnemigo) de forma flexible el sistema de logros se activa al cumplir metas de derrotas.

Ejemplo de ejecucion

Enciclopedia de enemigos:
Melee - Espada: 3 derrotados
Ranger - Arco: 1 derrotados
Mage - Fuego: 1 derrotados
Logro desbloqueado: Derrota 3 enemigos tipo Espada

Futuras integraciones
Este sistema sera integrado al proyecto principal se conectara con la logica de combate para registrar automaticamente cada enemigo vencido y mostrar estadisticas.

Autor
Nombre: joferxoxd 
Curso: Programación Orientada a Objetos 
Semana: 11
