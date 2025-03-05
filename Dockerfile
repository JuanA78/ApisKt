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

# Mover el JAR generado a una ubicación estándar
RUN mv build/libs/*.jar app.jar

# Exponer el puerto en el que Spring Boot correrá
EXPOSE 8080

# Ejecutar la aplicación usando el JAR, tomando el puerto de Railway
CMD ["java", "-jar", "app.jar"]
