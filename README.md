# Conversor de Monedas

Este proyecto es una aplicación de consola desarrollada en **Java** que permite convertir valores entre distintas monedas en tiempo real, utilizando la API pública de [ExchangeRate API](https://www.exchangerate-api.com/).

---

## Características

Conversión actualizada entre:
- Dólar ↔ Peso argentino
- Dólar ↔ Real brasileño
- Dólar ↔ Sol peruano
- etc

 Integración con una API real libre de tasas de cambio  
 Manejo de errores en conexión y formato JSON  
 Interfaz sencilla por consola

---

## Estructura del Proyecto
```
ChallengeConversorMonedas/
├── src/
│   ├── app/
│   │   └── ClienteApi.java
│   ├── configuracion/
│   │   └── ApiConfig.java
│   ├── dominio/
│   │   ├── ConversorMoneda.java
│   │   └── ServicioConversor.java
│   └── presentacion/
│       └── ConversorApp.java
└── pom.xml

