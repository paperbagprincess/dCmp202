#!/bin/bash
folder_path = "/c/Users/BRC/Desktop/dCmp202"
cd "$folder_path" || exit
git add

echo "enter a commit message"
read commit
git commit -m "$commit"

echo "enter branch name"
read branch 
git push origin $branch