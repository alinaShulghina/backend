# backend



[![Build Status](https://travis-ci.org/alinaShulghina/backend.svg?branch=master)](https://travis-ci.org/alinaShulghina/backend)

Для запуска:
1. склонировать данный репозиторий на свой компьютер
2. В PostgreSQL создать БД postres
3. в файле src/main/resources/aplication.properties изменить имя пользователя и пароль для доступа к БД
4. в cmd перейти в папку с клонированным репозиторием и выполнить команду java -jar target/HelloBackend-1.0-SNAPSHOT.jar

примеры запросов:
http://localhost:8080/hello/contacts?nameFilter=^A.*$
http://localhost:8080/hello/contacts?nameFilter=^.*[ei].*$
