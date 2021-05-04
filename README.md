# Kotlin Exam
I was given 3 Hours to complete a set amount of instructions 

##1.	Create a new Android Studio project 
a)	Name your project [FirstName][LastName][YourStudent#]Final 
b)	Choose the Empty Activity Template
c)	Commit and push your code to a private GitHub repo with the message “Initial Project Setup” 
d)	Make JaretWright a collaborator on the GitHub repo(1 mark)


##2.	Use your existing Firebase Project or Create a new Firebase Project
a)	Enable or Select the Firestore option (not Realtime Database)
b)	In the Project Overview, click Settings / Users and permissions / Add Member
c)	Choose Editor and add my Google account: jaret.s.wright@gmail.com
d)	Enable Google Authentication
e)	Use the Android Studio Firebase menu to connect your project to your database
f)	Commit and push your code to GitHub with the message “Challenge 2 – Firebase configured” (2 marks)


##3.	Create a Login Activity (3 marks)
a)	Add Google and email Login functionality (both must work)
b)	A successful login redirects user to the Main Activity ( 1 mark)
c)	An unsuccessful login produces a Toast stating it was unsuccessful and takes user back to the login activity (1 mark)
d)	Commit and push your code to GitHub with the message “Challenge 3 – Google sign in working”

 
##4.	After a successful login, the user should be directed to a view that has
a)	your name and “Bucket List” across the top (1 mark)
b)	the background should be a travel related image in webp format.  Do not copy my image, use your own.  It only needs to work for a phone in portrait orientation (2 marks)
c)	buttons and header should use a colour scheme that aligns with the background image (1 mark).  In the example below, the colour in the water was 41c2d1 and the sand was f4f5f7.  
d)	Push your code to GitHub with the message “Challenge 4-nice background complete”
 
 
##5.	Add a new bucket list item 
a)	When the user clicks on the “add new bucket list item” from the main activity, they should be taken to a view that allows them to enter information about new destinations.  The view should use the same background as the main activity. (2 marks)
b)	The scene should allow the user to enter a destination name, a brief description and choose a ranking from a dropdown list. (i.e. people would rank it in their top 10) (1 mark)
c)	If any of the fields do not have a value and the “add destination” button is pressed, show a toast stating all fields need to be populated (1 mark)
d)	If all the fields have a value, save the information to the firestore database and show a toast stating that the save was successful(2 marks)
e)	If the information was successfully stored, navigate the user back to the main activity.(1 mark)
f)	Push your code to GitHub with the message “Challenge 5-input form and Firestore saving complete”
 

##6.	In the main activity, if the user clicks on “View Bucket List” they should be redirected to a scene that is populated with a recycler view showing all of the destinations in the firestore database sorted from the rank 1 up to rank 10.
a)	The layout should have the same background image as the other activities (1 mark)
b)	The layout for the recycler view item should include the name, ranking and description of the destination.  You can decide on how to arrange those items to best display the info. (1 mark)
c)	Create a recycler adapter/view holder using live data from the Firestore DB (2 marks)
d)	Connect the recycler adapter/view 
e)	Have a floating action button that can return users to the main activity (1 mark)
f)	Push your code to GitHub with the message “Challenge 6-read/update from Firestore & RecyclerView complete”
