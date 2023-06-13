## Proyecto de Conexión a Base de Datos con Java

En este respositorio se encontrará la conexión y consumo de una base de datos SQL utilizando jdbc driver

<a href="Documentación"><img src="https://img.shields.io/badge/Doc-Actualizada-informational"></a>
<a href="Status"><img src="https://img.shields.io/badge/Status-Success-success"></a>
<a href="Lenguaje"><img src="https://img.shields.io/badge/Lenguaje-Python-blue"></a>
<a href="License"><img src="https://img.shields.io/badge/License-MIT-important"></a>

## Requisitos

Asegúrate de tener instalado lo siguiente:

Java Development Kit (JDK) versión 1.8.0_251 o superior.
Base de datos (por ejemplo, MySQL, PostgreSQL, SQLite) instalada y en funcionamiento.
Controlador JDBC específico para la base de datos que estás utilizando.

## Configuración
Sigue los pasos a continuación para configurar el proyecto:

Clona este repositorio en tu máquina local o descarga los archivos en un directorio específico.

Abre el proyecto en tu IDE de Java preferido.

Copia el controlador JDBC específico para tu base de datos en el directorio del proyecto o agrega la dependencia correspondiente en tu archivo de configuración de gestión de dependencias (por ejemplo, Maven, Gradle).

Abre el archivo src/App.java.

Modifica los valores dcon los detalles de conexión correctos para tu base de datos.

## Uso
Para ejecutar el proyecto y establecer la conexión a la base de datos, sigue estos pasos:

Compila el proyecto para asegurarte de que no hay errores de compilación.

Ejecuta el archivo App.java.

Si la conexión se establece correctamente, verás un mensaje que confirma la conexión exitosa a la base de datos. En caso contrario, se mostrará un mensaje de error.

Puedes modificar el archivo App.java para realizar otras operaciones de base de datos, como consultas o actualizaciones.

Luego se muestra un ejemplo de cómo utilizar la función querySelecEmployeeAll para seleccionar todos los empleados de la tabla "employees" en la base de datos

## Licencia
[MIT](https://choosealicense.com/licenses/mit/)
