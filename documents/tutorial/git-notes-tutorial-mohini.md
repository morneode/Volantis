# Create Private Repo on Github (Remote Copy)

Redirect to the Dashboard with showing information about your Private Repo

# Clone Private Repo to Git on your machine (Local Copy)

Change working directory to point to the location of where the all your code lives i.e. `cd ~/Mycode`
Preparing to create a local copy of git
Type `pwd`
To confirm that you pointing to the intended location
Type `mkdir Test-Repo` (Type your respository name instead of Test Repo)
This creates a folder within the location of choice (i.e. code)
Type `ls -al`
This lists all the folders within the location of choice i.e. See your respository name appear on the list)
Go back to Github
Click the "Clone or Download" button
Click "Copy SSH"
Go Back to the Terminal
Type `git clone (paste SSH)`
The remote repo has now been copied to your local repo
Type `git status`
fatal: not a git repository (or any of the parent directories): .git
Root folder .git has been created everytime you make changes to "git" and want to push it to your remote copy than it will appear in the ".git" folder
