# Combucar

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 11.1.4.

# Pre-requisitos 

1-Install Node js
`https://nodejs.org/en/download/`

2-npm install -g @angular/cli (dentro de carpeta combucar-front)

## Repositorio Git
`git clone https://github.com/IronPapalords/NuevaRepublica.git -b combucar-front`


## Repositorio Docker Hub
`https://hub.docker.com/repository/docker/dobok1/taller`



## Iniciar el proyecto de Combucar
Instalación depedencias node

`npm install`

Ejecuta en una consola dentro la carpeta del proyecto 

`ng serve -o`

# DOCKER
## Pre-requisitos:
Install Docker for Desktop

`https://www.docker.com/products/docker-desktop`
 ## Generar imagen desde consola
`docker build . -t combucar-front`
## Ejecutar contenedor de imagen
docker run -d --name combucar -p 3001:80 combucar-front

## Ejecutar en browser
http://localhost:3001


## CREAR TAG DE IMAGEN y SUBIR A DOCKER HUB
`docker tag combucar-front dobok1/combucar-front:v4`

`docker push dobok1/combucar-front:v4`


## Template de bootstrap



Visita 
`https://spark.bootlab.io/pages-settings.html`
`https://appstack.bootlab.io/icons-feather.html`
`https://preview.keenthemes.com/start-react/dashboard`
`https://themes.getbootstrap.com/preview/?theme_id=8214`
`https://themes.getbootstrap.com/product-category/admin-dashboard/page/2/`