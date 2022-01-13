

========================
BUILD OUTPUT DESCRIPTION
========================

When you build an Java application project that has a main class, the IDE
automatically copies all of the JAR
files on the projects classpath to your projects dist/lib folder. The IDE
also adds each of the JAR files to the Class-Path element in the application
JAR files manifest file (MANIFEST.MF).

To run the project from the command line, go to the dist folder and
type the following:

java -jar "juego.jar" 

To distribute this project, zip up the dist folder (including the lib folder)
and distribute the ZIP file.

Notes:

* If two JAR files on the project classpath have the same name, only the first
JAR file is copied to the lib folder.
* Only JAR files are copied to the lib folder.
If the classpath contains other types of files or folders, these files (folders)
are not copied.
* If a library on the projects classpath also has a Class-Path element
specified in the manifest,the content of the Class-Path element has to be on
the projects runtime path.
* To set a main class in a standard Java project, right-click the project node
in the Projects window and choose Properties. Then click Run and enter the
class name in the Main Class field. Alternatively, you can manually type the
class name in the manifest Main-Class element.


---------------------------------------------------------------------------

DESCRIPCIÓN DE SALIDA DE CONSTRUCCIÓN
========================

Cuando crea un proyecto de aplicación Java que tiene una clase principal, el IDE
copia automáticamente todo el JAR
archivos en el classpath de proyectos a la carpeta dist/lib de sus proyectos. el IDE
también agrega cada uno de los archivos JAR al elemento Class-Path en la aplicación
Archivo de manifiesto de archivos JAR (MANIFEST.MF).

Para ejecutar el proyecto desde la línea de comando, vaya a la carpeta dist y
escriba lo siguiente:

java -jar "juego.jar"

Para distribuir este proyecto, comprima la carpeta dist (incluida la carpeta lib)
y distribuya el archivo ZIP.

Notas:

* Si dos archivos JAR en el classpath del proyecto tienen el mismo nombre, solo el primero
El archivo JAR se copia en la carpeta lib.
* Solo los archivos JAR se copian en la carpeta lib.
Si el classpath contiene otros tipos de archivos o carpetas, estos archivos (carpetas)
no se copian.
* Si una biblioteca en el classpath del proyecto también tiene un elemento Class-Path
especificado en el manifiesto, el contenido del elemento Class-Path debe estar en
la ruta de tiempo de ejecución de los proyectos.
* Para establecer una clase principal en un proyecto Java estándar, haga clic con el botón derecho en el nodo del proyecto
en la ventana Proyectos y seleccione Propiedades. Luego haga clic en Ejecutar e ingrese el
nombre de la clase en el campo Clase principal. Alternativamente, puede escribir manualmente el
nombre de clase en el elemento de clase principal del manifiesto.
