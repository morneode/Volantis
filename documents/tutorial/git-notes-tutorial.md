# Creating "your own notes" Git Repository

If you want to get started with GIT, its always a good idea to have your own space where you can experiment with it. This tutorial will show you how to create your own Notes Repository, where you can create and edit your own notes.

## Prerequisites

- You should have a github account

## Steps

1. Open Github.com in browser
2. ADD PICTURE HERE - and

   1. Resize to make it cover only half over your screen
   2. Open "Terminal" and Resize to make it cover 1/4 of your screen,
   3. Open "Finder" and Resize to make it cover the last 1/4 of your screen

3. Login into Github
4. Go to your profile in github
   > Click the _Dropdown Arrow_ next to your Profile icon (Extreme right of your github website)
5. Click "Your repositories"
6. Click "New"
7. Add a Repository name of your choice E.g. my-own-notes
8. Update the description if you want to (OPTIONAL)
9. Select the "Private" radio button (The one with the `Lock`)
10. Select "Initialize this repository with a README" _checkbox_
11. Click the "Create repository" _button_
12. The web page will reload with the information you have captured
13. > Select the drop down button "Clone or download"
14. > Copy the values in the test box and save it to a wordpad or notepad doc as you will need the values for the next excise

# Clone your repo to your hard drive

1. Open the Terminal
1. Create a working directory for eg `mkdir -p ~/github/` and `cd ~/github/` into it
1. Execute the command `ls -al` "No files displayed in the directory"
1. Execute the command `git clone git@github.com:xxxxgithub/My-Notes.git` in the current directory
1. Execute the command `ls -al` "A My-Notes directory is displayed in this directory"
1. Execute the command `cd My-Notes` "A README.md is displayed in this directory"
1. Execute to command `git status` your result will be `fatal: not a git repository (or any of the parent directories): .git`
1. Execute the command `git init` your result will be `Initialized empty Git repository in /Users/mahomsl/github/.git/`
1. Execute the command `ls -al` "A README.md and a .git file will be displayed in this direcory"
1. Execute the command `git status` 'Your results'

   On branch master

No commits yet

Untracked files:
(use "git add <file>..." to include in what will be committed)
My-Notes/

nothing added to commit but untracked files present (use "git add" to track)

1. You are currently on your local master branch "To push a File to your remote master branch"
1. Execute the command `touch File1` "An empty File will be created"
1. Execute the command `vi File1` "Edit this file and save the details captured"
1. Execute to command `git status` your result will be
   On branch master
   Your branch is up to date with 'origin/master'.

Untracked files:
(use "git add <file>..." to include in what will be committed)
File1

nothing added to commit but untracked files present (use "git add" to track)

1. Execute the command `git add`
1. Execute the command `git status` your result will be
   On branch master
   Your branch is up to date with 'origin/master'.

Changes to be committed:
(use "git restore --staged <file>..." to unstage)
new file: File1

1. Execute the command `git commit File1`
1. Execute the command `git status` your result will be
   [master ade1b65] Adding File1 to My-Notes Repository :-)
   1 file changed, 6 insertions(+)
   create mode 100644 File1

1. Execute the command `git status` your result will be
   On branch master
   Your branch is ahead of 'origin/master' by 1 commit.
   (use "git push" to publish your local commits)

nothing to commit, working tree clean

1. Execute the command `git push File1` your result will be
   Enumerating objects: 4, done.
   Counting objects: 100% (4/4), done.
   Delta compression using up to 12 threads
   Compressing objects: 100% (3/3), done.
   Writing objects: 100% (3/3), 1014 bytes | 1014.00 KiB/s, done.
   Total 3 (delta 0), reused 0 (delta 0)
   To github.com:saminagithub/My-Notes.git
   4e960cf..ade1b65 master -> master

1. Execute the command `git status` your result will be  
   On branch master
   Your branch is up to date with 'origin/master'.

nothing to commit, working tree clean

# Files pushed from local Git repository to remote Git repository

1. Go to your profile in github
1. Select your New Repository XXXXgithub/My-Notes
1. In the <> Code tab you will see the File1
1. Your branch is `Branch:master` and `New pull request`
