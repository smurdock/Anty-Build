Struts Recipes Code Sample

Please see the link to the book at http://www.manning.com/franciscus

This download is the code base used in recipe 1.1 "Use Ant to automatically build a Struts Project".

Instructiions 
1. Install Ant and verify its installed properly.
2. Unzip this file to any directory
3. change the build properties file with the name of your smtp server and email address

smtphost=smtp.mycompany.com
fromaddress=user@mycompany.com
toaddress=user@mycompany.com

4. Type "ant" from {the directory in #2}/manning-struts-recipes-1.1-antbuild-20041204

If all went well you will see a message indicating a successful build. An email will be sent to the 
email address specified in #3.

Note: Make sure your firewall is not blocking your ability to send emails.