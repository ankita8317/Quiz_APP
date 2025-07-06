package com.example.quiz.data

object QuizData {
    val topics = listOf(
        Topic(
            id = "geography",
            name = "Geography",
            description = "Test your knowledge of world geography",
            questions = listOf(
                Question(
                    id = "geo1",
                    question = "What is the largest ocean on Earth?",
                    options = listOf("Atlantic Ocean", "Indian Ocean", "Pacific Ocean", "Arctic Ocean"),
                    correctAnswerIndex = 2,
                    explanation = "The Pacific Ocean is the largest and deepest ocean on Earth",
                    difficulty = QuizDifficulty.EASY
                ),
                Question(
                    id = "geo2",
                    question = "Which is the longest river in the world?",
                    options = listOf("Amazon", "Nile", "Yangtze", "Mississippi"),
                    correctAnswerIndex = 1,
                    explanation = "The Nile River is the longest river in the world at 6,650 km",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "geo3",
                    question = "What is the capital of Japan?",
                    options = listOf("Seoul", "Beijing", "Tokyo", "Bangkok"),
                    correctAnswerIndex = 2,
                    explanation = "Tokyo is the capital and largest city of Japan",
                    difficulty = QuizDifficulty.EASY
                ),
                Question(
                    id = "geo4",
                    question = "Which desert is the largest in the world?",
                    options = listOf("Sahara", "Gobi", "Antarctic", "Arabian"),
                    correctAnswerIndex = 2,
                    explanation = "The Antarctic Desert is the largest desert in the world",
                    difficulty = QuizDifficulty.HARD
                ),
                Question(
                    id = "geo5",
                    question = "What is the highest mountain in Africa?",
                    options = listOf("Mount Kenya", "Mount Kilimanjaro", "Mount Elgon", "Mount Meru"),
                    correctAnswerIndex = 1,
                    explanation = "Mount Kilimanjaro is the highest mountain in Africa at 5,895 meters",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "geo6",
                    question = "Which country has the most natural lakes?",
                    options = listOf("Canada", "Russia", "Finland", "United States"),
                    correctAnswerIndex = 0,
                    explanation = "Canada has the most natural lakes in the world, with over 2 million lakes",
                    difficulty = QuizDifficulty.HARD
                ),
                Question(
                    id = "geo7",
                    question = "What is the largest island in the Mediterranean Sea?",
                    options = listOf("Cyprus", "Crete", "Sicily", "Sardinia"),
                    correctAnswerIndex = 2,
                    explanation = "Sicily is the largest island in the Mediterranean Sea",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "geo8",
                    question = "Which strait separates Asia from North America?",
                    options = listOf("Bering Strait", "Strait of Gibraltar", "Strait of Malacca", "Strait of Hormuz"),
                    correctAnswerIndex = 0,
                    explanation = "The Bering Strait separates Asia from North America",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "geo9",
                    question = "What is the deepest point in the ocean?",
                    options = listOf("Puerto Rico Trench", "Mariana Trench", "Java Trench", "Philippine Trench"),
                    correctAnswerIndex = 1,
                    explanation = "The Mariana Trench is the deepest point in the ocean at about 36,000 feet",
                    difficulty = QuizDifficulty.HARD
                ),
                Question(
                    id = "geo10",
                    question = "Which country has the most time zones?",
                    options = listOf("United States", "Russia", "France", "Australia"),
                    correctAnswerIndex = 2,
                    explanation = "France has the most time zones due to its overseas territories",
                    difficulty = QuizDifficulty.HARD
                )
            )
        ),
        Topic(
            id = "sports",
            name = "Sports",
            description = "Test your knowledge of various sports",
            questions = listOf(
                Question(
                    id = "sports1",
                    question = "In which sport would you perform a slam dunk?",
                    options = listOf("Football", "Basketball", "Volleyball", "Tennis"),
                    correctAnswerIndex = 1,
                    explanation = "A slam dunk is a basketball move where a player jumps and scores by putting the ball directly through the basket",
                    difficulty = QuizDifficulty.EASY
                ),
                Question(
                    id = "sports2",
                    question = "How many players are there in a standard soccer team?",
                    options = listOf("9", "10", "11", "12"),
                    correctAnswerIndex = 2,
                    explanation = "A standard soccer team has 11 players on the field",
                    difficulty = QuizDifficulty.EASY
                ),
                Question(
                    id = "sports3",
                    question = "Which country won the FIFA World Cup in 2022?",
                    options = listOf("Brazil", "France", "Argentina", "Portugal"),
                    correctAnswerIndex = 2,
                    explanation = "Argentina won the 2022 FIFA World Cup in Qatar",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "sports4",
                    question = "In tennis, what is a score of 40-40 called?",
                    options = listOf("Match Point", "Set Point", "Deuce", "Advantage"),
                    correctAnswerIndex = 2,
                    explanation = "In tennis, a score of 40-40 is called 'Deuce'",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "sports5",
                    question = "Which sport uses a shuttlecock?",
                    options = listOf("Table Tennis", "Badminton", "Squash", "Tennis"),
                    correctAnswerIndex = 1,
                    explanation = "Badminton uses a shuttlecock (also called a birdie)",
                    difficulty = QuizDifficulty.EASY
                ),
                Question(
                    id = "sports6",
                    question = "How many Olympic rings are there?",
                    options = listOf("4", "5", "6", "7"),
                    correctAnswerIndex = 1,
                    explanation = "There are 5 Olympic rings representing the 5 continents",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "sports7",
                    question = "In which sport would you use a 'butterfly' stroke?",
                    options = listOf("Running", "Swimming", "Gymnastics", "Diving"),
                    correctAnswerIndex = 1,
                    explanation = "The butterfly stroke is a swimming stroke",
                    difficulty = QuizDifficulty.EASY
                ),
                Question(
                    id = "sports8",
                    question = "How many players are there in a standard volleyball team?",
                    options = listOf("4", "5", "6", "7"),
                    correctAnswerIndex = 2,
                    explanation = "A standard volleyball team has 6 players on the court",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "sports9",
                    question = "Which country won the most Olympic gold medals in 2020?",
                    options = listOf("China", "United States", "Japan", "Great Britain"),
                    correctAnswerIndex = 1,
                    explanation = "The United States won the most gold medals in the 2020 Tokyo Olympics",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "sports10",
                    question = "In cricket, how many players are there in a standard team?",
                    options = listOf("9", "10", "11", "12"),
                    correctAnswerIndex = 2,
                    explanation = "A standard cricket team has 11 players",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "sports11",
                    question = "Which sport uses a 'puck'?",
                    options = listOf("Lacrosse", "Hockey", "Polo", "Curling"),
                    correctAnswerIndex = 1,
                    explanation = "Ice hockey uses a puck",
                    difficulty = QuizDifficulty.EASY
                )
            )
        ),
        Topic(
            id = "science",
            name = "Science",
            description = "Explore scientific concepts",
            questions = listOf(
                Question(
                    id = "science1",
                    question = "What is the chemical symbol for water?",
                    options = listOf("H2O", "CO2", "O2", "H2"),
                    correctAnswerIndex = 0,
                    explanation = "Water is H2O - two hydrogen atoms and one oxygen atom",
                    difficulty = QuizDifficulty.EASY
                ),
                Question(
                    id = "science2",
                    question = "What is the closest planet to the Sun?",
                    options = listOf("Venus", "Mars", "Mercury", "Earth"),
                    correctAnswerIndex = 2,
                    explanation = "Mercury is the closest planet to the Sun in our solar system",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "science3",
                    question = "What is the hardest natural substance on Earth?",
                    options = listOf("Gold", "Iron", "Diamond", "Platinum"),
                    correctAnswerIndex = 2,
                    explanation = "Diamond is the hardest known natural substance on Earth",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "science4",
                    question = "What is the main component of the Sun?",
                    options = listOf("Helium", "Hydrogen", "Oxygen", "Carbon"),
                    correctAnswerIndex = 1,
                    explanation = "The Sun is primarily composed of hydrogen (about 70%)",
                    difficulty = QuizDifficulty.HARD
                ),
                Question(
                    id = "science5",
                    question = "What is the process by which plants make their food?",
                    options = listOf("Respiration", "Photosynthesis", "Digestion", "Fermentation"),
                    correctAnswerIndex = 1,
                    explanation = "Photosynthesis is the process by which plants convert light energy into chemical energy",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "science6",
                    question = "What is the study of fossils called?",
                    options = listOf("Geology", "Paleontology", "Archaeology", "Anthropology"),
                    correctAnswerIndex = 1,
                    explanation = "Paleontology is the study of fossils",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "science7",
                    question = "Which element has the chemical symbol 'Fe'?",
                    options = listOf("Gold", "Silver", "Iron", "Copper"),
                    correctAnswerIndex = 2,
                    explanation = "Fe is the chemical symbol for Iron (from Latin 'Ferrum')",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "science8",
                    question = "What is the largest organ in the human body?",
                    options = listOf("Heart", "Brain", "Liver", "Skin"),
                    correctAnswerIndex = 3,
                    explanation = "The skin is the largest organ in the human body",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "science9",
                    question = "Which planet has the most moons?",
                    options = listOf("Jupiter", "Saturn", "Uranus", "Neptune"),
                    correctAnswerIndex = 1,
                    explanation = "Saturn has the most moons in our solar system",
                    difficulty = QuizDifficulty.HARD
                ),
                Question(
                    id = "science10",
                    question = "What is the speed of light in a vacuum?",
                    options = listOf("299,792 km/s", "299,792 m/s", "299,792,458 km/s", "299,792,458 m/s"),
                    correctAnswerIndex = 3,
                    explanation = "The speed of light in a vacuum is 299,792,458 meters per second",
                    difficulty = QuizDifficulty.HARD
                )
            )
        ),
        Topic(
            id = "history",
            name = "History",
            description = "Test your knowledge of historical events",
            questions = listOf(
                Question(
                    id = "history1",
                    question = "In which year did World War II end?",
                    options = listOf("1943", "1944", "1945", "1946"),
                    correctAnswerIndex = 2,
                    explanation = "World War II ended in 1945",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "history2",
                    question = "Who was the first President of the United States?",
                    options = listOf("Thomas Jefferson", "John Adams", "George Washington", "Benjamin Franklin"),
                    correctAnswerIndex = 2,
                    explanation = "George Washington was the first President of the United States",
                    difficulty = QuizDifficulty.EASY
                ),
                Question(
                    id = "history3",
                    question = "Which ancient wonder was located in Alexandria?",
                    options = listOf("Colossus of Rhodes", "Lighthouse of Alexandria", "Hanging Gardens", "Temple of Artemis"),
                    correctAnswerIndex = 1,
                    explanation = "The Lighthouse of Alexandria was one of the Seven Wonders of the Ancient World",
                    difficulty = QuizDifficulty.HARD
                ),
                Question(
                    id = "history4",
                    question = "Who painted the Mona Lisa?",
                    options = listOf("Michelangelo", "Leonardo da Vinci", "Raphael", "Donatello"),
                    correctAnswerIndex = 1,
                    explanation = "The Mona Lisa was painted by Leonardo da Vinci",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "history5",
                    question = "In which year did the Titanic sink?",
                    options = listOf("1910", "1911", "1912", "1913"),
                    correctAnswerIndex = 2,
                    explanation = "The Titanic sank on April 15, 1912",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "history6",
                    question = "Who was the first woman to win a Nobel Prize?",
                    options = listOf("Marie Curie", "Mother Teresa", "Jane Addams", "Pearl S. Buck"),
                    correctAnswerIndex = 0,
                    explanation = "Marie Curie was the first woman to win a Nobel Prize in 1903",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "history7",
                    question = "In which year did the Berlin Wall fall?",
                    options = listOf("1987", "1988", "1989", "1990"),
                    correctAnswerIndex = 2,
                    explanation = "The Berlin Wall fell on November 9, 1989",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "history8",
                    question = "Which ancient civilization built Machu Picchu?",
                    options = listOf("Aztecs", "Mayans", "Incas", "Olmecs"),
                    correctAnswerIndex = 2,
                    explanation = "Machu Picchu was built by the Incas in the 15th century",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "history9",
                    question = "Who was the first person to step on the moon?",
                    options = listOf("Buzz Aldrin", "Neil Armstrong", "Michael Collins", "Alan Shepard"),
                    correctAnswerIndex = 1,
                    explanation = "Neil Armstrong was the first person to step on the moon in 1969",
                    difficulty = QuizDifficulty.MEDIUM
                ),
                Question(
                    id = "history10",
                    question = "Which empire was ruled by Genghis Khan?",
                    options = listOf("Ottoman Empire", "Mongol Empire", "Roman Empire", "Byzantine Empire"),
                    correctAnswerIndex = 1,
                    explanation = "Genghis Khan founded and ruled the Mongol Empire",
                    difficulty = QuizDifficulty.MEDIUM
                )
            )
        )
    )
}