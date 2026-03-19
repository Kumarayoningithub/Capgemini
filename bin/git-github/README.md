# 🚀 Git Basic Workflow Guide

This guide explains the basic Git commands used to connect a local project with GitHub and manage code versions.

---

## 🔧 1. Configure Git (Only once per system)

```bash
git config --global user.name "Ayon Kumar Saha"
git config --global user.email "ayon@example.com"
git config --list
```

- `git config --global user.name` → Sets your GitHub username  
- `git config --global user.email` → Sets your GitHub email  
- `git config --list` → Displays the current Git configuration  

---

## 📁 2. Initialize a Git Repository

```bash
git init
```

- Creates a new Git repository in your project folder.

---

## 📦 3. Add Files to Staging Area

Add all files:

```bash
git add .
```

or

```bash
git add --all
```

Add a specific file:

```bash
git add filename.java
```

- Adds files to the staging area before committing.

---

## 💾 4. Commit the Changes

```bash
git commit -m "First Commit"
```

- Saves the staged changes to Git history.

---

## 🔗 5. Connect Local Repository to GitHub

```bash
git remote add origin https://github.com/Kumarayoningithub/CgGitPractice.git
```

- Connects your local project to the GitHub repository.

---

## ⬆️ 6. Push Code to GitHub (First Time)

```bash
git push -u origin main
```

- `origin` → Remote repository name  
- `main` → Default branch name  

---

## 📊 7. Check Repository Status

```bash
git status
```

Shows:

- Modified files  
- Staged files  
- Untracked files  

---

## 🔄 8. Update Code After Changes

```bash
git add .
git commit -m "Updated the code"
git push
```

- Adds new changes  
- Commits the update  
- Pushes changes to GitHub  

---

## ⬇️ 9. Pull Latest Code from GitHub

```bash
git pull
```

- Downloads and merges the latest changes from GitHub to your local repository.

---

## ⚡ Simple Daily Git Workflow

```bash
git add .
git commit -m "message"
git push
```

---

## 👨‍💻 Author

**Ayon Kumar Saha**  
GitHub: https://github.com/Kumarayoningithub
