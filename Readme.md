# WebShops

**WebShops** — это микросервисное приложение электронной коммерции, разработанное с использованием Spring Boot и Java 17. Архитектура проекта основана на модульном подходе с отдельными сервисами для пользователей, аутентификации, товаров, корзины, уведомлений и API-шлюза.

## 🧩 Модули проекта

- **Gateway** — шлюз для маршрутизации запросов между сервисами.
- **[UserService](UserService/Readme.md)** — управление профилями пользователей.
- **[ProductService](ProductService/Readme.md)** — каталог товаров, категории, поиск.
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
├── ProductService/
├── BasketService/
├── NothificationService/
├── pom.xml
└── .env
```

## 🌐 Диаграмма проекта
На текущий момент состояние проекта отображено на диаграмме

![component-diagram-2025-07-22-1928.svg](component-diagram-2025-07-22-1928.svg)
## 🚀 Запуск проекта
1. Склонируйте репозиторий:

   ```bash
   git clone https://github.com/faketri33/WebShopMicroservice
   cd WebShops
