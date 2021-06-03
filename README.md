# HelloWorldJUnit
![image](https://user-images.githubusercontent.com/54456351/119812273-d3a65100-be9c-11eb-9c53-326b5fc460c3.png)

After committing/uploading your Java files. Click "Actions" to see the report. \
When committing, GitHub will ask you to enter a message. It helps to easily understand why a change has been made at a particular time and distinguish between each commission.\
![image](https://user-images.githubusercontent.com/54456351/119812799-66df8680-be9d-11eb-8fec-24645619be13.png)
<br />
<br />


## Action
This is the action page:\
![image](https://user-images.githubusercontent.com/54456351/119814197-fc2f4a80-be9e-11eb-86ad-00f6c5b5d238.png) <br />
The workflow are your commissions from newest to latest. \
Click on the one that you want to see the report. <br /> <br />
This means the workflow is in progress, and you have to wait until it changes the status.\
![image](https://user-images.githubusercontent.com/54456351/119813577-51b72780-be9e-11eb-8449-c84e2850f125.png) <br /> <br /> <br />

This means the workflow is failed. You can see your details in the reports inside it.\
![image](https://user-images.githubusercontent.com/54456351/119813655-65628e00-be9e-11eb-8c27-8b42a9e71304.png) <br /> <br /> <br />

This means the workflow is passed, but you should check the reports to check your code style is good enough and any misspell occurs.\
![image](https://user-images.githubusercontent.com/54456351/119813818-95119600-be9e-11eb-82e5-d247541062cb.png) <br /> <br /> <br />
This is the workflow's details:\
![image](https://user-images.githubusercontent.com/54456351/119811221-b7ee7b00-be9b-11eb-933a-05b0733ba569.png) <br />


### Test Report
![image](https://user-images.githubusercontent.com/54456351/119812525-15cf9280-be9d-11eb-8125-f24d61ebd43b.png) <br />
The Test Report shows the result of how many test cases that are passed, failed, or skipped.
- Click "Test Report" for the report of test cases
- Don't worry about "Build Step." It will be red if any test case failed.


### checkstyle
![image](https://user-images.githubusercontent.com/54456351/119812559-1ec06400-be9d-11eb-907d-e1b71a97a447.png) <br />
![image](https://user-images.githubusercontent.com/54456351/119814435-3f89b900-be9f-11eb-8578-2272566be21c.png) <br />

Checkstyle is a tool for checking Java source code for adherence to the Google Java Style Guide.\
Click "checkstyle" to view the report. The report should look like this:
![image](https://user-images.githubusercontent.com/54456351/120709943-5ec1b100-c472-11eb-93a1-1aafa7de830a.png) <br />
<br /> <br /> <br />
You can access each code line violating the coding standard through "Findings(37)"
![image](https://user-images.githubusercontent.com/54456351/120710983-b01e7000-c473-11eb-873d-e57b75aeab5c.png) <br />

The following is some comments you might find in the report:
- **"'method def modifier' has incorrect indentation level 4, expected level should be 2."** Google style uses an indentation of 2 spaces, but most IDEs use 4 spaced indentation. Therefore, if you want to use 4 spaced indentation, you can ignore this comment.
- "Line is longer than 100 characters (found 109)." A normal computer screen cannot show more than 100 characters horizontally. The long line should be broken into shorter lines to ensure readability. 
- "'{' at column 5 should be on the previous line." '{' should not be in a new line. For example,  <br />
if (condition) {  <br />
    statement; <br />
}
- "'if' construct must use '{}'s." Even when you only have 1 statement in your constructor, you should uses '{}' 
- "Only one statement per line allowed." Code should only have 1 statement per line for readability.
- "WhitespaceAround: '=' is not preceded with whitespace" and "WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)" There should be a space before and after '+', '-', '*', '/', '=', '<', '>', ... ';' should be followed by a space if there is anything after it
