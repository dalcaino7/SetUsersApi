# ApiRest de Usuarios

Esta aplicación te permite insertar usuarios a una base de datos H2 mediante un endpoint con una entrada json.
## Requisitos Previos

Asegúrate de tener instaladas las siguientes herramientas antes de comenzar:

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)

## Configuración y ejecución del Proyecto

1. Clona este repositorio: `git clone https://github.com/dalcaino7/SetUsersApi.git`
2. Navega al directorio del proyecto: `cd tu-proyecto`
3. Ejecuta la aplicación: `mvn spring-boot:run`

La aplicación estará disponible en `http://localhost:8080`.

La BD H2 la puedes consultar en: `http://localhost:8080/h2-console`.

## Documentación de la API

Para revisar detalles de como interactuar con las solicitudes y respuestas de la API, ingrese al siguiente link para revisar la documentación de Swagger: 
http://localhost:8080/swagger-ui/index.html


## Tecnologías Utilizadas
- [Java](https://www.java.com/es/) Version 17
- [Spring Boot](https://spring.io/projects/spring-boot): Versión 2.7.5
- [Maven](https://maven.apache.org/): Gestión de dependencias y construcción del proyecto.
- [Otros Frameworks o Bibliotecas Utilizadas]: Enumera otras tecnologías relevantes.

## Estructura del Proyecto

La estructura de paquetes del proyecto Java Spring Boot para esta API REST sigue los principios de diseño y las buenas prácticas para facilitar la escalabilidad, mantenimiento y comprensión del código. 

a continuación el detalle de cada capa o carpeta:

- config: Contiene las clases de configuración de Spring.
- controller: Contiene los controladores de la API REST, donde se manejan las solicitudes HTTP.
- dto: Almacena los objetos de transferencia de datos (DTO) que se utilizan para la comunicación entre el cliente y el servidor.
- exception: Aquí se colocan las clases relacionadas con el manejo de excepciones específicas de la aplicación.
- model: Este paquete contiene las clases de modelo que representan las entidades de tu aplicación.
- entity: Clases que representan las entidades de la base de datos.
- repository: Interfaces de repositorio que definen operaciones de acceso a datos.
- security: Contiene las configuraciones relacionadas con la seguridad, incluyendo la implementación de JWT.
- service: Capa de servicio que contiene la lógica de negocio.


## Contacto

#### David Alcaino G.
- [Email](mailto:david.alcaino.7@gmail.com)
- [LinkedIn](https://www.linkedin.com/in/dalcaino7/)


