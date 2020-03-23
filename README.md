# Volantis

Repo to learn git, scala, scalatest, selenium and more...

## Getting started

1. Create your own github.com account
2. Fork this repo to your own account

To do these excercises, create a branch with the same name as the excercise (marked in **bold**). For example:

```bash
$ git checkout master
$ git checkout -b understand-git-commands
```

## Update your forked repo

1. Go to your repo on github
   > Navigate to github.com, and then find your volantis repo
1. Below your branch selector dropdown, you should see a message giving you information about the status of your current fork
   > For example: `This branch is 3 commits behind morneode:master`
1. Click on the "Pull request" to the right of this message
1. You should be directed to a page with the title `Comparing changes`
1. You should now wee this:
   `select: base repository:morneode/volantis, branch master <- from head repository:YOURNAME/volantis, branch master`
1. Click on base repository and change it to `YOURNAME/volantis`
1. After the page loads, click `compare accross forks`
1. Now change the head repository to `morneode/volantis`, and you should see:
   `select: base repository:YOURNAME/volantis, branch master <- from head repository:morneode/volantis, branch master`
1. Click `Create pull request`
1. Then give your PR a Title and maybe an Comment
1. Then click `Create pull request`
1. Then click `Merge pull request`, and then `Confirm merge`
1. You have updated your repo to be in sync with the latest Master Branch of `morneode/volantis`

## Excercises

1. GIT (tutorial): Getting started with git
   - Follow the steps in the tutorial `cheatsheets/git-tutorial.md`
1. GIT (questions): **understand-git-commands**
   - Have a look at the cheatsheet here `cheatsheets/git.md`
   - _Complete the questions_ by modifying and commiting the changes in `questions/understand-git-commands-questions.md`
1. SBT (questions): **understand-sbt-project-excercise**
   - Have a look at the cheatsheet here `cheatsheets/sbt.md`
   - _Complete the questions_ by modifying and commiting the changes in `questions/understand-sbt-project-excercise.md`
1. Scalatest (task): **add-scala-tests-for-functions-excercise**
   - Create more tests for the cubed function
   - Add tests for the multiply and add functions
   - _Complete this exercise_ by modifying and commiting the file `ToTestOrNotToTestSpec.scala`
1. Programming basics: Create some content on programming basics.  For example, that a language like Python is just semantics... the basic skills are in problem solving.  What kinds of skills do you need to solve problems?  For example being able to formulate an if statement, or loop through data... those things then become the kinds of commands you want to be able to write in computer language and each language will have its own way of doing that (the semantics)
