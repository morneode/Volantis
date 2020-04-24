# Getting started with Bash

## Have you ever seen a terminal?

![A Terminal](https://www.howtogeek.com/thumbcache/2/200/f5f162d5614c29a6e114429a33dd6088/wp-content/uploads/2013/03/linux-terminal-on-ubuntu.png)

A terminal is also called a console. You might be thinking, why do I want to learn how to use that? Developers use them daily to build their code, to find files, to structure data etc.

## Different shells/flavours for your terminal

There are many different shells that can be loaded into a terminal/console. Here are a few:

- zsh
- bash
- fish
- powershell
- cmd

![Cmd and Powershell](https://www.howtogeek.com/thumbcache/2/200/c2953043725aae745859858ffdf92192/wp-content/uploads/2017/08/pcp_top.png)

> In this tutorial, we will focus on bash. Bash is available on Linux, Mac and recently on Windows 10 as well.

## What is bash?

[According to their website:](https://www.gnu.org/software/bash/)

> GNU Bash or simply Bash is a Unix shell and command language written by Brian Fox for the GNU Project as a free software replacement for the Bourne shell.

## Wait... What is a _shell_?

> At the simplest level, a shell is a program that allows you to control a computer, in this case, a Mac, using commands you enter with the keyboard. Shells are usually interactive text-based interfaces that accept commands and present the results. [click to read more](https://blog.macsales.com/56921-moving-from-bash-to-zsh-terminal-changes-in-macos-catalina/)

## A few notes before we begin

- To use a terminal, you can type in commands, with parameters, and then hit the _ENTER button_ to execute the command.
- If a command was typed wrongly, the terminal will tell you that it doesn't understand the command.
- To facilitate with typing, most terminals also helps with completion, by hitting the _TAB button_ after you started typing the command or parameter.
- You can also use the _UP button_ to cycle through previous commands.

# Here is the tutorial

1. Is your terminal using bash? We can use the command below to make sure that it is a `bash shell`

   ```bash
   echo $SHELL
   ```

   > it should show `/bin/bash`

2. Make a folder

   ```bash
   mkdir -p ~/tmp/bash-tutorial
   ```

   > This command created a folder under your home directory, called _tmp_, and it also created a folder inside it, called _bash-tutorial_
   > Open Finder and navigate to your home directory. You should see the _tmp_ folder and in it you will see the _bash-tutorial_ folder

   > `~` means `YOUR HOME DIRECTORY`

   > This command can be split into 4x commands:
   >
   > - `cd ~`
   > - `mkdir tmp`
   > - `cd tmp`
   > - `mkdir bash-tutorial`

3. Navigate to folders (also called directories)

   ```bash
   cd ~/tmp/bash-tutorial
   ```

   > You have now changed your working directory to _~/tmp/bash-tutorial_

   > This command can be split into 3x commands:
   >
   > - `cd ~`
   > - `cd tmp`
   > - `cd bash-tutorial`

   > `cd` stands for `change directory`

4. What is my current working directory? (where am I pointing at in my directory structure?)

   ```bash
   pwd
   ```

   > It should print out _~/tmp/bash-tutorial_

   > `pwd` stands for `print working directory`

5. Open your finder in this directory

   ```bash
   open .
   ```

   > Finder will open and show you an empty directory... Can you see where this directory is on your computer? Tip: Look for something like: `Macintosh HD >`

6. Create an empty file

   ```bash
   touch NewFile.txt
   ```

   > You created a file in the working directory with the name _NewFile.txt_. You should see the newly created file in Finder.

7. List the current files and directories in the directory

   ```bash
   ls
   ```

   > The output should list your new file _NewFile.txt_

8. Edit the file

   ```bash
   vim NewFile.txt
   ```

   > You should see another application open in the terminal. This application is called **vim**. It is a text-editor for your terminal.

   1. Type `i`. This will change vim's mode to `INSERT` (bottom left corner of your terminal).
   2. Type `a brown fox jumps over the fence`, and then hit the _ESC button_. You should see the `INSERT` disappear.
   3. Type `:wq` to save your file, and quit **vim**

9. In finder, double click the file to see if you can see your changes.

10. In the terminal, lets see if we can quickly see the contents of the file, without opening it in **vim**.

    ```bash
    cat NewFile.txt
    ```

11. You can copy your file

    ```bash
    cp NewFile.txt MyFile.txt
    ```

    > Check in your Finder if you can see your new file as well as the old file.
    > In your terminal, you can do the same, using the `ls` command.

12. Create a folder in your folder with the name `MyFolder`

    > Use the `mkdir` command

13. Move your file into your new folder

    ```bash
    mv MyFile.txt MyFolder/
    ```

    > Check in your Finder to see if your file has moved.
    > In your terminal, use the `ls` command to see if your file was moved.
    > You can also use `ls` to list anyother directory's contents. Try `ls MyFolder`

14. Make a file called `temporary.txt`

    > Use the `touch` command you've learned about

15. Copy the file and call the copied file `temporarycopy.txt`

16. Remove/Delete the file

    ```bash
    rm temporary.txt
    ```

    > Check in your Finder to see if the file was deleted
    > In your terminal, use `ls` to see if the file was deleted

17. Rename a file

    ```bash
    mv temporarycopy.txt temporary.txt
    ```

    > Check in your Finder to see if the file was renamed
    > In your terminal, use `ls` to see if the file was renamed

18. Move a file

    ```bash
    mv temporary.txt MyFolder/
    ```

    > Check in your Finder to see if the file was moved
    > In your terminal, use `ls` to see if the file was moved

## If you want to do this tutorial again, just run the following command

1. Remove the `bash-tutorial` folder we created at the start of this tutorial

   ```bash
   rm -rf ~/tmp/bash-tutorial
   ```

## Extra commands

1. You can learn about bash by using your favorite search engine. For example just type `bash ls examples` OR `bash tutorial` into:

   1. [Google](https://www.google.com/)
   1. [DuckDuckGo](https://duckduckgo.com/)
   1. [Startpage](https://startpage.com/)

2. Reset the terminal. This is useful if your terminal are not showing you what you are typing.

   ```bash
   reset
   ```

3. Quit a terminal program

   ```bash
   ^C - Control C - hard kill
   ^D - Control D - soft kill
   ```

4. List running applications on this computer

   ```bash
   ps -ef
   ```

5. Find a file

   ```bash
   find - find a file
   locate - locate a file
   ```

6. Extra cd commands

   ```bash
    cd </some/directory/path>
    cd ~ #change to home directory
    cd .. #go one directory back
    cd ../.. #go two directories back
    cd ../../.. #go three directories back
    cd / #change to the root directory, the top most directory of your hard drive
    cd /opt/ #change to /opt
   ```

7. Zip files

   ```bash
   zip zippety.zip ~/tmp/bash-tutorial * # zip the folder, with all its files
   zip -r zippety.zip ~/tmp/bash-tutorial * # zip the folder, with all its files and sub directories
   unzip zippety.zip
   ```

8. Man pages and extra help when using commands

   ```bash
   man <command> # to learn more about any command
   <command> --help
   ```

## Extra links

- [difference between shell, console and terminal](https://fossbytes.com/difference-between-shell-console-terminal/)
- [different types of linux shells](https://www.tecmint.com/different-types-of-linux-shells/)
- [bash cheatsheet](https://cheatography.com/davechild/cheat-sheets/linux-command-line/)
- [another cheatsheet](https://ryanstutorials.net/linuxtutorial/cheatsheet.php)
