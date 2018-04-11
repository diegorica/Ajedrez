# Ajedrez
PMOO: Proyecto de la asignatura
Documento de Objetivos del Proyecto
Nombre del Grupo: International Fecha: 02/04/18
Título del Proyecto: chess (ajedrez)
 Introducción y descripción del juego
El ajedrez es un antiguo juego de estrategia, en el que dos jugadores se enfrentan entre sí, compuesto por piezas con cualidades diferentes y específicas, en un campo de batalla o tablero de ajedrez, una cuadrícula cuadrada que consta de 64 cuadrados o casas, 32 blancas y 32 negras . El objetivo del juego es mover las piezas para traer al rey oponente en la condición de no poder hacer ningún movimiento válido ("jaque mate"). Este manual ilustrará las piezas de ajedrez básicas y las reglas básicas de táctica y estrategia, y luego abordará los temas más complejos de aperturas / defensas, el juego intermedio y el partido final.
 Objetivos del proyecto
El objetivo del sistema implementado no es desafiar a un oponente humano, pero un sistema que implementa el tablero de ajedrez del juego, o que mantiene la posición actual del juego y ejecuta un solo movimiento o secuencia de movimientos que verifican la corrección.
Sin embargo, no excluimos al final del proyecto, implementar en el programa la posibilidad de poder desafiar a un adversario humano

 Aspectos técnicos y diseño preliminar
 

-posibleMovimiento(Coordenada fuente, Coordenada destino): compruebe si el movimiento que está por hacer está permitido por reglamento o no.
-getCoordenada(): devuelve las coordenadas de la pieza
-obtenerJugador(): devuelve el dueño de la pieza
-misma(Caja c1, Caja c2): compruebe si dos cajas son iguales, es decir, tienen la misma fila y la misma columna.
-validasCoordenadas(int x, int y):  dice si las coordenadas dadas son válidas y caen dentro de la mesa de juego
-imprimirTableroAjedrez(): posición actual de las piezas sobre la mesa




 Reparto de tareas / planificación
En este último apartado del Documento de Objetivos del Proyecto se pide una planificación detallada de las tareas que se van a desarrollar, especificando cuáles van a realizarse individualmente por cada uno de los integrantes del grupo de trabajo y cuáles son responsabilidad de todo el grupo. Además de la lista de tareas, es necesario incluir una estimación del tiempo de dedicación de cada persona implicada en cada tarea.
Se recomienda incluir en la planificación, al menos, las tareas relacionadas con el diseño e implementación de las clases y las clases de prueba identificadas, las reuniones de grupo, la redacción de los diferentes entregables (DOP, diseño final, memoria del proyecto) y la preparación de la presentación del proyecto que tendrá lugar la última semana de clase.
 Anexo: la importancia de definir un buen DOP
Con objeto de dejar patente la importancia del diseño del proyecto y del reparto de tareas y responsabilidades, a continuación se citan algunas de las conclusiones extraídas por los alumnos de la asignatura Programación Modular y Orientación a Objetos de cursos anteriores tras el desarrollo de sus respectivos proyectos:

¿En qué hemos fallado? Principalmente, en la estructura y planificación iniciales (...). He aprendido que no se debe empezar a hacer un juego sin antes tener un esquema, un diagrama… una idea básica, de cómo empezar, y qué necesitaremos. Una vez finalizado el proyecto he aprendido que lo más importante sin lugar a dudas es la planificación inicial del proyecto. Si volviésemos a hacer el proyecto, probablemente nos esforzaríamos más en la estructuración inicial del juego.

El principal problema surgido durante el desarrollo fue que tuvimos que cambiar casi todo el diagrama de clases que habíamos pensado en un inicio, añadiendo nuevas clases y nuevos métodos lo cual nos hizo perder un tiempo considerable porque tuvimos que rehacer todo o casi todo.

Respecto al principal problema creo que ha sido no haber establecido desde el principio un diagrama de clases sólido y una metodología de trabajo más rígida, ya que hemos trabajado mucho a ciegas, haciendo cambios continuos. Y el trabajo y las horas invertidas no se corresponden con el resultado obtenido. De esta forma el resultado podría haber sido mucho mejor y más completo, aparte de más fácil de defender en la presentación.

El diseño es más importante de lo que se pensaba en un principio (...) También nos hemos dado cuenta que la implementación es una de las partes menos importantes del proyecto y de las que menos tiempo lleva, siendo las pruebas y el diseño mucho más importantes.

