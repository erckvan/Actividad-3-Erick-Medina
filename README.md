# Actividad-3-Erick-Medina
1- Estructura del programa:
* El programa consta de dos clases principales: 'Card' y 'Deck' 
* La clase 'Card' representa una carta de póker y contiene tres atributos: 'palo' 'color' y 'valor'. también incluye métodos para acceder
a estos atributos.
* La clase 'Deck' representa la baraja de póker y contiene una lista de cartas ('cards') como atributo.
2- inicialización de la baraja:
* En el constructor de la clase 'Deck', se inicializa la lista de cartas ('cards') y se llena con todas las combinaciones posibles de palos, colores y valores de las cartas de póker.
* Se utilizan bucles anidados para iterar sobre los palos, colores y valores posibles, creando una instancia de 'Card' para cada combinación y agregándola a la lista 'cards'.
3- Mezcla de la baraja ('shuffle'):
*El método 'shuffle' de la clase 'Deck’ utiliza el método 'shuffle' de la clase 'collections' para mezclar aleatoriamente las cartas en la lista 'cards'.
4- Extracción de la primera carta ('head'):
* El método 'head' de la clase 'Deck' elimina  muestra la primera carta de la baraja, si no hay cartas en la baraja, muestra un mensaje indicando que no hay cartas.
5- Extracción de una carta al azar ('pick')
* El método 'pick' de la clase 'Deck' elige aleatoriamente una carta de la baraja, la elimina y muestra sus detalles, si no hay cartas en la baraja, muestra un mensaje indicando que no hay cartas.
6- Reparto de una mano de cartas ('hand')
* El método 'hand' de la clase 'Deck' muestra una mano de cinco cartas seleccionadas de la baraja, elimina estas cartas de la baraja y muestra el numero restante de cartas, si no hay suficientes cartas en la baraja, muestra un mensaje indicando que no hay suficientes cartas.
