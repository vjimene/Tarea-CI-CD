# Formulario ViRun
## Descripción
Este código es un fragmento para la plataforma ViRun que consta de un formulario para guardar información + un set de pruebas no exhaustivo con Selenium

## Tecnología
- `Java` como lenguaje de programación.
- `Junit` como framework de pruebas unitarias.
- `Selenium` como entorno de pruebas
- `Maven` para gestión de paquetes.
- `Eclipse` o `Spring Tool` como IDE.

## Instalación
Para poder utilizar este programa se debe instalar [Eclipse](https://www.eclipse.org/downloads/), donde instalaremos el framework de trabajo de Java.
Este proyecto utiliza Maven, jUnit y SpringBoot, este último se encuentra en el Marketplace de eclipse y se instala buscando en él "Spring Tools 4".

Se debe realizar click derecho en el proyecto, luego de esto seleccionaremos Maven, donde tendremos que seleccionar la opción Maven install. Luego de esto realizaremos la misma acción pero esta vez seleccionaremos Update Project.

Se requiere tener instalado el navegador Google Chrome, lo cual es fundamental para que funcionen las pruebas con selenium.

Finalmente, se requiere crear un scheme en MySQL y corregir las credenciales en el archivo application.properties

## Ejecución

Para poder ejecutar este programa, dentro de Eclipse, podemos realizar la combinación de teclas Ctrl + F11 o presionar Run en la pestaña con el mismo nombre para que este se ejecute.

Por otro lado, para ejecutar las pruebas de este programa podemos realizar la combinación de teclas Ctrl + R.

## Uso

Para utilizar esta aplicación se debe ingresar en el navegador a la dirección "localhost:8080/". Donde se podrá ver los datos guardados en la base de datos.

Se pueden agregar nuevos datos al presionar el botón en la esquina superior izquierda.

Luego de agregar datos estos pueden ser editados o eliminados bajo la etiqueta de acciones.
