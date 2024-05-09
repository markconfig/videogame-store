
# Tienda de videojuegos 

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

Install dependencies

```bash
  mvn compile
```

Start the server

```bash
   mvn spring-boot:run
```


## Deployment

Generar empaquedado jar para despliegue

```bash
  mvn package
```


## Environment Variables

To run this project, you will need to add the following environment variables to your .env file

`API_KEY`

`ANOTHER_API_KEY`

