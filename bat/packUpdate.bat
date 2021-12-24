@echo off 
git archive -o %1_%2.zip %1 $(git diff %1 %2 --name-only)
