# Implementación de operaciones CRUD en un sistema de gestión de inventario

El sistema de gestión de inventario de una tienda en línea necesita registrar productos, actualizar su información, eliminar productos obsoletos y recuperar detalles de productos para mostrarlos a los usuarios. Cada producto tiene un identificador único, nombre, descripción, precio y cantidad en stock. El sistema debe asegurar que no haya productos duplicados y que la cantidad en stock no sea negativa.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Operaciones CRUD en bases de datos NoSQL |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 3-4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Registro de productos

**Objetivo:** Implementar la funcionalidad para registrar nuevos productos en el sistema.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- El sistema debe permitir el registro de nuevos productos con los atributos mencionados.

**Entregable:** Un método para registrar productos que valide los requisitos mencionados.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo validar la unicidad del identificador y la positividad de la cantidad en stock.

</details>

### Fase 2: Actualización de productos

**Objetivo:** Implementar la funcionalidad para actualizar la información de productos existentes.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- El sistema debe permitir la actualización de la información de productos sin violar las reglas de validación.

**Entregable:** Un método para actualizar productos que mantenga las reglas de validación.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que los identificadores de producto deben ser únicos y la cantidad en stock debe ser positiva.

</details>

### Fase 3: Eliminación de productos

**Objetivo:** Implementar la funcionalidad para eliminar productos del sistema.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- El sistema debe permitir la eliminación de productos, pero debe asegurar que no queden productos duplicados.

**Entregable:** Un método para eliminar productos que mantenga la integridad del sistema.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo asegurar que la eliminación de un producto no cause inconsistencias.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué significa el teorema CAP en el contexto de las bases de datos NoSQL?
- **paraQueSirve**: ¿Para qué sirve el modelo BASE en el diseño de sistemas distribuidos?
- **comoSeUsa**: ¿Cómo se aplican las operaciones CRUD en un sistema de gestión de inventario?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar operaciones CRUD en bases de datos NoSQL?
- **queDecisionesImplica**: ¿Qué decisiones de diseño implica la elección de una base de datos NoSQL para un sistema de gestión de inventario?

## Criterios de Evaluacion

- Implementación de la funcionalidad para registrar productos.
- Implementación de la funcionalidad para actualizar productos.
- Implementación de la funcionalidad para eliminar productos.
- Aplicación del teorema CAP y el modelo BASE en el diseño del sistema.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
