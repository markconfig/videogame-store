
# Videogame Store 

Una sencilla, demasida sencilla tienda de videojuegos, a fin de práctica de Spring Boot, se muestran tarjetas con información de imagen, título, distribuidor, desarrollador descripción.

- [x]  Busqueda de videojuegos
- [x]  Filtrado por distribuidor
- [x]  Agregar nuevo videojuego


## Tech Stack

**Client:** Thymeleaf, Boostrap

**Server:** Spring Boot


## Run Locally

Clone the project

```bash
  git clone https://github.com/markconfig/videogame-store.git
```

Go to the project directory

```bash
  cd videogame-store
```

Create database "videogames" and create tables with the following script

```bash
src/main/resources/schema-mariadb.sql
```

Change datasource user values for you, in application.properties 

```bash
src/main/resources/application.properties
```
![image](https://github.com/markconfig/videogame-store/assets/43713105/226bf7de-316e-42ce-972c-a87d9b7345c0)


Install dependencies

```bash
  mvn compile
```

Start the server

```bash
   mvn spring-boot:run
```


## Deployment

Generate Jar Packaging for deploy in some site

```bash
  mvn package
```

## Screenshots

**Listado de videojuegos**

![image](https://github.com/markconfig/videogame-store/assets/43713105/fa611fca-ba62-4089-b134-4ebfc91b8368)


**Busqueda**

![image](https://github.com/markconfig/videogame-store/assets/43713105/d8d4a63e-b094-478c-b589-92a34607d1d3)


**Nuevo videojuego**

![image](https://github.com/markconfig/videogame-store/assets/43713105/aa4875a6-5598-4955-b85e-c2ac5993e596)



