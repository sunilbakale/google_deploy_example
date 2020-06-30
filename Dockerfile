FROM openjdk:8-jdk
ADD googleService-1.war googleService-1.war
CMD ["java", "-jar", "googleService-1.war"]