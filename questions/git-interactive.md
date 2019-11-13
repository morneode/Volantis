# Git Interactive Tutorial

1. Create a working directory. (`mkdir ~/tmp/git-tutorial`) and `cd ~/tmp/git-tutorial` into it

- Is this a git repo yet?

1. Do a `git checkout -b branch1`.

> Why did it fail? It failed because it is not a git repository... i.e. there is not `.git` folder in this directory...

1. Do a `git init`. This initialises the folder to be a git repo
1. Do a `git status`
1. Do a `git checkout -b branch1`. What happened? It created a new branch and it also checked it out.
1. Create a new file: `touch test.txt`
1. Do a `ls`. You should see your file listed
1. Do a `git status`. You should see that git also recognises the new file as an untracked file.
1. Let us stage the file. This means we are putting the file in the staging area, i.e. _ready to commit_. Do a `git add test.txt`
1. Do a `git status`. You should see that the file is now ready to be committed.
1. Let us commit the file. Do a `git commit -m "added a test.txt file"`. You should see the output `1 file changed ...`
1. Do a `git status`. The file should not be listed any more... You should see `Nothing to commit`
1. Edit the file `test.txt` by adding you name to it.
1. Do a `git status`. You should see that the file is listed as `modified`
1. Commit the file with a message that makes sense to you.
   > Why did it fail? `no changes added to commit`
1. Add your changes
1. Commit the file with a message that makes sense to you. And this time it should work
1. Checkout the master branch: `git checkout master`
1. List the files in the current directory: `
