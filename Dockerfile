# Usar una imagen de OpenJDK como base
FROM openjdk:21-jdk-slim

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar los archivos de tu proyecto al contenedor
COPY . /app/

# Dar permisos de ejecución a gradlew (si no se ha hecho antes)
RUN chmod +x gradlew

# Instalar las dependencias de Gradle y compilar el proyecto
RUN ./gradlew clean build -x check -x test

# Exponer el puerto en el que Spring Boot correrá (por defecto es 8080)
EXPOSE 8080

# Ejecutar la aplicación de Spring Boot con el comando bootRun de Gradle
CMD ["./gradlew", "bootRun"]
