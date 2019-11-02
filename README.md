# CatalogadorSQL
Versión actualizada del catalogador, pasado a Maven, con errores corregidos y con posibilidad de conexión a BBDD SQL.

En esta nueva versión es posible elegir entre guardar la información en un archivo local, como en la versión anterior, o guardarla en una BBDD externa MySQL.

También, si se utiliza el modo MySQL, se ha añadido la posibilidad de insertar fotos online por medio de su dirección.

Por defecto, los datos de conexión son: localhost:3306 y "root" como username y password. Se pueden modificar en el código o escribir los que correspondan en un archivo de texto con el nombre "servidorSQL.txt", en el mismo directorio que el programa y con este formato:

hostname  
puerto  
database  
user  
password  

Por ejemplo:

localhost  
3306  
catalogador  
root  
root  
