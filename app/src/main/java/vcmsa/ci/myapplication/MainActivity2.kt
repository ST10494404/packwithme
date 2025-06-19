1.	The purpose of the app.
My HelpMePack app helps the user to pack when going for a vacation or even when the user is going to visit their relatives. Items can be grouped into logical categories like Clothing, Electronics or Toiletries. This structure makes packing more intuitive and avoids the chaos of a long, unsorted packing list. Including quantity features helps users track precise amounts and monitor luggage weight limits which is useful for avoiding overweight baggage fees.


2.	Design Considerations.
Simplicity.
The app does not need long sign-ups when using it. On the first screen, the user gets to type their packing items so that they can get to view their packing. The app has a clean design and the app has a typing bar where they get to add items on their packing list, which they would like to pack. There is a simple layout on the logo of the app, the app data words and simple and clear buttons too.
Consistency.
The app has clear colours, fonts and buttons. The app ensures features behave predictably across different screens. The words on the app has good spacing, margins and image sizes are standardized.
Readability.
Legible fonts were used and consistent font size was also used for my app name. The app buttons and app names stands with enough contrast. I avoided decorations. The app name font is large for easy scanning.
Feedback.
The app provides feedback when the user is done typing their own data, after that the user has to press the view packing list button to view their packing list.
Placement.
My app name is at the top of the screen, then the packing app logo follows. The users items that where typed will appear on the second screen when the user pressed the view packing list button. The app buttons are at the botton for the screen after the users own data.

GitHub Actions:
Set up GitHub Actions to automatically run tests and build your code whenever changes are pushed to the repository.
Create a .github/workflows directory in your project repository.
Inside this directory, create YAML files defining your GitHub Actions workflows for testing and building.

Set Up Automated Testing:
Create a GitHub Actions workflow (.github/workflows/tests.yml) to run tests automatically on every push.
Sample GitHub Actions workflow for testing:

yaml
name: Run Tests

on: [push]

jobs:
test:
runs-on: ubuntu-latest

steps:
- name: Set up JDK
uses: actions/setup-java@v2
with:
distribution: 'adopt'
java-version: '11'

- name: Check out code
uses: actions/checkout@v2

- name: Build and test
run: ./gradlew test

Set Up Automated Build:
Create a GitHub Actions workflow (.github/workflows/build.yml) to build the APK automatically on every push.
Sample GitHub Actions workflow for building:

yaml
name: Build APK

on: [push]

jobs:
build:
runs-on: ubuntu-latest

steps:
- name: Set up JDK
uses: actions/setup-java@v2
with:
distribution: 'adopt'
java-version: '11'

- name: Check out code
uses: actions/checkout@v2

- name: Build APK
run: ./gradlew assembleDebug


Version Control with GitHub:
Create a New GitHub Repository:
Go to the GitHub website (https://github.com/) and sign in to your account.
Click on the "+" icon in the top right corner and select "New repository".
Give your repository a name, add a description if you want, and choose whether it should be public or private.
Click on the "Create repository" button.
Initialise the Repository with a README File:
After creating the repository, you'll see an option to "Initialize this repository with a README". Check this option to create a README file.
Click on the "Create repository" button to finalize the creation of the repository.
Commit and Push Your Project Files to the GitHub Repository:

In Android Studio, go to VCS (Version Control System) -> Import into Version Control -> Share Project on GitHub.
Log in to your GitHub account if prompted, and select the repository you created earlier.
Click on the "Share" button to push your project files to the GitHub repository.
Regularly Commit and Push Your Code as You Make Progress:

After the initial push, continue making changes to your project in Android Studio.
Whenever you make significant progress or changes, commit your changes locally in Android Studio using VCS -> Commit Changes.
Once committed, push your changes to the GitHub repository using VCS -> Git -> Push.

Steps to Create a GitHub Repository from Android Studio
1. Open your Android project in Android Studio.
2. Click on VCS (Version Control System) from the top menu bar.
(If you don’t see VCS, go to File > Settings > Version Control to configure Git.)
3. Select Import into Version Control > Share Project on GitHub.

4. Android Studio will prompt you to:
Login to your GitHub account (if you haven't already).
Enter a repository name and description.
Check the box to include a README (if available).
5. Once you hit Share, Android Studio will:
Initialize a local Git repository.
Create the new repository on your GitHub account.
Add a README (if you selected it).
Push your local project to the GitHub repository.

If you skipped adding a README during the repository creation:
Go to File > New > File, name it README.md
Add content to describe your project.
Commit and push the file to GitHub.

Regularly Commit and Push Your Code as You Make Progress:
After the initial push, continue making changes to your project in Android Studio.
Whenever you make significant progress or changes, commit your changes locally in Android Studio using VCS -> Commit Changes.
Once committed, push your changes to the GitHub repository using VCS -> Git -> Push.

Refer to GitHub's documentation and tutorials on GitHub Actions to learn how to create workflows specific to your testing and build requirements.
Test your workflows by pushing changes to your repository and observing the actions running in the "Actions" tab on GitHub.
ReadMe file
The README file on GitHub is a markdown file. To format your ReadMe word file to an .md file use a converter. You will be able to open the .md file with WordPad, copy the formatted content, and paste it in the GitHub README file.
Markdown (GitHub) Looking for a free text converter? Look no more, upload your Word files and convert them to GitHub-Flavored Markdown files.


https://alldocs.app › convert-word-docx-to-markdown

These are just if you are interested in learning more (not necessary for preparing for the practicum)
Resources for Beginners:
https://www.youtube.com/watch?v=fQLK8Ib_SKk
https://www.youtube.com/watch?v=d0uith-LE3o
https://www.geeksforgeeks.org/how-to-upload-project-on-github-from-android-studio/
https://www.tutorialspoint.com/git/git_quick_guide.htm
https://www.w3docs.com/learn-git.html
https://docs.github.com/en/actions/learn-github-actions/understanding-github-actions
https://github.com/marketplace/actions/automated-build-android-app-with-github-action

https://github.com/IMAD5112/Github-actions/blob/main/.github/workflows/build.yml
GitHub Guides: GitHub provides comprehensive guides and documentation for beginners to learn about version control and GitHub workflows. You can find them at https://guides.github.com/.
GitHub Learning Lab: GitHub Learning Lab offers interactive tutorials and courses on Git and GitHub. You can access it at https://lab.github.com/.
Android Studio Tutorials: Android Studio's official documentation and tutorials cover various topics, including project setup, version control integration, and testing. You can find them at https://developer.android.com/studio/intro.
Android Testing Documentation: Android Developer documentation provides guides and resources for testing Android apps. You can explore it at https://developer.android.com/training/testing.
GitHub Actions Documentation: GitHub Actions documentation provides detailed information on setting up automated workflows. You can find it at https://docs.github.com/en/actions.
By following these steps and utilizing the provided resources, you can effectively implement version control with GitHub and testing for your Android app developed in Android Studio on Azure.

Markdown (GitHub) Looking for a free text converter? Look no more, upload your Word files and convert them to GitHub-Flavored Markdown files. Yes, it's that easy.

https://alldocs.app › convert-word-docx-to-markdown

git init
git remote add origin >enter the code u copied from github repository
git add .
git commit -m “initial commit”
git push origin master(if master doesn’t work use main)
