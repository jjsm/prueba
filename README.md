# Pruebas automatizadas a la aplicacion AdvantageDemo
Un proyecto donde se utiliza del patrón serenity 
[screenplay](http://thucydides.info/docs/serenity-staging/#_serenity_and_the_screenplay_pattern) con cucumber y gradle.

Las pruebas  se corren contra la página web de [AdvantageDemo](http://www.advantageonlineshopping.com) .

Automatización de las transacciones de regresión y E2E del aplicativo AdvantageDemo en el menu POPULR ITEM agregando items al carro para realizar compras.

El proyecto cuenta con el manejo automatico de los webdrivers, por lo que no es necesario tener descargados dentro del
proyecto los diferentes navegadores.

# ESTRATEGIA DE AUTOMATIZACION

Se automatizan los flujos necesarios para realizar una compra para realizar un proceso completo de compra añadiendo items al carrito y realizando el pago.



## Detalles generales de la implementación

Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de páginas (user_interface)
definidas en `co.com.example.screenplay`.

La estructura completa del proyecto es la siguiente:

````
    + exceptions: 
        clases que controlan las posibles excepciones técnicas y del negocio que se presentan durante la ejecución de pruebas

	+ models: 
        clases relacionadas con el modelo de dominio y sus respectivos builder 

	+ tasks: 
        clases que representan tareas que realiza el actor a nivel de proceso de negocio

	+ interactions: 
        clases que representan las interacciones directas con la interfaz de usuario

	+ userinterfaces: 
        mapean los objetos de la interfaz de usuario

	+ questions: 
        donde se verifican los resultados de las operaciones realizadas en la aplicación

	+ utils: 
        clases de utilidad que se pueden reusar

	+ unners: 
        clases que permiten ejecutar los tests

	+ stepdefinitions: 
        clases que mapean las líneas Gherkin a código java

	+ features: 
        la representación de las historias de usuario en lenguaje Gherkin
    
````

## Requerimientos

Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente versiones superiores a 7.0.
Para ejecutar el proyecto de automatización se requiere:
 
 	•   Java JDK 1.8  Version Superior 7
 	•   Gradle Version Superior 7
 	•   Cucumber
 	•   Un IDE, preferiblemente IntelliJ IDEA o Eclipse
 	•   Google Chrome 

## FRAMEWORK
+ BDD
+ Gherkin
+ [Cucumber](https://cucumber.io/docs/gherkin/reference/).

## Para correr el proyecto

clean test aggregate es el comando que correr todos  los tests y generará el reporte en la carpeta /target/site/serenity/
clean test --tests NOMBRE_RUNNEER aggregate correr un escenario en especifico
En la carpeta  resources/feature cambiar el dato de prueba  username por el mismo, pudiendo ser diferentes en cada feature pero igual en el mismo feature
 
## Class ParameterType - stepDefinitions

Dentro del package stepdefinitions se encuentra la clase ParameterType, la cual nos permite seguir manejando los datos 
definidos en los features como modelos.