# WebShops

**WebShops** — это микросервисное приложение электронной коммерции, разработанное с использованием Spring Boot и Java 17. Архитектура проекта основана на модульном подходе с отдельными сервисами для пользователей, аутентификации, товаров, корзины, уведомлений и API-шлюза.

## 🧩 Модули проекта

- **Gateway** — шлюз для маршрутизации запросов между сервисами.
- **[UserService](UserService/Readme.md)** — управление профилями пользователей.
- **AuthService** — регистрация, вход, выдача токенов.
- **ProductService** — каталог товаров, категории, поиск.
- **BasketService** — корзина пользователя и управление покупками.
- **NotificationService** — отправка уведомлений (email, push и т.д.).

## ⚙️ Технологии

- Java 17
- Spring Boot 3.5.3
- Spring WebFlux
- Maven
- REST API
- Microservices
- React
- Docker 

## 📂 Структура проекта

```
WebShops/
├── Gateway/
├── UserService/
├── AuthService/
├── ProductService/
├── BasketService/
├── NothificationService/
├── pom.xml
└── .env
```


## 🚀 Запуск проекта

1. Склонируйте репозиторий:

   ```bash
   git clone https://github.com/faketri33/WebShopMicroservice
   cd WebShops
