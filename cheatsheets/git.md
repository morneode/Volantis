# Git

- Watch these videos:
  - [Learn Git](https://www.youtube.com/watch?v=IHaTbJPdB-s&feature=youtu.be)
  - [Git tutorial part 1](https://www.youtube.com/watch?v=9GKpbI1siow)
  - [Git tutorial part 2](https://www.youtube.com/watch?v=n-p1RUmdl9M)
- More references:
  - [basic git commands with examples](https://rubygarage.org/blog/most-basic-git-commands-with-examples)

## Cheatsheet

`<parameter>` indicates a parameter you need to specify

**bold text** is used to show if the command connects to the remote or not

`repo` : is basically a folder, with files, which also contains the entire history of said folder. So a _git repo_ is basically a _git directory/folder_ i.e. a folder which contains the `.git` folder

> A repository is simply a place where the history of your work is stored. It often lives in a .git subdirectory of your working copy - a copy of the most recent state of the files you're working on. --

`HEAD` : the most recent commit

### Help commands

`git help` : shows help regarding which commands are available

`git <command> help` : shows help of a specific command. for e.g. `git status help`

### Initializing commands

`git init` : initialises a directory to become a working git repository. It creates a `.git/` folder and allows git commands to function **local**

`git clone <ssh_url/https_url>` : get a repo from remote, initialises a directory for it (normally with the same name),sets your **remote** to the point to the cloned remote **remote -> local**

### Commiting commands

`git add <specific file/folder/or use an option>` : adds the file to the staging area, i.e. ready for committing **local**

`git commit -m <message>` : commit staged files with message **local**

### Branching commands

`git branch <branchname>` : creates a branch from current HEAD with the name \<branchname> **local**

`git merge <branch>` : merge \<branch> into current branch **local**

### Status commands

`git status` : shows status of local repo **local**

`git diff` : shows current changes **local**

`git log` : shows the history (commits) of your repo, the hashes of each commit, the HEADs of the branches, up to your latest commit **local**

### Checkout commands

`git checkout -- .` : disregard local changes **local**

`git checkout <branchname>` : checks out that branch **local**

`git checkout -b <branch>` : creates new branch \<name> and checks it out that branch **local**

### Syncing commands

`git push` : syncs to remote (typically called origin) **local -> remote**

`git pull` : syncs from remote (typically called origin) **remote -> local**

### Modifying where your local repo's remote points to

`git remote add <origin> <URL>` : adds a new remote called \<origin> which points to \<URL>

`git remote -v` : shows info about remote

### Fetch state from the remote

`git fetch` : get state from remote **remote -> local**

`git rebase <branch>` : replays your commit on \<branch\>

## Github

- Forking a repo:
  This will copy a repo to your own github account, which you can clone.
  - This will allow you to work without having direct access to the repo.
  - Any changes you want to propose, will have to be done via a PR
