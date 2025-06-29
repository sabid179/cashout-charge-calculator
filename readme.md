# 📱 BMI Calculator App

An intuitive Android app to calculate BMI (Body Mass Index) based on height in feet/inches and weight in kilograms. The result is displayed along with a color-coded background indicating BMI category.

---

## ✨ Features

- Input height in **feet** and **inches**
- Input weight in **kilograms**
- Calculates and displays BMI value
- Background color changes based on BMI range
- Automatically hides keyboard after calculation
- User-friendly error handling with `Toast` message

---

## 🧮 BMI Formula

BMI = weight (kg) / (height (m) × height (m))

yaml
Copy
Edit

---

## 🎨 BMI Color Ranges

| BMI Range   | Category     | Background Color |
|-------------|--------------|------------------|
| < 18.5      | Underweight  | Blue `#2196F3`    |
| 18.5–24.9   | Normal       | Green `#4CAF50`   |
| 25–29.9     | Overweight   | Orange `#FF9800`  |
| 30+         | Obese        | Red `#F44336`     |

---

## 🛠️ Tech Stack

- **Language:** Java
- **Platform:** Android SDK
- **Min SDK:** 24
- **Target SDK:** 35
- **UI Layout:** XML

---

## 📋 How to Use

1. Input height in **feet** and **inches**
2. Input weight in **kg**
3. Tap the **Calculate BMI** button
4. View your result and background color category

---

## 📦 Package

```java
package com.example.bmicalculator;
📃 License
This project is open-source and free to use for educational or personal projects.

👨‍💻 Developed by
Md. Rakibul Islam Sabid
CSE, United International University
