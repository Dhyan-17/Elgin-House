# 🏠 Elgin House PG Management System

A console-based **Java** application that simulates the day-to-day operations of a PG/Guest House — built as a Semester 1 project. It handles guest registration, room allocation, contract & rent management, resident login, and a full service/support ticketing flow, entirely through a menu-driven CLI.

## 📌 Overview

The system has two entry points from the main menu:

- **Resident** — Existing residents log in with their unique ID and password to access stay services or raise support tickets.
- **Guest** — New guests can view facilities, book a room, and complete registration to become a resident.

## ✨ Features

### 👤 Guest Module
- Facility & pricing overview (2/3/4 sharing rooms)
- Room booking with **auto-allocation** of room number & bed number
- Contract selection (3 / 6 / 12 months) with rent breakdown
- Full registration form with input validation:
  - Mobile number (10 digits, valid starting digit)
  - Email (must be lowercase `@gmail.com`)
  - Aadhaar number (12 digits)
  - Pincode (6 digits)
  - Birthdate (with leap year & days-in-month logic)
- Separate flows for **working professionals** vs **students**
- Auto-generated Resident ID in the format `25ELG<Room><Bed>`
- Final registration summary/receipt display

### 🔑 Resident Module
- Login via Resident ID + password
- Forgot password flow (verifies via registered Gmail)
- **Services menu**: Internet plan, meal timetable, housekeeping, laundry, electricity, water
- **Support/Ticketing menu**: Internet issues, food complaints, room/washroom/common area issues, laundry, cleanliness, security — each generates a **random support ticket number**

### 🏢 Core Logic
- Rooms 101–120 → 2-sharing, 201–215 → 3-sharing, 301–310 → 4-sharing
- Auto-incrementing room/bed counters track occupancy and prevent double booking
- "Rooms fully booked" handling once capacity is reached
- Robust input handling (`InputMismatchException` caught for all numeric menus)

## 🛠️ Tech Stack

- **Language:** Java
- **Concepts used:** Classes & objects, static variables (shared room counters), `Scanner` for I/O, nested loops/switch-case for menu navigation, exception handling, string validation logic

## 📂 Project Structure

```
house.java
 ├── class Resident   → Login, services & support ticketing for existing residents
 ├── class Guest      → Facility display, room booking, registration flow
 └── class house      → main() — entry menu (Resident / Guest / Exit)
```

## ▶️ How to Run

```bash
javac house.java
java house
```

Follow the on-screen menu prompts to simulate either a **Resident** or **Guest** journey.

## 📖 Sample Flow (Guest)

1. Choose `2` for Guest
2. View facilities & pricing
3. Choose room type (2/3/4 sharing) → get auto-assigned Room & Bed number
4. Select a contract duration → see rent breakup
5. Fill registration details (with validations)
6. Get final registration summary with your unique Resident ID

## 🎓 About This Project

Built as a **Semester 1 project** for the Computer Engineering course at LJ University — an early hands-on project applying core Java (OOP basics, control flow, and I/O handling) to a real-world-style booking & support system.

## 👨‍💻 Author

**Dhyan** — [Dhyan-17](https://github.com/Dhyan-17)
