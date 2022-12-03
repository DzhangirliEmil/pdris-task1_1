FROM openjdk:19-alpine
ADD out/artifacts/task1_1_jar/task1_1.jar pdristask1_1.jar
EXPOSE 3002
ENTRYPOINT ["java", "-jar", "/pdristask1_1.jar"]