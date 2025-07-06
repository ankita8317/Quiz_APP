# Quiz Master - Android Quiz App

A modern, feature-rich quiz application built with Jetpack Compose for Android.

## 🚀 Features

### 📱 **Modern UI/UX**
- Beautiful Material 3 design with dynamic colors
- Smooth animations and transitions
- Responsive layout for different screen sizes
- Dark/Light theme support

### 🎯 **Quiz Categories**
- **General Knowledge** - Test your general knowledge
- **Science** - Explore scientific facts and discoveries
- **History** - Journey through historical events
- **Geography** - Discover the world around us
- **Sports** - Test your sports knowledge

### ⏱️ **Quiz Features**
- **10 Questions per Quiz** - Perfect length for quick learning
- **Multiple Choice Questions** - Easy to answer format
- **Real-time Scoring** - See your score as you progress
- **Progress Tracking** - Visual progress bar
- **Time Tracking** - Monitor your quiz completion time
- **Random Questions** - Different questions each time

### 📊 **Results & Analytics**
- **Score Percentage** - See your performance at a glance
- **Performance Messages** - Encouraging feedback based on score
- **Time Analysis** - Track how long you took
- **Previous Results** - View your quiz history
- **Category Performance** - Track performance by category

### 🎨 **Visual Feedback**
- **Color-coded Answers** - Green for correct, red for incorrect
- **Progress Indicators** - Visual progress through questions
- **Score Icons** - Trophy, medals, and encouraging emojis
- **Gradient Backgrounds** - Beautiful visual design

## 🛠️ Technical Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: MVVM (Model-View-ViewModel)
- **State Management**: Kotlin Flow
- **Navigation**: Compose Navigation
- **Material Design**: Material 3
- **Minimum SDK**: Android 24 (Android 7.0)
- **Target SDK**: Android 35

## 📁 Project Structure

```
app/src/main/java/com/example/quiz/
├── data/
│   └── QuizData.kt              # Quiz questions and categories
├── ui/
│   ├── screens/
│   │   ├── HomeScreen.kt        # Welcome screen
│   │   ├── CategoryScreen.kt    # Category selection
│   │   ├── QuizScreen.kt        # Main quiz interface
│   │   └── ResultsScreen.kt     # Results and analytics
│   ├── theme/
│   │   ├── Color.kt            # Color definitions
│   │   ├── Theme.kt            # Material 3 theme
│   │   └── Type.kt             # Typography
│   └── viewmodel/
│       └── QuizViewModel.kt     # State management
└── MainActivity.kt              # App entry point
```

## 🎮 How to Play

1. **Start Quiz** - Tap "Start Quiz" on the home screen
2. **Choose Category** - Select from 5 different quiz categories
3. **Answer Questions** - Read questions and select your answer
4. **Submit & Continue** - Submit your answer and move to the next question
5. **View Results** - See your score, time, and performance analysis
6. **Try Again** - Restart the same category or try a different one

## 🏆 Scoring System

- **90%+** - 🏆 "Excellent! You're a quiz master!"
- **80-89%** - 🥇 "Great job! You know your stuff!"
- **70-79%** - 🥈 "Good work! Keep learning!"
- **60-69%** - 🥉 "Not bad! Room for improvement!"
- **Below 60%** - 📚 "Keep studying! You'll get better!"

## 🎨 Design Features

### **Color Scheme**
- **Primary**: Blue (#2196F3)
- **Secondary**: Green (#4CAF50)
- **Tertiary**: Orange (#FF9800)
- **Success**: Green (#4CAF50)
- **Error**: Red (#F44336)

### **UI Components**
- **Cards** - Rounded corners with elevation
- **Buttons** - Material 3 button styles
- **Progress Bars** - Linear progress indicators
- **Icons** - Material Design icons
- **Typography** - Consistent text hierarchy

## 🚀 Getting Started

### Prerequisites
- Android Studio Hedgehog or later
- Android SDK 24+
- Kotlin 2.0+

### Installation
1. Clone the repository
2. Open in Android Studio
3. Sync Gradle files
4. Run on device or emulator

### Building
```bash
./gradlew assembleDebug
```

## 📱 Screenshots

The app features four main screens:

1. **Home Screen** - Welcome with app features
2. **Category Screen** - Grid of quiz categories
3. **Quiz Screen** - Question interface with progress
4. **Results Screen** - Score analysis and statistics

## 🔧 Customization

### Adding New Questions
Edit `QuizData.kt` to add new questions:
```kotlin
Question(
    id = 51,
    question = "Your question here?",
    options = listOf("Option A", "Option B", "Option C", "Option D"),
    correctAnswer = 0, // Index of correct answer
    category = "Your Category",
    difficulty = "Easy"
)
```

### Adding New Categories
Add to the categories list in `QuizData.kt`:
```kotlin
QuizCategory(
    name = "Your Category",
    description = "Category description",
    icon = "🎯",
    questionCount = 10
)
```

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly
5. Submit a pull request

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 🙏 Acknowledgments

- Material Design 3 guidelines
- Jetpack Compose documentation
- Android development community

---

**Quiz Master** - Learn, Test, Improve! 🧠✨ 