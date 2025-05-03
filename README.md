# 🏗️ Working Structure

A sample Android project demonstrating basic Android app structure and Kotlin programming concepts.

## 🎯 Project Overview

This project serves as a foundational example of Android application architecture using Kotlin. It demonstrates key Android concepts like Activity navigation, data passing between screens, and View Binding implementation.

## 🛠️ Technical Stack

- 📱 Android SDK 35
- 🎯 Kotlin Programming Language
- 🔧 Gradle Build System with Kotlin DSL
- 📦 AndroidX Libraries
- 🔄 View Binding

## 🔑 Key Features

- Modern Android project structure
- Kotlin-based configuration
- Activity navigation example
- Data passing between activities
- View Binding implementation
- Best practices for Android development

## 🎨 Application Structure

### MainActivity

The main screen of the application that contains:

- View Binding setup
- Navigation to DetailActivity
- Data passing through Intent

```kotlin
// Key functionality:
- Uses ViewBinding for view access
- Button click listener implementation
- Intent-based navigation with data passing
```

### DetailActivity

The detail screen that:

- Receives data from MainActivity
- Displays passed message
- Implements View Binding

```kotlin
// Key functionality:
- Retrieves passed Intent data
- Updates UI with received message
- Uses ViewBinding for view access
```

## 🏗️ Project Structure

```
WorkingStructure/
├── app/                    # Application module
│   ├── build/             # Build outputs
│   ├── src/               # Source code
│   │   └── main/
│   │       ├── java/      # Kotlin/Java source files
│   │       │   └── com/example/working_structure/
│   │       │       ├── MainActivity.kt
│   │       │       └── DetailActivity.kt
│   │       └── res/       # Android resources
│   └── build.gradle.kts   # App-level build config
├── gradle/                # Gradle configuration
└── build.gradle.kts       # Project-level build config
```

## 🚀 Getting Started

1. Clone the repository
2. Open in Android Studio
3. Sync project with Gradle files
4. Run on an emulator or device

## 🔧 Prerequisites

- Android Studio Arctic Fox or newer
- JDK 11 or higher
- Android SDK with minimum API level 24

## 📝 Configuration

The project uses the following configuration:

- `compileSdk`: 35
- `minSdk`: 24
- `targetSdk`: 35
- Kotlin JVM target: 11
- View Binding enabled

## 🔄 Data Flow

1. MainActivity

   - User clicks button
   - Creates Intent with message
   - Launches DetailActivity

2. DetailActivity
   - Receives Intent
   - Extracts message
   - Displays in TextView

## 📚 Related Projects

This project is part of a learning series that includes:

- [Login Screen](https://github.com/tamerakdeniz/Login-Screen)
- [Working Structure](https://github.com/tamerakdeniz/Working-Structure)

## 👤 Author

**Tamer Akdeniz**

- GitHub: [@tamerakdeniz](https://github.com/tamerakdeniz)

## 📄 License

This project is available under the MIT license. See the LICENSE file for more info.
