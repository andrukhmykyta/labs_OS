Операційні системи

Лабораторна робота 4

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

<h1 align="center">Terraform</h1>

### Завдання
Create terraform scenario for provisioning infrastructure on GCP (or AWS) cloud Requirement

>1. Create one instance (image: ubuntu 20.04

>2. Allow HTTP/HTTPS traffic on a NIC

>3. Provision one SSH public key for created instance

>4. Install Web Server (Apache HTTP Server / NGINX HTTP Server) via bash scenario


<br>
<h1 align="center">Хід роботи</h1>
 
1. Поклав Terraform, зарегався на AWS і створив юзера
![screenshot](1.jpg)

<br>

>Створив файл `config.tf`, прописав провайдера і створив ресурс, який за допомогою Terraform буде розміщено та запущено на AWS.
![screenshot](2.jpg)

<br>


>Команда ***terraform init***
![screenshot](3.jpg)

<br>


> Через ***terraform plan*** дізнаємося, що буде зроблено командою ***terraform apply***.
![screenshot](4.jpg)

<br>


> Команда ***terraform apply*** (розміщення і запустити на AWS)
![screenshot](5.jpg)
![screenshot](6.jpg)
![screenshot](7.jpg)

<br>

2. Налаштував мережевий інтерфейс за допомогою ***aws_security_group***
![screenshot](8.jpg)

<br>


Результат
![screenshot](9.jpg)

<br>


***ssh-keygen -t rsa -b 2048*** генерує приватний і публічний SSH-ключ для ресурсу
![screenshot](10.jpg)

<br>
<br>

Ключ для головного instance кидаємо в новостворений ресурс
![screenshot](11.jpg)

<br>


У головному instance вказуємо щойно створений ключ.
![screenshot](12.jpg) 

<br>


***chmod 400 key*** задає дозвіл файлу з приватним SSH-ключем.
***ssh -i "key" ubuntu@ec2-18-157-84-18.eu-central-1.compute.amazonaws.com*** входить до віддаленої системи
![screenshot](13.jpg)

<br>

***sudo apt update***

<br>

***sudo apt upgrade***

<br>


***sudo apt install apache2***

<br>


***sudo ufw allow in "Apache Full"***

<br>


***sudo systemctl restart apache2***

<br>


Cтворюємо новий index.html і замінюємо шляхом /var/www/html/index.html
***mv -i index.html /var/www/html/index.html***


<br>

Результат:

<br>


![screenshot](14.jpg)