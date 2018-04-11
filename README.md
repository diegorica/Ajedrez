# Ajedrez

**Nombre del Grupo**: International 

**Título del Proyecto**: chess (ajedrez)

**Introducción y descripción del juego**
 
El ajedrez es un antiguo juego de estrategia, en el que dos jugadores se enfrentan entre sí, compuesto por piezas con cualidades diferentes y específicas, en un campo de batalla o tablero de ajedrez, una cuadrícula cuadrada que consta de 64 cuadrados o casas, 32 blancas y 32 negras . El objetivo del juego es mover las piezas para traer al rey oponente en la condición de no poder hacer ningún movimiento válido ("jaque mate"). Este manual ilustrará las piezas de ajedrez básicas y las reglas básicas de táctica y estrategia, y luego abordará los temas más complejos de aperturas / defensas, el juego intermedio y el partido final.
 Objetivos del proyecto
El objetivo del sistema implementado no es desafiar a un oponente humano, pero un sistema que implementa el tablero de ajedrez del juego, o que mantiene la posición actual del juego y ejecuta un solo movimiento o secuencia de movimientos que verifican la corrección.
Sin embargo, no excluimos al final del proyecto, implementar en el programa la posibilidad de poder desafiar a un adversario humano

**Aspectos técnicos y diseño preliminar**
 

* **posibleMovimiento(Coordenada fuente, Coordenada destino)**: compruebe si el movimiento que está por hacer está permitido por reglamento o no.
* **getCoordenada()**: devuelve las coordenadas de la pieza.
* **obtenerJugador()**: devuelve el dueño de la pieza.
* **misma(Caja c1, Caja c2)**: compruebe si dos cajas son iguales, es decir, tienen la misma fila y la misma columna.
* **validasCoordenadas(int x, int y)**: dice si las coordenadas dadas son válidas y caen dentro de la mesa de juego.
* **imprimirTableroAjedrez()**: posición actual de las piezas sobre la mesa.

En el desarrollo del juego se nos van a presentar algunos problemas,
probablemente la mayoría relacionados con el movimiento de las fichas (ya que cada ficha
se mueve de manera distinta y además los movimientos también dependen de las fichas que
hay a su alrededor). Los principales problemas que suponemos que nos encontraremos son
los siguientes:

Movimiento de las piezas respecto de otras piezas: aunque una pieza tenga unos
movimientos prediseñados, si otra pieza del mismo color está en la casilla a la que se
quiere mover o si alguna pieza está en medio del camino que debe recorrer para llegar
a la casilla (excepto en el caballo), no se podrá realizar dicho movimiento.
*  Movimiento del peón: ya que el movimiento del peón negro y el blanco no son iguales,
el movimiento para comer es distinto al movimiento normal de un peón y desde su
posición inicial el peón puede recorrer el doble de espacio.
*  Situación en la que se termine en “tablas”: las situaciones que terminen en empate
puede que nos den algún problema, ya que puede acabar en empate por varias
razones.
*  Movimiento del rey: ya que el rey no solo tiene que tener en cuenta la posición de las
demás piezas sino también los sitios a los que pueden moverse las piezas de distinto
color.
*  El tablero: al ser un array de dos dimensiones va a resultar difícil de implementar ya
que no lo hemos hecho antes en esta asignatura.
*  Herencia de Pieza: al haber seis tipos de piezas distintas, además de dos colores puede
resultar complicado hacer la herencia de la clase Pieza.

**Reparto de tareas / planificación**
La realización del proyecto la vamos a realizar entre dos personas, las cuales nos
vamos a encargar juntas del diseño general y de la implementación del tablero y la casilla,
dividiéndonos el trabajo de implementar las distintas piezas, aunque revisaremos cada uno
las del otro para estar ambos conformes. El desarrollo de las pruebas en JUnit también lo
intentaremos hacer conjuntamente.
Para las tareas que hagamos conjuntamente, la redacción de los entregables y la
preparación para la presentación del proyecto usaremos la clase del miércoles además de
reunirnos varias veces por semana.
