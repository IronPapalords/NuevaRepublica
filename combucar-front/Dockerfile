FROM node:12.16.1-alpine As builder
### Crear directorio combucar en la imagen de docker ###
WORKDIR /usr/src/app
COPY package.json package-lock.json ./
RUN npm install
COPY . .
RUN npm run build --prod
### Imagen nginx ###
FROM nginx:1.15.8-alpine
COPY --from=builder /usr/src/app/dist/combucar-front/ /usr/share/nginx/html