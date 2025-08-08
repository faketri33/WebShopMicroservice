# WebShops

**WebShops** — это микросервисное приложение электронной коммерции, разработанное с использованием Spring Boot и Java 17. Архитектура проекта основана на модульном подходе с отдельными сервисами для пользователей, аутентификации, товаров, корзины, уведомлений и API-шлюза.

## 🧩 Модули проекта

- **[api-gateway](api-gateway/Readme.md)** — шлюз для маршрутизации запросов между сервисами.
- **[user-service](user-service/Readme.md)** — управление профилями пользователей.
- **[catalog-service](catalog-service/Readme.md)** — каталог товаров, категории, поиск.
- **bascket-service** — корзина пользователя и управление покупками.
- **notification-service** — отправка уведомлений (email, push и т.д.).
- **[discovery-server](discovery-server/Readme.md)** — Service Discovery Eureka.

## ⚙️ Технологии

- Java 17
- Spring Boot 3.5.3
- Spring WebFlux
- Spring Security (OAuth2 / JWT)
- REST API
- R2DBC
- Keycloak
- Maven
- React
- Docker 
- Microservices

## 📂 Структура проекта

```
WebShops/
├── api-gateway/
├── user-service/
├── catalog-service/
├── basket-service/
├── notification-service/
├── analytics-service/
├── discovery-server/
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
