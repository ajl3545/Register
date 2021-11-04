# Register
A Starter project for a Store Register Application

# Setup
1. Download Mysql community server and workbench
https://dev.mysql.com/downloads/
Make sure during installation and setup that you make the username and password simple and easy to remember. This should be for development purposes. You will need these values later. The DatabaseDriver.java file has a line that includes my database name "mydatabase" and my username "root" and my password "lamarche". You're going to have to change these values to the ones you provided during setup.
These files will be useful for when you want to test sql statements and add to the databases manually.

2. Download intelliJ
https://www.jetbrains.com/idea/download/#section=windows
Start the trial or set up account through school
You can also use eclipse

3. Create a Maven Project. Under the project settings / creation menu, you can select a "Maven" Project
Maven allows you to create dependencies. These dependencies are simply just libraries. We define our
dependencies in the auto-generated pom.xml file. I have already included the dependency for mysql-connector/j.

4. Run the code. I have a sample running that pulls from a database I already created.
