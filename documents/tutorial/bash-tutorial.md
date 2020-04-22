# Getting started with Bash

This is a tutorial to learn bash...

What is bash?

[According to their website:](https://www.gnu.org/software/bash/)

> GNU Bash or simply Bash is a Unix shell and command language written by Brian Fox for the GNU Project as a free software replacement for the Bourne shell.

Wait... What is a _shell_?

> At the simplest level, a shell is a program that allows you to control a computer, in this case, a Mac, using commands you enter with the keyboard. Shells are usually interactive text-based interfaces that accept commands and present the results. [click to read more](https://blog.macsales.com/56921-moving-from-bash-to-zsh-terminal-changes-in-macos-catalina/)

## What can I do with bash?

1. Is your terminal using bash?

   ```bash
   echo $SHELL
   ```

   > it should show `/bin/bash`

2. Make a folder

   ```bash
   mkdir -p ~/tmp/bash-tutorial
   ```

   > This command created a folder under your home directory, called _tmp_, and it also created a folder inside it, called _bash-tutorial_

3. Navigate to folders (also called directories)

   ```bash
   cd ~/tmp/bash-tutorial
   ```

> You have now changed your working directory to _~/tmp/bash-tutorial_

4. What is my current working directory? (where am I pointing at in my directory structure?)

   ```bash
   pwd
   ```

   > It should print out _~/tmp/bash-tutorial_

1. Open your finder in this directory

   ```bash
   open .
   ```

   > Finder will open and show you an empty directory... Can you see where this directory is on your computer? Tip: Look for something like: `Macintosh HD >`

1. Create an empty file

   ```bash
   touch NewFile.txt
   ```

   > You created a file in the working directory with the name _NewFile.txt_. You should see the newly created file in Finder.

1. List the current files and directories in the directory

   ```bash
   ls
   ```

   > The output should list your new file _NewFile.txt_

1. Edit the file

   ```bash
   vim NewFile.txt
   ```

   > You should see another application open in the terminal. This application is called **vim**.

   1. Type `i`. This will change vim's mode to `INSERT` (bottom left corner of your terminal).
   2. Type `a brown fox jumps over the fence`, and then hit the _ESC button_. You should see the `INSERT` disappear.
   3. Type `:wq` to save your file, and quit **vim**

1. In finder, double click the file to see if you can see your changes.

1. In the terminal, lets see if we can quickly see the contents of the file, without opening it in vim.

   ```bash
   cat NewFile.txt
   ```

1. You can copy your file

   ```bash
   cp NewFile.txt MyFile.txt
   ```

   > Check in your Finder if you can see your new file as well as the old file.
   > In your terminal, you can do the same, using the `ls` command.

1. Create a folder in your folder with the name `MyFolder`

   > Use the `mkdir` command

1. Move your file into your new folder

   ```bash
   mv MyFile.txt MyFolder/
   ```

   > Check in your Finder to see if your file has moved.
   > In your terminal, use the `ls` command to see if your file was moved.
   > You can also use `ls` to list anyother directory's contents. Try `ls MyFolder`

1. Make a file called `temporary.txt`

   > Use the `touch` command you've learned about

1. Copy the file and call the copied file `temporarycopy.txt`

1. Remove/Delete the file

   ```bash
   rm temporary.txt
   ```

   > Check in your Finder to see if the file was deleted
   > In your terminal, use `ls` to see if the file was deleted

1. Rename a file

   ```bash
   mv temporarycopy.txt temporary.txt
   ```

   > Check in your Finder to see if the file was renamed
   > In your terminal, use `ls` to see if the file was renamed

1. Move a file

   ```bash
   mv temporary.txt MyFolder/
   ```

   > Check in your Finder to see if the file was moved
   > In your terminal, use `ls` to see if the file was moved

## Extra commands

1. Reset the terminal

   ```bash
   reset
   ```

1. Quit a terminal program

   ```bash
   ^C - Control C - hard kill
   ^D - Control D - soft kill
   ```

1. List running applications on this computer

   ```bash
   ps
   ```

1. Find a file

   ```bash
   find - find a file
   locate - locate a file
   ```

1. Extra cd commands

   ```bash
     cd </some/directory/path>
     cd ~ #change to home directory
     cd / #change to the root directory
     cd /opt/ #change to /opt
   ```
