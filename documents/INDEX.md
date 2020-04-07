# Documents

If you don't have any programming background, it is RECOMMENDED to go through and understand the **First steps**

### First steps (Reading and Understanding)

1. [How a computer works](./1-getting-started-with-programming/1-How-a-computer-works.md)
1. [Basic programming building blocks](./1-getting-started-with-programming/2-Basic-programming-building-blocks.md)

### Cheatsheets - Reference sheets

1. [git-cheatsheet](./cheatsheets/git.md)
1. [sbt-cheatsheet](./cheatsheets/sbt.md)

## TO DO

### Tutorial - A guided exercise

To complete these tutorials, just follow the steps in the tutorial.

1. GIT (tutorial): Getting started with git
   - Follow the steps in the [git-tutorial](./tutorial/git-tutorial.md)

### Questions - You can submit them back to test your understanding

To answer these questions, create a branch with the same name as the excercise (marked in **bold**). For example:

```bash
$ git checkout master
$ git checkout -b understand-git-commands
```

And then you can edit the quesion's `.md` file and commit and push it when you are done.

1. GIT (questions): **understand-git-commands**
   - Have a look at the [git-cheatsheet](./cheatsheets/git.md)
   - _Complete the questions_ by modifying and commiting the changes in [git-questions](./questions/understand-git-commands-questions.md)
1. SBT (questions): **understand-sbt-project-excercise**
   - Have a look at the [sbt-cheatsheet](./cheatsheets/sbt.md)
   - _Complete the questions_ by modifying and commiting the changes in [sbt-questions](./questions/understand-sbt-project-excercise.md)

### Tasks - Getting your hands dirty

To do these tasks, create a branch with the same name as the excercise (marked in **bold**). For example:

```bash
$ git checkout master
$ git checkout -b understand-git-commands
```

And then you can complete the task. Commit and push it when you are done.

1. Scalatest (task): **add-scala-tests-for-functions-excercise**
   - Create more tests for the cubed function
   - Add tests for the multiply and add functions
   - _Complete this exercise_ by modifying and commiting the file [ToTestOrNotToTestSpec.scala](../src/test/scala/ToTestOrNotToTestSpec.scala)
