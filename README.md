# 📱 SendMessage

**SendMessage** es una aplicación Android sencilla que permite al usuario escribir un mensaje en una primera pantalla y visualizarlo en una segunda.
Este proyecto tiene como objetivo poner en práctica la configuración del entorno de desarrollo, la gestión de proyectos Android, la depuración, el control de versiones y el diseño de interfaces con **XML** y **ConstraintLayout**.

---


## ViewBinding
ViewBinding es una característica de Android que simplifica la interacción con las vistas en tu aplicación.
Diferencia con findViewById:
* findViewById busca la vista en tiempo de ejecución usando el id, lo que puede provocar errores si la vista no existe o se cambia el layout.
* ViewBinding proporciona referencias seguras en tiempo de compilación, evitando errores de tipo NullPointerException y haciendo el código más limpio.
En el archivo build.gradle se inicia así:
* ``
  android {
    ...
    buildFeatures {
        viewBinding true
    }
}
``
Por cada archivo layout_name.xml, Android genera una clase llamada **LayoutNameBinding** y contiene propiedades para cada vista con id en ese layout.

### Ventajas e inconvenientes respecto a findViewById

 * Ventajas:

 - Menos código repetitivo y más legible.

 - Seguridad en tiempo de compilación (no necesitas casts).

 - Evita errores de tipo NullPointerException al acceder a vistas inexistentes.

 - Mejor rendimiento al no buscar vistas en tiempo de ejecución.

 * Inconvenientes:

 - Genera una clase adicional por layout (pero esto no suele afectar mucho al rendimiento).

 - No tiene capacidades de binding de datos como DataBinding (solo referencias a vistas).

## 🚀 Funcionalidades

* Pantalla principal con un campo de texto para escribir un mensaje.
* Botón que envía el mensaje a una segunda pantalla.
* Segunda pantalla que muestra el mensaje enviado.
* Navegación entre pantallas mediante **Activities**.

---

## 🧩 Tecnologías utilizadas

* **Lenguaje:** Java / Kotlin (según implementación del proyecto)
* **Entorno:** Android Studio
* **Diseño de interfaz:** XML con **ConstraintLayout**
* **Gestión de proyecto:** Gradle
* **Control de versiones:** Git + GitHub

---

## ⚙️ Estructura del proyecto

```
app/
 ├── java/com.example.sendmessage/
 │   ├── MainActivity.java
 │   └── DisplayMessageActivity.java
 ├── res/
 │   ├── layout/
 │   │   ├── activity_main.xml
 │   │   └── activity_display_message.xml
 │   ├── values/
 │   │   └── strings.xml
 └── AndroidManifest.xml
```

---

## 🧠 Conceptos aplicados

* Creación y configuración de un proyecto Android.
* Diseño de interfaces con **ConstraintLayout**.
* Comunicación entre **Activities** usando **Intent** y **Extras**.
* Uso básico de **depuración** en Android Studio.
* Versionado del código con **Git**.

---

## 🧪 Ejecución

1. Clona este repositorio:

   ```bash
   git clone https://github.com/usuario/SendMessage.git
   ```
2. Ábrelo en Android Studio.
3. Conecta un dispositivo o inicia un emulador.
4. Pulsa **Run ▶️** para ejecutar la app.

---

## 📸 Ejemplo de uso

1. El usuario escribe un mensaje en la pantalla principal.
2. Pulsa el botón **Enviar**.
3. La segunda pantalla muestra el texto enviado.

---

Daniel González Molina
