## Git Cheatsheet

- `<parameter>` indicates a parameter you need to specify
- **bold text** is used to show if the command connects to the remote or not

`repo` : is basically a folder, with files, which also contains the entire history of said folder. So a *git repo* is basically a *git directory/folder* i.e. a folder which contains the `.git` folder

>A repository is simply a place where the history of your work is stored. It often lives in a .git subdirectory of your working copy - a copy of the most recent state of the files you're working on. --

`HEAD` : the most recent commit

`git status` : shows status of local repo **local**

`git branch <branchname>` : creates a branch from current HEAD with the name \<branchname> **local**

`git checkout -- .` : disregard local changes **local**

`git checkout <branchname>` : checks out that branch **local**

`git checkout -b <branch>` : creates new branch \<name> and checks it out that branch **local**

`git add <specific file/folder/or use an option>` : adds the file to the staging area, i.e. ready for committing **local**

`git commit -m <message>` : commit staged files with message **local**

`git diff` : shows current changes **local**

`git merge <branch>` : merge \<branch> into current branch **local**

`git remote add <origin> <URL>` : adds a new remote called \<origin> which points to \<URL>

`git remote -v` : shows remote info

`git push` : syncs to remote (typically called origin) **local -> remote**

`git pull` : syncs from remote (typically called origin) **remote -> local**

`git clone <ssh_url/https_url>` : get a repo from remote, sets your **remote** to the cloned remote, can affect original by pushing directly **remote -> local**

`git fetch` : get state from remote **remote -> local**

`git rebase <branch>` : replays your commit on \<branch\>

## Github
- Forking a repo:
This will copy a repo to your own github account, which you can clone.
   - This will allow you to work without having direct access to the repo.
   - Any changes you want to propose, will have to be done via a PR