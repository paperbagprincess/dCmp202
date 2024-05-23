#!/bin/bash

# Optionally, add some terminal art for fun!
art_enabled="true"  # Set to "false" to disable art

if [[ "$art_enabled" == "true" ]]; then
  echo "       /\__/\ "
  echo "      / _ \  \ "
  echo "     ( o.o )"
  echo "     > ^ <  "
  echo "    /_   _\ "

  echo "       _.--""--._"
  echo "     .'       `. "
  echo "    /   o   o   \ "
  echo "   |          `._\ "
  echo "   |  .--""--.--. | "
  echo "   | |        | | | "
  echo "   | |-._  _.-| | | "
  echo "   | |  `-._.-' | | "
  echo "   |  `-----'  | | "
  echo "   \          / /  "
  echo "    `._  _.-' /    "
  echo "       `-'\         "

  
fi

echo "Enter the folder path:"
read folder_path

cd "$folder_path" || exit

echo "What files to add?"
echo "  (Enter a filename or '.' to add all)"

has_added=false

while true; do
  read file_or_dot

  if [[ "$file_or_dot" == "." ]]; then
    git add .
    has_added=true
    break
  elif [[ -z "$file_or_dot" ]]; then
    # Handle empty input gracefully
    echo "Please enter a filename or '.'"
  else
    git add "$file_or_dot"
    has_added=true
  fi
done

if ! $has_added; then
  echo "No files added. Exiting."
  exit 1
fi

echo "Enter a commit message:"
read commit_message

git commit -m "$commit_message"

echo "Enter the remote repository URL:"
read repo

git remote add origin "$repo"

git push -u origin main
