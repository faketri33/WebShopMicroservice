# WebShops

**WebShops** — это микросервисное приложение электронной коммерции, разработанное с использованием Spring Boot и Java 17. Архитектура проекта основана на модульном подходе с отдельными сервисами для пользователей, аутентификации, товаров, корзины, уведомлений и API-шлюза.

## 🧩 Модули проекта

- **[GatewayService](Gateway/Readme.md)** — шлюз для маршрутизации запросов между сервисами.
- **[UserService](UserService/Readme.md)** — управление профилями пользователей.
- **[ProductService](ProductService/Readme.md)** — каталог товаров, категории, поиск.
- **BasketService** — корзина пользователя и управление покупками.
- **NotificationService** — отправка уведомлений (email, push и т.д.).
- **[EurekaServer](EurekaServer/Readme.md)** — Service Discovery.

## ⚙️ Технологии

- Java 17
- Spring Boot 3.5.3
- Spring WebFlux
- Keycloak
- r2dbc
- oauth2
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
├── AnalysticsService/
├── EurekaServer/
├── FrontEnd/
├── pom.xml
└── .env
```

## 🌐 Диаграмма проекта
На текущий момент состояние проекта отображено на диаграмме

![component-diagram-2025-07-31-1928.svg](component-diagram-2025-07-31-1928.svg)
## 🚀 Запуск проекта
1. Склонируйте репозиторий:

   ```bash
   git clone https://github.com/faketri33/WebShopMicroservice
   cd WebShops
