**Лабораторна робота №3**
**Docker**

Виконав

студент 3-го курсу

факультету інформаційних технологій

спеціальності «Інженерія програмного забезпечення»

Ужгородського Національного Університету

**Андрух Микита Євгенович**

<br>

### Хід роботи
1.  Зтягнути готовий образ wordpress з DockerHub та розгорнути за допомогою сайт із безкоштовною темою, використовуючи готовий docker-compose.yml.

2.	Docker Compose

3.	Cтворення HTML-сторінки та занесення її в Docker Image. Залити даний Docker Image на Docker Hub

4.	Скачати Docker Image когось із групи і розвернути в себе контейнер з HTML сторінкою на порті 8086 ззовні

<br>

### Завдання 1

1.	Зтягнув готовий образ:

![screenshot](/screens/Screenshot_1.jpg)

<br>

2.	Створюємо та запускаємо контейнери 
![screenshot](/screens/Screenshot_2.jpg)
![screenshot](/screens/Screenshot_2_1.jpg)

<br>

3.	Створюю профіль на wordpress, переходжу до http://localhost:8080/
![screenshot](/screens/Screenshot_3.jpg)

<br>

### **2) Docker Compose**.
Завдання 2.
Docker-compose – інструмент, який дозволяє створювати, запускати, видаляти контейнери для сервісів. Він представляється у вигляді конфігураційного файлу. При його написанні варто вказати, які образи треба зтягнути з хаба 

На основі вже зтягнених образів створюються та запускаються контейнери. Завдяки Docker-compose.yml за допомогою всього лише двох команд можна запустити сайт.

YML-конфігурацію легко зрозуміти, але при цьому в неї надто чутливий синтаксис, тому YML є досить складним для розробки

<br>

### 3) Cтворення HTML-сторінки та занесення її в Docker Image. Залити даний Docker Image на Docker Hub.

<br>

1.	Створюємо папку та файли

![screenshot](/screens/Screenshot_4.jpg)

2.	Налаштовуємо дозволи

![screenshot](/screens/Screenshot_5.jpg)

3.	Стягуємо образ і вказуємо шлях, в який відбуватиметься копіювання

![screenshot](/screens/Screenshot_6.jpg)

4.	Складаємо образ

![screenshot](/screens/Screenshot_7.jpg)

5.	Створюємо та запускаємо контейнер

![screenshot](/screens/Screenshot_8.jpg)

6.	Результат

![screenshot](/screens/Screenshot_9.jpg)

7.	Логінимось на хабі та заливаємо

![screenshot](/screens/Screenshot_10.jpg)

![screenshot](/screens/Screenshot_11.jpg)

<br>

### 4) Завдання 4

1.	Стягую docker image від однокурсника Гобони В.М:

![screenshot](/screens/Screenshot_12.jpg)

2.	Створив та запустив контейнер

![screenshot](/screens/Screenshot_13.jpg)

3.	Бачимо сторінку Гобони, перейшовши за http://localhost:8086

![screenshot](/screens/Screenshot_14.jpg)
