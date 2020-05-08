# Creating a new remote Git repository "your own notes"

1. Go to your profile in github
1. Go to drop down menu on the main tool bar
1. > Select "Your repositories"
1. >Select "New"
1. >Capture Repository Name "My-Notes"
1. >Update the description
1. >Select the private radio button
1. >Select Initialize this repository with a README  
1. >Select create repository
1. The web page will reload with the information you have captured
1. >Select the drop down button "Clone or download"
1. >Copy the values in the test box and save it to a wordpad or notepad doc as you will need the values for the next excise 

# Clone your repo to your hard drive

1. Open the Terminal
1. Create a working directory for eg `mkdir -p ~/github/` and `cd ~/github/` into it
1. Execute the command `ls -al` "No files displayed in the  directory"
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
	new file:   File1

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
   4e960cf..ade1b65  master -> master

1. Execute the command `git status` your result will be    
On branch master
Your branch is up to date with 'origin/master'.

nothing to commit, working tree clean

# Files pushed from local Git repository to remote Git repository 

1. Go to your profile in github
1. Select your New Repository XXXXgithub/My-Notes
1. In the <> Code tab you will see the File1
1. Your branch is `Branch:master` and `New pull request` 

