# language: es
Característica: Leer dato de consola

Escenario: Leer vacío
Dado un valor vacío
Cuando el usuario presiona enter
Entonces retorno error 


Escenario: Leer dato
Dado un valor no vacío
Cuando el usuario presiona enter
Entonces retorno el valor obtenido como string 