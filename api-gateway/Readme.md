## 🌐 Gateway Service

**Spring Cloud Gateway** — API-шлюз для маршрутизации запросов.

### 🧱 Стек технологий

* Java 17+
* Spring Boot
* Spring Cloud Gateway
* Spring Security (OAuth2 / JWT)
* WebFlux
* Maven
* Docker

---

### 🚀 Запуск проекта

#### 📦 Сборка

```bash
./mvnw clean package
```

#### 🐳 Запуск через Docker

```bash
docker build -t faketri-gateway .
docker run -p 8080:8080 faketri-gateway
```

#### ☕ Запуск локально

```bash
./mvnw spring-boot:run
```

---

### ⚙️ Конфигурация

В `application.properties`:

```properties
server.port=8080

spring.security.oauth2.resourceserver.jwt.issuer-uri=http://localhost:8180/realms/your-realm
spring.security.oauth2.resourceserver.jwt.jwk-set-uri=http://localhost:8180/realms/your-realm/protocol/openid-connect/certs
```

---

### 🔐 Безопасность

Используется:

* Аутентификация через Keycloak
* JWT токены
* Проверка ролей и маршрутов через Spring Security WebFlux (`WebSecure.java`)

---

### 🛣️ Маршрутизация

Gateway перенаправляет трафик к другим микросервисам. Конфигурация маршрутов производится через `application.properties` получая пути от `Eureka server`.

Пример:

```properties
# === Eureka Discovery Client ===
spring.cloud.discovery.enabled=true
eureka.client.register-with-eureka=true
eureka.client.fetch-registry=true
eureka.client.service-url.defaultZone=${EUREKA_URL}

# === Route Configuration ===
spring.cloud.gateway.server.webflux.routes[0].id=user-service
spring.cloud.gateway.server.webflux.routes[0].uri=lb://user-service
spring.cloud.gateway.server.webflux.routes[0].predicates[0]=Path=/api/user/**
spring.cloud.gateway.server.webflux.routes[0].filters[0]=RemoveRequestHeader=Cookie
```

---

### 📂 Структура проекта

```
Gateway/
├── Dockerfile
├── pom.xml
├── src/
│   ├── main/java/org/faketri/
│   │   ├── GatewayApplication.java
│   │   └── config/WebSecure.java
│   └── resources/application.properties
```

---
