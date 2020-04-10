# Becoming a dev

If you don't have any programming background, it is RECOMMENDED to go through and understand the **First steps**

- [Becoming a dev](#becoming-a-dev)
  - [First steps (Reading and Understanding)](#first-steps-reading-and-understanding)
  - [Cheatsheets - Reference sheets](#cheatsheets---reference-sheets)
  - [TO DO](#to-do)
    - [Tutorial - A guided exercise](#tutorial---a-guided-exercise)
    - [Questions - You can submit them back to test your understanding](#questions---you-can-submit-them-back-to-test-your-understanding)
    - [Tasks - Getting your hands dirty](#tasks---getting-your-hands-dirty)
- [Things in a dev's world](#things-in-a-devs-world)
  - [Tools](#tools)
    - [IDE (Integrated Development Editor)](#ide-integrated-development-editor)
    - [Text Editors](#text-editors)
- [Other useful things to learn](#other-useful-things-to-learn)
  - [Markdown](#markdown)
  - [p5 - javascript library - fun](#p5---javascript-library---fun)

## First steps (Reading and Understanding)

1. [How a computer works](./1-getting-started-with-programming/1-How-a-computer-works.md)
1. [Basic programming building blocks](./1-getting-started-with-programming/2-Basic-programming-building-blocks.md)

## Cheatsheets - Reference sheets

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

# Things in a dev's world

## Tools

Every dev has a favorite IDE or text editor.

### IDE (Integrated Development Editor)

IDEs are basically full-featured text editors, which allows a dev to create projects. They typically associated with a language, but with built-in (and add-on) tools to help debug, optimise, test etc. Typically they are offered in a free and a paid version.

- Intellij Idea (Java/Scala)
- Eclipse (Java/Scala)
- Visual Studio (C#)
- Xcode (Swift)
- PyCharm (Python)
- many others

### Text Editors

A text editor, is just that. Compared to IDE's they are simpler in that they can only edit text. But some editors's allows devs to import or extend the normal text editor's functionality, and therefore they can become very capable coding tools. They are typically free.

- Visual Studio Code
- Emacs
- Atom
- Sublime Text
- Vim

# Other useful things to learn

## Markdown

Markdown is useful if you want to create documentation for your project. Perhaps you even want to capture your own notes, recipes, todo lists, journals etc. Markdown is useful because online git repos can render it. The documentation for this project was written in markdown.

The default extension for markdown files are `.md`

- [markdownguide](https://www.markdownguide.org/basic-syntax)
- [github's markdown guide](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

## p5 - javascript library - fun

From their website:

> p5.js is a JavaScript library for creative coding, with a focus on making coding accessible and inclusive for artists, designers, educators, beginners, and anyone else! p5.js is free and open-source because we believe software, and the tools to learn it, should be accessible to everyone.

- [p5's website](https://p5js.org/)