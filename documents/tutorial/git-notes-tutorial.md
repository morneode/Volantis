# Creating "your own notes" Git Repository

If you want to get started with GIT, its always a good idea to have your own space where you can experiment with it. This tutorial will show you how to create your own Notes Repository, where you can create and edit your own notes.

## Prerequisites

- You should have a github account
- [You should have added your SSH keys to github](https://help.github.com/en/github/authenticating-to-github/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent)

## Steps to create your own Repo on Github.com

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

Your repo has now been created on Github.com. You currently have no local copy of it yet.

## Clone your repo to your hard drive

You can now clone your repo to your local machine.

1. Open your Terminal
1. Create a working directory for all your git projects, for e.g. `~/github/` and `cd` into it
1. Execute the command `git clone git@github.com:<YOUR USERNAME>/<YOUR REPONAME>.git` in the current directory (which should be your created folder in the previous step)
   1. Select the GREEN drop down button on Github.com "Clone or download"
   2. Make sure to use the `Use SSH` URL. (The URL should look like `git@github.com:<YOUR USERNAME>/<YOUR REPONAME>.git`, i.e. it should NOT have a **https** in the URL)
   3. Copy the values in the text box and paste it after your `git clone` command
1. Hit ENTER to start downloading your project
1. When done, `cd` into your project

You have cloned your remote repo from Github.com, to your local machine. To work on your repo, you will be commiting to your local repo, and push your changes to your remote repo.

> Test your cloned repo by checking the status (`git status`):

```bash
On branch master
Your branch is up to date with 'origin/master'.

nothing to commit, working tree clean
```
