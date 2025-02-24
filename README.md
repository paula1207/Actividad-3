Aplicación Feria Empresarial
Feria Empresarial es una aplicación Java basada en consola diseñada para gestionar una feria empresarial. Permite a los usuarios registrarse y gestionar empresas, stands, visitantes y visitas, al tiempo que proporciona funcionalidades de informes e interacción.

Empezar
Este proyecto se crea con Java y se administra con Maven para la administración de dependencias. Es compatible con JUnit 5 y Mockito para pruebas unitarias.

Prerrequisitos
Antes de ejecutar la aplicación, asegúrese de tener instalado lo siguiente:

Java 11+ (JDK)
Entendido
Visual Studio Code (u otro IDE compatible con Java)
Estructura de carpetas
El proyecto sigue una estructura basada en Maven:

Feria-empresarial/
 │-- src/
 │ ├── main/
 │ │ ├── java/ # Java source files
 │ │ │ ├── edu/ean/feriaempresarial/
 │ │ │ │ ├── model/ # Business logic and entities
 │ │ │ │ ├── views/ # Console UI screens
 │ ├── test/
 │ │ ├── java/ # Unit tests
 │-- pom.xml # Maven configuration file
 │-- README.md # Project documentation
Ejecución de la aplicación
Para compilar y ejecutar el proyecto:

mvn clean package
java -jar target/feriaempresarial-1.0-SNAPSHOT.jar
Como alternativa, puede ejecutarlo mediante el panel Proyectos Java de VS Code.

Gestión de dependencias
Este proyecto usa Maven para administrar dependencias. Las dependencias clave incluyen:

JUnit 5 – Used for unit testing
Mockito – Used for mocking dependencies in tests
Para instalar dependencias, asegúrese de tener Maven instalado y ejecute:

mvn clean install
Ejecución de pruebas
Las pruebas unitarias se escriben con JUnit 5 y Mockito. Para ejecutar pruebas, ejecute:

mvn test
También puedes consultar la cobertura de la prueba con:

mvn jacoco:report
Contribuyendo
Bifurca el repositorio.
Cree una nueva rama ().git checkout -b feature-branch
Confirme los cambios ().git commit -m "Add new feature"
Empuje a la rama ().git push origin feature-branch
Abre una solicitud de extracción.
