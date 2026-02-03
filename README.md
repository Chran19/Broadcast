# Broadcast Receiver Demo

An Android application demonstrating the use of **BroadcastReceiver** to detect and respond to system-level events, specifically Airplane Mode state changes.

---

## Introduction

This project showcases how to implement a **BroadcastReceiver** in Android to listen for system broadcasts. The app monitors the device's Airplane Mode status and provides real-time visual feedback when the mode is toggled on or off.

BroadcastReceivers are a fundamental Android component that allows apps to respond to system-wide broadcast announcements, making them essential for building reactive applications.

---

## Project Structure

```
Broadcast/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/broadcast/
│   │       │   ├── MainActivity.java      # Main UI and receiver registration
│   │       │   └── AirplaneModeReceiver.java  # Custom BroadcastReceiver
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   └── activity_main.xml  # Main activity layout
│   │       │   └── values/
│   │       │       ├── colors.xml
│   │       │       ├── strings.xml
│   │       │       └── themes.xml
│   │       └── AndroidManifest.xml
│   └── build.gradle.kts
├── gradle/
│   └── libs.versions.toml
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

---

## Features

| Feature                  | Description                                                    |
| ------------------------ | -------------------------------------------------------------- |
| **Real-time Detection**  | Instantly detects when Airplane Mode is toggled                |
| **Dynamic Registration** | BroadcastReceiver registered dynamically in activity lifecycle |
| **Visual Feedback**      | Displays status indicators for ON/OFF states                   |
| **Manual Check**         | Button to manually check current Airplane Mode status          |
| **Clean UI**             | Modern Material Design interface                               |

---

## Technologies Used

- **Language:** Java
- **Min SDK:** 24 (Android 7.0)
- **Target SDK:** 35
- **Android Components:**
  - BroadcastReceiver
  - IntentFilter
  - Settings.Global
- **Libraries:**
  - AndroidX AppCompat
  - Material Design Components

---

## How It Works

1. **Registration:** The app dynamically registers an `IntentFilter` for `Intent.ACTION_AIRPLANE_MODE_CHANGED` in `onStart()`
2. **Detection:** When Airplane Mode is toggled, the system broadcasts an intent
3. **Response:** The custom `AirplaneModeReceiver` receives the broadcast and updates the UI
4. **Cleanup:** The receiver is unregistered in `onStop()` to prevent memory leaks

### Key Code Snippet

```java
// Registering the BroadcastReceiver
IntentFilter filter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
registerReceiver(airplaneModeReceiver, filter);
```

---

## Screenshots

> Add screenshots of your app here
>
> | Airplane Mode OFF          | Airplane Mode ON         |
> | -------------------------- | ------------------------ |
> | ![OFF](pics/Off_Plane.png) | ![ON](pics/On_Plane.png) |

---

## Installation

1. Clone the repository
2. Open in Android Studio
3. Sync Gradle files
4. Run on emulator or physical device

---

## License

This project is for educational purposes.

---

## Author

**Ranjeet**

GitHub: [@Chran19](https://github.com/Chran19)

---

_Built for learning Android Development_
