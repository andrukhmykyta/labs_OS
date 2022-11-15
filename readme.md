Операційні системи

Лабораторна робота 2

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

<h1 align="center">Використання GitHub Actions</h1>

### Завдання

>1. Ознайомитись із поняттями CI/CD та GitHub Actions. 

>2. Задеплоїти проект на EC2 або VPS за допомогою GitHub Actions.

>3. Ознайомитись із github pipelines та використати їх для реалізації CI/CD.

<br>
<h1 align="center">Хід роботи</h1>
 
1. Генеруємо проєкт на https://start.spring.io/, вибравши Maven та  Java 11. Після генерації починається автоматичне завантажування
Система – Ubuntu
![screenshot](screens/1.jpg)
 
2. Відкриваємо в VS code
![screenshot](screens/2.jpg)

3. Запушив проєкт
![screenshot](screens/3.jpg)

4. Створюємо EC2-instance
![screenshot](screens/4.jpg)

5. Вибираємо тип та генеруємо пару ключів
![screenshot](screens/5.jpg)

6. Налаштування мережевих інтерфейсів
![screenshot](screens/6.jpg)

7. Успішно створено
![screenshot](screens/7.jpg)

8. Підключився до віддаленої машини
![screenshot](screens/8.jpg)

9. Переходимо в setting - actions - runners, і клікаємо на зелену кнопочку
![screenshot](screens/9.jpg)

10. Прописуємо виділені команди на віддаленій VM
![screenshot](screens/10.jpg)

11. ![screenshot](screens/11.jpg)

12. ![screenshot](screens/12.jpg)

13. Вибираємо Java with Maven
![screenshot](screens/13.jpg)

14. Підредачили трошки файл maven.yml
![screenshot](screens/14.jpg)

15. ВНОСИМО ЗМІНИ!!!
![screenshot](screens/15.jpg)

16. У нас появився файлик. NICE!
![screenshot](screens/16.jpg)

17. Оновлюємо пакети
![screenshot](screens/17.jpg)

18. Установлюємо Maven та жабу
![screenshot](screens/18.jpg)

19. Maven Є!!!
![screenshot](screens/19.jpg)

20. Жаба також Є!!!
![screenshot](screens/20.jpg)

21. Перезапускаємо ci/cd pipeline
![screenshot](screens/21.jpg)

22. Висновок один – деплой пройшов успішно, а я молодець!
![screenshot](screens/22.jpg)

23. Знайшли JAR-файл, який відповідає за запуск проєкту на Spring Boot
![screenshot](screens/23.jpg)

24. Додаємо команду, яка відповідає за запуск проєкту
![screenshot](screens/24.jpg)

25. Все ж таки я живий – успішно підключилися до серверу – `http://18.198.208.203/`
![screenshot](screens/25.jpg)