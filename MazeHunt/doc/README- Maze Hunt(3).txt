Maze Hunt
Authors: Anika Ummukulsum, Faith Dominique, Saloni Nadarajan
Revision: May 24, 2021


Introduction: 
Our program is a multiplayer scavenger hunt maze where you are given clues along the way as you progress through the maze. The clues tell you where the next clue is found and eventually once the proper number of clues are found, the exit of the maze is revealed. There are 2 players, a cat and a mouse and there are a number of tasks that hold clues to be completed. The mouse is trying to find and solve all the clues before getting eaten up by the cat and the cat wants to eat the mouse and not let the mouse finish the maze. We wrote this program because we really enjoy maze games and “who done it” scavengers and so we wanted to combine the 2 to make a scavenger hunt maze but with 2 players to interact and duel with each other. We also liked the idea of competition games between two players which is why we have a cat character whose goal is to chase down the mouse and try to kill it. The story of the game is that a mouse is in an abandoned maze and they don’t know how they got there. The cat doesn’t like visitors in their maze and so they want to try and kill the mouse out of anger. The mouse wants to get out of the maze as soon as possible since before getting bitten by the cat and dying.The rules of the game is that the player needs to go in order of the clues and cannot skip clues to their convenience since the next clue only gets revealed on the maze once the last clue has been solved. The ultimate goal of the game is for the mouse to find and solve all of the clues so that the exit of the maze is revealed and so that the mouse can exit the maze safely and go back home. 


People who would want to use our program are those that like to problem solve and challenge themselves through different riddles and/or puzzles. Our game presents challenging clues that get harder with each clue as the player progresses through. The primary features of our game are that there are hidden clues on the maze that need to be solved throughout the maze, the player (mouse) can pick up “diamonds” along the way that can be used later on to slow down the cat when trying to solve a clue or navigate through the maze to prevent themselves from being eaten up. The player (mouse) can also pick up super boosts that they find on the maze that makes them speed up and go faster so that they can run away faster from the cat. More features include switching windows to solve the clues and also integrating the clues into the actual maze and not just having obvious circles on the grid.




Instructions: 
The cat will be controlled using the WASD keys on the keyboard and the mouse will be controlled using the arrow keys on the same keyboard. Places you will need to click include the startup menu to start the game, a clue on the maze to start solving the clue, buttons that will appear on the pop up windows to allow the player to progress or choose different actions against the cat, and diamonds that are present on the maze for the mouse to slow down the cat. In the beginning of the game a startup window will appear asking players to welcome players to the game and then they will be directed to start the game or press on a button for help. The help button will lead to a window of how to play the game and the different rules.Once the player starts the game, the players will start navigating through the maze. Once the mouse arrives at a clue a new window will appear directing the mouse to solve whatever riddle or puzzle that it has and then the clue for where the next clue is will be revealed and displayed. Once the mouse has figured out and solved all the clues, the exit of the maze will open, otherwise the exit of the maze is always closed and players do not know where it is. Actions do need to be taken in certain order in the sense that players need to first enter through the welcome screen and then enter the game to start playing, and the mouse has to solve the clues in order.




Features List (THE ONLY SECTION THAT CANNOT CHANGE LATER):
Must-have Features:
[These are features that we agree you will definitely have by the project due date. A good final project would have all of these completed. At least 5 are required. Each feature should be fully described (at least a few full sentences for each)]
* The biggest main feature of the game is that this game is a multiplayer game and so 2 people can play at one given time against each other using different parts of the keyboard to control their characters. 
* Everytime the mouse picks up a super boost, the mouse’s speed will increase. For example, if the mouse’s initial speed is around 15 pixels per second, when the mouse picks up a super boost, the mouse’s speed will be increased to around 25 pixels per second.
* When the mouse arrives at the next clue, a pop up window will appear that prompts the mouse to either solve a riddle or puzzle related to the maze that will reveal where the next clue is located. In the pop up window the mouse will have to solve puzzles/riddles that are related to the maze in order for the location of the next clue to be revealed.
* Everytime the mouse picks up a diamond, the cat’s speed decreases. For example if the cat is traveling at around 10 pixels/sec, when the mouse picks up a diamond and decides to activate it the cat’s speed will be reduced to 5 pixels/second for around 15-30 seconds. The mouse can choose how long the cat will be at the speed with the minimum time being 5 seconds and the maximum time being 35 seconds.
* The clues will be integrated to be part of the actual maze and not random circles lying around. When the player solves the riddle/puzzle that reveals where the next clue is, the next clue will be lit up/change color on the maze to show where the player should go. The exit will also not be revealed until the very last clue is found, once the last clue is solved the exit will actually be opened and once the player exits the game an end game pop up screen will appear summarizing the player’s journey throughout the maze and their achievements.


Want-to-have Features:
[These are features that you would like to have by the project due date, but you’re unsure whether you’ll hit all of them. A good final project would have perhaps half of these completed. At least 5 are required. Again, fully describe each.]
* Have players be able to type in answers to riddles/puzzles for the clues instead of just pressing buttons. Having a text box where players will enter text in the beginning of the game where they can enter their names.
* Allow players to choose from multiple different characters instead of just either a mouse or cat. Have a scroll down menu in the start that allows them to pick.
* Allow players to interact with items in the maze. If there’s a box, players can select a number button on their keyboard to open it. Being able to have players interact with objects, allows the game to be more fun when looking for clues. 
* Sounds that are played when different items are picked up, actions taken, and achievements unlocked
* Treasure chest that the mouse unlocks when they complete so many clues in a certain amount of time, the treasure chest will allow the mouse to choose either superboosts or diamonds as a reward.
* Different layout/maps/location from which the player can choose. There will be a different window that pops up when the player clicks on location. This window will have all the different locations that are available, from which the player can choose their preferred location.
Stretch Features:
[These are features that we agree a fully complete version of this program would have, but that you probably will not have time to implement. A good final project does not necessarily need to have any of these completed at all. At least 3 are required. Again, fully describe each.]
* Have different levels of the game where with each level the maze gets more and more complex and the number of clues and level of easiness of the clues increase. This could be something that the player can choose in the beginning of the game (choose the level they want to play) or something that occurs after the mouse successfully exits the maze( player will progress to next level) 
* Have a leaderboard where the fastest times that maze was completed is displayed.
* Have a chat box where the player can chat with the other player during the game. 




Class List:
[This section lists the Java classes that make up the program and very briefly describes what each represents. It’s totally fine to put this section in list format and not to use full sentences.]
* Startup Window class, the beginning window of the game
   * Game title, play button, help button
* Help Class
   * where the instructions for the game and rules are located
* Maze class
   * where the maze is constructed and built
   * Players, super boosts, and diamonds are also displayed in this class
* Sounds class
   * where different sounds are played for different actions made by the players
* Clue 1, Clue 2, Clue 3, Clue 4, Clue 5, Clue 6, Clue 7, Clue 8 class
   * where the information, question, and answer for the clues are displayed
* ThankYou class
   * Where the thank you screen pops up and an exit button is displayed.
* WrongAnswer, WrongAnswer2, WrongAnswer3, class
   * Contains the screen that pops up when the user clicks on the wrong answer for the clue1.
* YouLose class
   * Contains the screen that pops when the player loses the game and an exit button.
* Clues class
   * This class contains the different clues that will be used in the game.
* Keyboard Press
   * Class that was an answer to a clue
* Screen, ScreenSwitcher
   * Dynamically switch between different screens
   * Code heavily borrows by Mr. Shelby
* End screen class
   * where the end of the game card is displayed 




Credits:
* Anika
   * Added javadoc comments
   * Worked ReadMe and UML Diagram
   * Worked on Clue1, Clue2, Clue4, 
   * Added and worked on Clue5, Clue 7 classes.
   * Added and worked on ThankYou
   * Added and worked on YouLose.
   * Added and worked WrongAnswer, WrongAnswer2, WrongAnswer4, WrongAnswer5 classes
   * Worked on the help class
   * Edited the images used for the mouse and cat.
   * Worked on the DrawingSurface to correctly show different screens.
   * Added a few screens to the ScreenSwitcher class.
   * Worked on collision detection on the Maze class.
   * Worked on the Keyboard Press class
   * Worked on the Mouse and Cat class
* Faith
   * Created Drawing Surface and Startup (and code)
   * Created jar file and javadoc files
   * Added javadoc comments
   * Worked on ReadMe and UML diagram
   * Worked on the creating and adding to the Help class
   * Added and worked on the Clue1, and Clue 3, Clue 5, Clue 6, Clue 8 classes
   * Worked on the Maze class to detect collisions between the rat and the maze walls so that the rat doesn’t overlap onto the lines, also made the feature so that each clue pops up and lights up on the maze as you find the clues.
   * Worked on the startWindow that contained the welcome screen for players to navigate through
   * Worked on the Mouse and Cat class
   * Worked on WrongAnswer, WrongAnswer3, WrongAnswer2, WrongAnswer6 class
   * Set up the drawing surface class and also edited it as we progressed through
   * Added screens to the ScreenSwitcher class to be able to dynamically switch between screens like the maze and clues


* Saloni
   * Worked Readme and UML Diagram
      * Updated whole UML Diagram for Beta Build
   * Created classes (and added fields, constructors, and methods)
   * Added javadoc comments
   * Worked on Maze Class
      * Collision detection and adding the players
   * Created all the clues
   * Found and added cat and rat images into Maze Hunt
   * Worked on Clue2, Clue3, and Clue4, Clue 6, Clue 7, Clue 8
   * Worked on the Mouse and Cat class
   * Worked on WrongAnswer2, WrongAnswer3, WrongAnswer5, WrongAnswer6 class
   * Coded History class (background information with continue button)
   * Worked on the DrawingSurface to correctly show different screens.
   * Worked on the help classes.
   * Worked on YouLose class
   * Worked on the Keyboard Press class


* Outside resources as of May 24th:
   * Processing and Processing jar/library
      * Looked at examples for checking detection and adding images
      * Looked at examples for using the timer
   * Java library
      * Used the rectangle, color, and Line 2D  class throughout 
   * Heavily borrowed code from Mr. Shelby’s screen switching demo and also using buttons in those screens. This was used in our project to switch between the different classes and screens
   * Mr. Shelby’s help to make it so that the players don’t overlap onto the maze lines/walls
   * Shapes.jar - used Faith’s jar and imported it into our project to use 
   * Cat and Rat images
      * Cat: https://www.nicepng.com/ourpic/u2w7a9i1w7w7y3e6_black-cat-small-eyes-clip-art-cartoon-cat/ 
      * Rat: https://www.pngkey.com/detail/u2q8r5e6y3t4u2w7_mouse-clipart-maus-clipart/ 
   * Referenced Mr. Shelby’s startup class


Note: More than 30 hours (with zoom logs) were spent on Zoom collaborating to work on the project. No code/classes were worked on without the group meeting to discuss changes and all code was done during the meetings.