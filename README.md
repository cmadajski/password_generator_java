# Password Generator
A basic Java script used to generate pseudo-random passwords that conform to the typical password requirements you would find on most modern websites
(greater than 8 characters in length, one special character, one uppercase character, no common sequences, etc).

I use this to generate passwords for myself on a regular basis. Using an alias makes it easy to run it in 10 keystrokes or less, and the
additional security gained from the default 24 character length is tremendous. I use Git Bash when running Windows or Bash when using Linux (usually
Ubuntu/PopOS), so the command set up is usually the same. Just edit your .bashrc to include an alias for running the script. I typically use 
```nano ~/.bashrc``` to edit the Bash config and create an alias like this: ```alias passgen="java -cp /path/to/java/class/files ClassContainingMain"```.

Once the alias is set up, you can either generate a password of default length (set to 24 char) or of custom length (```passgen 32``` would output
32 char).

I know LastPass, Google, and other services have functions to do pseudo-random password generation as well, but this was a fun little project to
mess around with and the satisfaction of producing your own utility is great.
