# Git

- Watch these videos:
  - [Learn Git](https://www.youtube.com/watch?v=IHaTbJPdB-s&feature=youtu.be)
  - [Git tutorial part 1](https://www.youtube.com/watch?v=9GKpbI1siow)
  - [Git tutorial part 2](https://www.youtube.com/watch?v=n-p1RUmdl9M)
- More references:
  - [basic git commands with examples](https://rubygarage.org/blog/most-basic-git-commands-with-examples)

## How to

### Create a branch

For example, to create a branch which branches of from master and with the name **mybranch** do the following:

```bash
git checkout master
git checkout -b mybranch
```

## Cheatsheet

`<parameter>` indicates a parameter you need to specify

**bold text** is used to show if the command connects to the remote or not

`repo` : is basically a folder, with files, which also contains the entire history of said folder. So a _git repo_ is basically a _git directory/folder_ i.e. a folder which contains the `.git` folder

> A repository (or repo) is simply a place where the history of your work is stored. It often lives in a .git subdirectory of your working copy - a copy of the most recent state of the files you're working on. --

`remote` : a remote repo, i.e. not local, which can be a repo stored on someone else's machine or even on github.com, gitlab.com, bitbucket.com.

`HEAD` : the checked out branch's most recent commit

### Help commands

`git help` : shows help regarding which commands are available

`git <command> help` : shows help of a specific command. for e.g. `git status help`

### Initializing commands

    > these commands is how to help set up a git repo

`git init` : initialises a directory to become a working git repository. It creates a `.git/` folder and allows git commands to function **local**

`git clone <ssh_url/https_url>` : get a repo from remote, initialises a directory for it (normally with the same name),sets your **remote** to the point to the cloned remote **remote -> local**

### Commiting commands - get stuff done

`git add <specific file/folder/or use an option>` : adds the file to the staging area, i.e. ready for committing. this is also the only command that can add files to the repo. **local**

`git commit -m <message>` : commit staged files with message. commit will also creates a git object in your history, with some labels attached to it, a unique hash etc. Every commit is unique, with its own unique ID, and they can never change (immutable) **local**

### Branching commands

`git branch <branchname>` : creates a branch from current HEAD with the name \<branchname> **local**

`git merge <branch>` : merge \<branch> into current branch, can fast-forward (by moving the label) or if needed can create a commit **local**

### Status commands

`git status` : shows status of local repo **local**

`git diff` : shows current changes **local**

`git log` : shows the history (commits) of your repo, the hashes of each commit, the HEADs of the branches, up to your latest commit **local**

`git log --graph --decorate --all` : shows a git log with committed objects connected

`git log --oneline` : shows a git log with committed objects connected

### Checkout commands

`git checkout <branchname>` : checks out that branch i.e. moves the HEAD to that branch's label, commits following this command will be added to the checked out branch, and it also updates your working directory **local**

`git checkout -- .` : disregard local changes **local**

`git checkout -b <branch>` : creates new branch \<name> and checks it out that branch **local**

### Working with others - Syncing commands

`git push` : syncs to remote (typically called origin) **local -> remote**

`git fetch` : get state from remote **remote -> local**

`git pull` : syncs from remote (typically called origin) **remote -> local**

### Modifying where your local repo's remote points to

`git remote add <origin> <URL>` : adds a new remote called \<origin> which points to \<URL>

`git remote -v` : shows info about remote

### Fetch state from the remote

`git rebase <branch>` : replays your commit on \<branch\>

### Move the HEAD around:

`git reset --hard HEAD^` : moves the HEAD to the commit, one commit back from HEAD i.e. the previous commit, and hard says also do a checkout

### Tagging

`git tag v1.0 <hash>` : this will tag that commit with the `v1.0` lable. Do a `git push origin --tags` to push your tags to the remote

## Github

- Forking a repo:
  This will copy a repo to your own github account, which you can clone.
  - This will allow you to work without having direct access to the repo.
  - Any changes you want to propose, will have to be done via a PR
