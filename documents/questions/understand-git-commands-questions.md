# Understand Git Commands Questions

Complete the questions below, by editing this file. Please commit often, to your branch, and then create a PR for review...

You may reference the videos, the cheatsheet or even google to complete these questions. You can even use this project to play with these git commands.

1. Does a commit connect to the remote?
No, it just means that Git will start tracking changes made on that file. Changes made will be save to the Local copy of Git.

2. Does a push connect to the remote?
Yes, a push connects to remote. Ensure that the location of where the changes will be pushed to should be stated. i.e. git push origin master.

3. What is a git repo even?
A git repo is version control system where by each commit is saved. When needed changed can be reverted to show a previous version whereby the code was in a good state.

4. How do you stage a file, and what does it mean?
To Staging a file means that a file is being prepared so that Git is able to track the changes made.This is for bother new and old files. Chose when changes should be added to git: For 1 new file `git add <file name>` or for multiple files `git add .`
Add a message describing the commit: git commit -m <Message>

5. How do you unstage a file?
git reset --hard HEAD^

6. What is the output of `git log`?
It is the changes the have taken place in a particular file or branch

7. How is a git repo initialised?
A git repo can be initialised by typing a few commands:
`cd <location>` - This is the location you would like git to live
`mkdir Git` - Create a folder
`ls -al` - This lists all the folders in that directory and should show the "Git folder" as part of it
`git init` - This initialises the folder to be a git repo
`ls -al` - This would list all the files in "Git" Folder and you should see ".git folder"

8. What information will `git status` give you?
Gives you information of your working directory and your staging area

9. What does a git fetch do?
Retrieves all new data from your remote repository and copies it to your local copy

10. A `git pull` can basically be broken down into these git commands:
Retrieves all new data from your remote repository and integrates it to your local copy of git. This can create merge conflicts if your local copy of git and the remote copy has changes which include changes made to the same files on the same lines of code `git pull = git fetch + git pull`.

11. What is a rebase?
`git rebase <branch> `is integrating changes made on the same branch to retrieve the latest changes . What is the difference between a rebase and a pull?

12. How do you view information about the remote config of a git repo?
Remote config is the centralised place for where Git lives and can be accessed by multiple engineers at a time. It does NOT necessarily have the latest version of Git. To be sure that you have the correct version of Git on your machine at a point in time refer to the Remote git.

13. What commands will create a branch called `qa` from `master`
Firstly, ensure you pointing to master `git checkout master` and than create qa branch `git checkout -b qa`

14. Lets say you've made changes which you want to discard, and you have not yet commited them anyway, what command can you use?
`git reset --hard HEAD^`

15. What is the difference between `git merge` and `git merge <branch>`
`git merge` - if changes are made on multiple branches than it would merge all those changes to master at once
`git merge <branch> `- if you would like to only merge changes made on a particular branch

16. What is the git command to change a branch's name locally and remotely? 
`git branch -m <oldname> <newname>` and remotely?

17. If you commit a file, is it commited to your current branch or to master?
If you commit a file it is committed to your current branch locally

18. If you commited a change, but it was for the wrong branch, how can you move the commit?
Don't know