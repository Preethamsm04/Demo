FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY . /app
RUN javac Palindrome.java
CMD ["java","Palindrome"]
