# Git Interactive Tutorial

### Initialising: Create a git repo

1. Create a working directory. (`mkdir -p ~/tmp/git-tutorial`) and `cd ~/tmp/git-tutorial` into it
1. Check the current working directory using: `pwd`
   > It should print out something like: `/home/YOURNAME/tmp/git-tutorial`
   > Is this a git repo yet?
1. Lets see if it is a git repo: `git status`
   > It is not a git repository -> there is not `.git` folder in this directory...
1. Lets list the contents of this folder: `ls -al`
   > you should see that the directory is quite empty
1. Lets make this directory a git repo: `git init`
   > This initialises the folder to be a git repo
1. Lets see what is in this directory now: `ls -al`
   > You should see a folder named `.git`
1. We can also now start using git commands. Lets check the status of this repo: `git status`

**Well done, you've created a git repo!! Lets add some files to this repo!!**

### Commiting: Lets commit some files to it

1. Create a file: `touch master-file.txt`
1. Lets stage the file in order to commit it: `git add master-file.txt`
   > Before you can commit files, you will need to stage it, otherwise git will tell you that nothing has been staged for commiting. By having a staging area, git allows you to select which files you want to commit together, and you can then give a message that describes this change.
1. Now commit the file: `git commit -m "added master-file.txt"`
   > generally we give descriptive messages as to what this change entails.
1. Have a look at the current history of the repo: `git log --graph --decorate --all`
   > `git log` shows the history of the repo. It has various flags that you can pass it to determine how it shows the history. Note: you should see your commit, with its ID, and your message

### Branching: Branches is through the roof

1. Lets create a new branch called 'branch-one' and also switch to it: `git checkout -b branch-one`
   > this would create the branch from the _HEAD_ of the _master_ branch. The HEAD of the master branch, is just another name for the latest commit of the current branch
1. Lets check the status of the repo: `git status`
   > you should see that git tells you, that you are now on the _branch-one_ branch
1. Lets check what files are currently in the directory: `ls -al`
   > you should see that the `master-file.txt` is still present. This should also confirm to you that you have created your new branch (branch-one) from the HEAD of the master branch.
1. Create a new file: `touch branch-one-file1.txt`
1. Lets check the directory contents: `ls - al`
   > You should see your new file listed as well.
1. Lets check the status of the repo: `git status`
   > You should see that git also recognises the new file as an untracked file.
1. Stage the file. This means we are putting the file in the staging area, i.e. _ready to commit_: `git add branch-one-file1.txt`
1. Lets check the status of the repo: `git status`
   > You should see that the file is now ready to be committed.
1. Commit the file: `git commit -m "added a branch-one-file1.txt file"`
   > You should see the output `1 file changed ...`
1. Check the status of the repo: `git status`
   > The file should not be listed any more... You should see `Nothing to commit`
1. Edit the file `branch-one-file1.txt` by adding your name to it.
1. Also create a new file: `touch branch-one-file2.txt`
1. Check the contents of the directory: `ls -al`
   > you should see the `branch-one-file2.txt`, the `branch-one-file1.txt` and the `master-file.txt`
1. Check the status of the repo: `git status`
   > You should see that the file `branch-one-file1.txt` is listed as `modified`, and the `branch-one-file2.txt` is listed as `untracked` or `new files`
1. Commit **both** files with a message that makes sense to you.
   > If the commit fails with `no changes added to commit`, it means you forgot to stage (`add`) your changes

**Good, we've created a branch, and added some files to it**

### Merging: Lets get the feature files available on master

1. Checkout the master branch: `git checkout master`
1. List the files in the current directory: `ls -al`
   > Where are your other files? Don't worry, they are on your other branch!
1. Lets check if they are there: `git checkout branch-one`
1. List the files: `ls -al`
   > Phew! there they are.
1. Checkout master again. Lets get the changes we've made on `branch-one` available on `master`: `git merge branch-one`
   > The `git merge <branchname>` command will merge the mentioned branch name into the currently checked out branch (which is master in our case)
1. List the file contents: `ls -al`
   > You should see all the files now
1. Have a look at the current history of the repo: `git log --graph --decorate --all`
   > You should see your initial commit, along with all of your other commits, your branch, and finally the merge commit, which brought the two branches together

**Congratulations!! You've merged your branch into master**
