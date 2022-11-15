Операційні системи

Лабораторна робота 5

<br>

Виконав 

студент 3-го курсу

факультету інформаційних технологій

спеціальності «Інженерія програмного забезпечення»

Ужгородського Національного Університету

Андрух Микита Євгенович
<br>
<br>
<br>

<h1 align="center">Деплой проекту на AWS EC2</h1>

### Завдання
Create terraform scenario for provisioning infrastructure on GCP (or AWS) cloud Requirement

>1. Зареєструватись на AWS. 

>2. Створити інстанс EC2

>3. Задеплоїти проект (може бути  html сторінка) і скинути посилання в звіт для можливості перегляду

<br>
<h1 align="center">Хід роботи</h1>
 
Система – Ubuntu
![screenshot](1.jpg)

<br>

Тип – дефолтний
![screenshot](2.jpg)

<br>


Створюю новий SSH-ключ ***shakhtar_key***
![screenshot](3.jpg)

<br>


Встановив вхідний трафік на 80-ий порт.
![screenshot](4.jpg)

<br>


Створив та запустив інстенс
![screenshot](5.jpg)

Так виглядає SSH-клієнт та інструкція, за допомогою якої можна підключитися до віддаленої VM
![screenshot](6.jpg)

Змінив дозвіл файлу з ключем на 400-й
![screenshot](7.jpg)

<br>

Успішно підключився до віддаленої віртуальної машини за допомогою команди, що є в SSH-клієнті
![screenshot](8.jpg)

<br>


Прописуємо наступні команди для оновлення системи і установки Apache-серверу:

<br>

sudo apt update

<br>

sudo apt upgrade

<br>

sudo apt install apache2

<br>

![screenshot](9.jpg)

<br>


Скинув файл ***index.html*** на віддалену VM
![screenshot](10.jpg)

<br>
<br>

Замінив файл за розташуванням нижче
![screenshot](11.jpg)

Як бачимо, результат – на лице
![screenshot](12.jpg)