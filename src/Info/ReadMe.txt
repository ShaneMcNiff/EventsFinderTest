Instructions for use
-If you are importing the project with the packages included, just ruin the Run file as normal
-If you are running from the cmd, just run the Run file, but this version does not include the packages
-When running the Run file, it will ask you to enter two coordinates using the command line, the x and then the y, I haven't set up input validation so only integers will work

Assumptions
-I have created multiple prices for each event just to show that there is a cheaper price
-I have only created ten events but it can handle as many as you want, just change the length of the loop in the World object

Notes
-Developed in NetBeans using Java
-There are two versions - one as a NetBeans project with Packages included, the other is just the source files with no packages

How might you change your program if you needed to support multiple events at the same location?
-If multiple events could be held in the same location, I would probably just include a time of event and a duration of event, that way you can tell them apart and tell the
user if they can make to all of the events in time.

How would you change your program if you were working with a much larger world size?
-The bubble sort would probably not be efficient enough when it comes to sorting all of the events by distance, assuming with a much larger world there will be more events. There
is a way of creating a custom sort using collections.sort with custom objects which would be much more efficient but was kind of overkill for this problem.