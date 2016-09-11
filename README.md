#A Command line Diablo
It is a interactive command line application which mimic an ARPG game like Diablo.
Coded via Java and use a relational Database.

##Project Structure
* models: All the models needed to map the database table
* services: A service layer wrapper around each model to provide the normal CRUD operations
* utils: Helper class such as ConnectionManager, Graph, custom exception, etc.

##Architecture
* The project starts from the Main class.
* The Main class will generate the database connection and scanner
* Then the Main class will load GameManager class and inject the connection and scanner
* Then execute the methods from GameManager class to make the game running
* The GameManager will wrapper around all the database services class to assemble the main logic
* Database connection is maintained by singleton pattern to make sure we only open one connection.

##Game Procedure inside GameManager Class
1.  display the menu (pickup a hero)
2.  choose an area (all quests in the area will be assigned to the Hero)
3.  battle (kill one monster for completing one quest)
4.  display the result (trigger: die or choose 'quit')
5.  restore all the data back to normal and close the Scanner
